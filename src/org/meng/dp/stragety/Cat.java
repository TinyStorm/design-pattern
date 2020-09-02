package org.meng.dp.stragety;

/**
 * @author meng
 * Comparable接口对类有入侵,且非自己维护的类无法实现
 * 采用Comparator比较器
 */
public class Cat implements Comparable<Cat> {

    private int height;
    private int weight;

    public Cat(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compare(Cat cat) {
        return this.height - cat.height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
