package com.springboot.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

/**
 * @author heshiyuan
 * @author shiyuan2he
 * @description <p>定义注解</p>
 * @path spring-boot/com.springboot.aop
 * @date 2017/4/10 下午11:22
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ActionLog {
    boolean isRecordArgs() default true;

    boolean isRecordReturn() default true;

    String description();

    ActionLog.RecordStrategy recordStrategy() default ActionLog.RecordStrategy.ALL;
    public static enum RecordStrategy {
        ALL,
        EXCEPTION;
        private RecordStrategy() {}
    }
}
