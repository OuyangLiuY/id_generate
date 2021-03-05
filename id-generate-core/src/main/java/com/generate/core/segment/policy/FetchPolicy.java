package com.generate.core.segment.policy;

import java.math.BigDecimal;

public interface FetchPolicy {

    /**
     *  是否开启 threadLocal 缓存
     * @return
     */
    boolean threadLocalCacheEnabled();

    /**
     * 缓存拉取的数量
     * @param key
     * @return
     */
    int threadLocalFetchSize(String key);

    int segmentFetchSize(String key);

    BigDecimal nextSegmentFetchPercent(String key);
}
