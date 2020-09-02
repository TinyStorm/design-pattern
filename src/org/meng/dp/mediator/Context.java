package org.meng.dp.mediator;

/**
 * 调停者模式
 *
 * @author meng
 */
public class Context {

    public static void main(String[] args) {
        Mediator mediator = new Manager();
        Colleague a = new ColleagueA(mediator, "wm");
        Colleague b = new ColleagueB(mediator, "xyz");
        a.send("SB", b);
    }
}

abstract class Colleague {
    private Mediator mediator;
    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void receive(Colleague colleague, String msg) {
        System.out.printf("%s receive msg[%s] from %s%n", this.name, msg, colleague.name);
        handle(msg, colleague);
    }

    public void send(String msg, Colleague colleague) {
        System.out.printf("%s send msg[%s] to %s%n", this.name, msg, colleague.name);
        mediator.coordinate(msg, this, colleague);
    }

    /**
     * 不同的同事对命令有不同的表现
     *
     * @param msg 消息
     */
    public abstract void handle(String msg, Colleague colleague);

}

class ColleagueA extends Colleague {
    public ColleagueA(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void handle(String msg, Colleague colleague) {
        System.out.printf("%s handle this msg[%s]%n", this.getName(), msg);
    }
}

class ColleagueB extends Colleague {

    public ColleagueB(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void handle(String msg, Colleague colleague) {
        System.out.printf("%s handle this msg[%s]%n", super.getName(), msg);
        if ("SB".equals(msg)) {
            super.send("滚", colleague);
        }

    }
}

interface Mediator {
    /**
     * 协调
     *
     * @param msg 消息
     * @param a   同事a
     * @param b   同事b
     */
    public void coordinate(String msg, Colleague a, Colleague b);
}

class Manager implements Mediator {

    @Override
    public void coordinate(String msg, Colleague a, Colleague b) {
        System.out.printf("coordinate msg[%s] from [%s] to [%s]%n", msg, a.getName(), b.getName());
        b.receive(a, msg);
    }
}