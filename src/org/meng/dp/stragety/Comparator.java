package org.meng.dp.stragety;

/**
 * @author meng
 */
public interface Comparator<T> {

    /**
     * 比较
     *
     * @param a 前一个
     * @param b 后一个
     * @return a<b - 1 ; a = b 0 ; a>b 1
     */
    int compare(T a, T b);

}
