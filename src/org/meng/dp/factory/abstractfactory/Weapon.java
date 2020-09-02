package org.meng.dp.factory.abstractfactory;

public abstract class Weapon {
    public abstract void attack();
}

class Hssxj extends Weapon{

    @Override
    public void attack() {
        System.out.println("海石三叉戟攻击肉体");
    }
}
class Xksxj extends Weapon{

    @Override
    public void attack() {
        System.out.println("虚空三叉戟攻击灵魂");
    }
}

class ArmedSxj extends Weapon{

    @Override
    public void attack() {
        System.out.println("武装三叉戟摧毁一切");
    }
}
