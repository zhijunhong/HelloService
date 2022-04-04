package org.example.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {
    public String name = "zhijunhong";
    String name() default "hello";
}

class Test{
    @MyAnnotation(name="spring boot")
    private String name;

    @MyAnnotation
    public void hello() {

    }
}
