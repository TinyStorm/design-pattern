package org.meng.dp.factory.method;

/**
 * @author meng
 */
public class YasuoFactory extends HeroFactory {
    @Override
    public Hero create() {
        return new Yasuo();
    }
}

/**
 * @author meng
 */
class Yasuo extends Hero {

    public Yasuo() {
        System.out.println("死亡如风,常伴吾身");
    }

    @Override
    public void ultimate() {
        System.out.println("狂风觉息斩");
    }
}
