package org.meng.dp.stragety;

import java.util.Arrays;

/**
 * @author meng
 */
public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat(4),
                new Cat(3),
                new Cat(2),
                new Cat(5)
        };

        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(cats,new CatHeightComparator());
        System.out.println(Arrays.toString(cats));


    }
}
