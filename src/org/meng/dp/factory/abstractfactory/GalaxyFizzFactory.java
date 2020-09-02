package org.meng.dp.factory.abstractfactory;

/**
 * @author meng
 */
public class GalaxyFizzFactory extends FizzFactory{
    @Override
    public Pet createFish() {
        return new SharkPepper();
    }

    @Override
    public Clothes createClothes() {
        return new Armed();
    }

    @Override
    public Weapon createWeapon() {
        return new ArmedSxj();
    }
}
