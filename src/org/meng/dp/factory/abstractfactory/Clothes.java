package org.meng.dp.factory.abstractfactory;

public abstract class Clothes {
    public abstract void show();
}

class RainCoat extends Clothes{

    @Override
    public void show() {
        System.out.println("小黄帽,黄色大雨衣");
    }
}

class Necked extends Clothes{

    @Override
    public void show() {
        System.out.println("裸体");
    }
}

class Armed extends Clothes{

    @Override
    public void show() {
        System.out.println("机械战甲");
    }
}

class PurpleSkin extends Clothes{
    @Override
    public void show() {
        System.out.println("虚空紫色皮肤");
    }
}