package org.meng.dp.stragety;

/**
 * 可比较接口
 * @author meng
 */
public interface Comparable<T> {
    /**
     * 比较策略
     * @param obj 待比较对象
     * @return 比较结果
     */
    int compare(T obj);
}
