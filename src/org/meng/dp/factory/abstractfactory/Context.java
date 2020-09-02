package org.meng.dp.factory.abstractfactory;

/**
 * 定义一个生产一个产品族的工厂,在扩展一系列产品时候只需要添加产品族的实现和工厂的实现即可
 * <p>
 * 从写法来上看或许和策略模式有所类似,即多态.事实上面向对象的三个特征最重要的就是多态,很多设计模式是基于多态的.
 * 而策略模式和抽象工厂的根本区别在于策略模式是做某个行为,抽象工厂则是生产一批对象过程的封装,emm,whatever...
 * <p>
 * 抽象工厂被放在创建型模式里面，主要目的是为了创建对象
 * 而策略模式被放在行为型模式里面，主要目的抽取抽象的行为
 * 所以抽象工厂往往抽取的是同一基类（class）的不同子类
 * 而策略模式往往抽取的是同一接口的不同实现。
 *
 * @author meng
 */
public class Context {
    public static void main(String[] args) {
        FizzFactory fizzFactory = new DefaultFizzFactory();
        Fizz fizz = new Fizz(fizzFactory);
        fizz.ultimate();

        fizz = new Fizz(new HnlsFizzFactory());
        fizz.ultimate();
        fizz = new Fizz(new GalaxyFizzFactory());
        fizz.ultimate();
    }
}
