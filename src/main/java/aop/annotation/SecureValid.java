package aop.annotation;

import java.lang.annotation.*;

/**
 * Created by eason on 2017/4/27.
 */
/*
 * 校验签名合法性 自定义事务
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface SecureValid {
    String desc() default "身份和安全验证开始...";
}