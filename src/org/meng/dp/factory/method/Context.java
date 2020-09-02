package org.meng.dp.factory.method;

/**
 * 所谓工厂方法是解决产品的扩展
 * 定义好工厂和生产流程,那么新增加一个产品只需要去添加新的产品和工厂即可扩展
 * 可以认为是抽象工厂的一种特例--只生产一种产品的抽象工厂
 *
 * @author meng
 */
public class Context {

    public static void main(String[] args) {

        HeroFactory heroFactory = new RivenFactory();
        heroFactory.create().ultimate();
        heroFactory = new YasuoFactory();
        heroFactory.create().ultimate();

    }
}
