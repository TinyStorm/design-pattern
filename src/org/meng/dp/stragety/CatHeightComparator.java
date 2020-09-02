package org.meng.dp.stragety;

/**
 * 比较策略
 * @author meng
 */
public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat a, Cat b) {
        return a.getHeight() - b.getHeight();
    }
}
