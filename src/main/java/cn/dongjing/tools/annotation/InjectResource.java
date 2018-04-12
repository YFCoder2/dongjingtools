package cn.dongjing.tools.annotation;

import java.lang.annotation.*;

/**
 * Created by huangzhiwei on 2018/4/12.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InjectResource {
    /**
     * 资源名称
     *
     * @return
     */
    String name();

    /**
     * 资源url
     *
     * @return
     */
    String url() default "NULL";

    /**
     * 请求方式 默认post
     * @return
     */
    String methodType() default "POST";



}

