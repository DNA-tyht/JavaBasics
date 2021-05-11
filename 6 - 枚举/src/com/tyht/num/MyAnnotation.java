package com.tyht.num;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/31 22:09
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD})
@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {
    String value() default "hello";
}
