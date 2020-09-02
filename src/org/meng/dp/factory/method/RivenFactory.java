package org.meng.dp.factory.method;

/**
 * @author meng
 */
public class RivenFactory extends HeroFactory {

    @Override
    public Hero create() {
        return new Riven();
    }
}

class Riven extends Hero {

    public Riven() {
        System.out.println("断剑重铸之日,骑士归来之时");
    }

    @Override
    public void ultimate() {
        System.out.println("放逐之锋");
    }
}
