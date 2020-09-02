package org.meng.dp.factory.abstractfactory;

/**
 * @author meng
 */
public class HnlsFizzFactory extends FizzFactory {
    @Override
    public Pet createFish() {
        return new HnPet();
    }

    @Override
    public Clothes createClothes() {
        return new RainCoat();
    }

    @Override
    public Weapon createWeapon() {
        return new Hssxj();
    }
}
