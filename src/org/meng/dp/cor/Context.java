package org.meng.dp.cor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 责任链模式
 * 下面模拟servlet过滤器 spring拦截器的设计
 * <p>
 * <p>
 * 也可以将链条实现Filter,实现链条之间的连接
 * 接口可返回boolean 决定是否继续执行
 *
 * @author meng
 */
public class Context {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.add(new SensitiveFilter()).add(new FaceReplaceFilter())
                .add((request, response, filterChain1) -> {
                    request.setMsg(request.getMsg().replaceAll("<", "[").replace(">", "]"));
                    filterChain1.doFilter(request, response);
                    System.out.println("custom");
                    response.setMsg(response.getMsg() + "[no name] ");
                });
        Request request = new Request("hello <script>this is script :)</script> 我们都是 996");
        Response response = new Response("");
        filterChain.doFilter(request, response);
        System.out.println(request.getMsg());
    }
}


interface Filter {
    /**
     * 处理请求
     *
     * @param request     请求对象
     * @param response    响应对象
     * @param filterChain 处理链
     */
    void doFilter(Request request, Response response, FilterChain filterChain);
}

class FilterChain {
    List<Filter> filters = new ArrayList<>();
    Iterator<Filter> filterIterator;

    public void doFilter(Request request, Response response) {
        if (filterIterator == null) {
            filterIterator = filters.iterator();
        }
        while (filterIterator.hasNext()) {
            filterIterator.next().doFilter(request, response, this);

        }
    }

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }
}

class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String msg = request.getMsg();
        request.setMsg(msg.replace("996", "955"));
        filterChain.doFilter(request, response);
        System.out.println("sensitive");
        response.setMsg(response.getMsg() + "[sensitive] ");
    }
}

class FaceReplaceFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String msg = request.getMsg();
        request.setMsg(msg.replace(":)", "^V^"));
        filterChain.doFilter(request, response);
        System.out.println("face");
        response.setMsg(response.getMsg() + "[face] ");
    }
}

class Request {
    private String msg;

    public Request(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

class Response {
    private String msg;

    public Response(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "msg='" + msg + '\'' +
                '}';
    }
}


class Msg {
}

/**
 * 第二种实现
 */
interface Processor {
    /**
     * 链条处理
     *
     * @param msg 消息
     * @return 是否继续处理
     */
    boolean process(Msg msg);
}

class ProcessChain implements Processor {

    List<Processor> processors = new ArrayList<>();

    @Override
    public boolean process(Msg msg) {
        return false;
    }

    public ProcessChain add(Processor processor) {
        processors.add(processor);
        return this;
    }
}

class FirstProcessor implements Processor {

    @Override
    public boolean process(Msg msg) {
        System.out.println(msg);
        return true;
    }
}