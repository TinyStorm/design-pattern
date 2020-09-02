package org.meng.dp.factory.abstractfactory;

/**
 * @author meng
 */
public class Fizz {
    private Pet pet;
    private Clothes clothes;
    private Weapon weapon;

    public Fizz(FizzFactory fizzFactory) {
        clothes = fizzFactory.createClothes();
        weapon = fizzFactory.createWeapon();
        pet = fizzFactory.createFish();
    }

    public void ultimate() {
        System.out.println("喂鱼时间到啦");
        pet.eat();
        clothes.show();
        weapon.attack();
    }
}
