package org.meng.dp.factory.method;

/**
 * 用于身缠lol里的英雄
 * @author meng
 */
public abstract class HeroFactory {
    /**
     * 创建英雄
     * @return 英雄
     */
    public abstract Hero create();
}
