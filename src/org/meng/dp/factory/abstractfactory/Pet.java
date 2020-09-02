package org.meng.dp.factory.abstractfactory;

public abstract class Pet {
    public abstract void eat();
}

class HnPet extends Pet {
    @Override
    public void eat() {
        System.out.println("海牛吃草");
    }
}
class Shark extends Pet{
    @Override
    public void eat() {
        System.out.println("鲨鱼吃鱼");
    }
}

class SharkPepper extends Pet{
    @Override
    public void eat() {
        System.out.println("鲨鱼辣椒吃汽油");
    }
}