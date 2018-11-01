package com.fourstars.pickstars.util;

public class Preconditions {
    /**
     * 为对象进行非空判断
     *
     * @param reference 需要进行判断的对象
     * @param <T>       对象的类型
     * @return 为空则抛出空指针异常, 正常则返回原对象
     */
    public static <T> T checkNotNull(T reference) {
        if (reference == null)
            throw new NullPointerException("引用对象指向Null");

        return reference;
    }

    public static <T> T checkNotNull(T reference, String exceptionDes) {
        if (reference == null)
            throw new NullPointerException(exceptionDes);

        return reference;
    }
}
