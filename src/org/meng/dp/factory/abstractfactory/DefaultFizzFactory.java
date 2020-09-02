package org.meng.dp.factory.abstractfactory;

/**
 * @author meng
 */
public class DefaultFizzFactory extends FizzFactory {

    @Override
    public Pet createFish() {
        return new Shark();
    }

    @Override
    public Clothes createClothes() {
        return new Necked();
    }

    @Override
    public Weapon createWeapon() {
        return new Hssxj();
    }
}
