package org.meng.dp.stragety;

/**
 * 排序 相当于Context
 * @author meng
 */
public class Sorter<T> {

    /**
     *
     * @param array 代排序数据
     * @param c 相当于Strategy,提供可扩展的策略
     */
    public void sort(T[] array, Comparator<T> c) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (c.compare(array[i], array[j]) < 0) {
                    swap(array,i,j);
                }
            }
        }

    }

    private void swap(T[] array, int i, int j) {
        T tmp = array[i];
        array[i]=array[j];
        array[j]=tmp;
    }


}
