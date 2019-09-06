package com.bexpe.kurs4;

import com.bexpe.api.ICook;
import com.bexpe.api.ICasserole;
import com.bexpe.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ICook k = (ICook) context.getBean("cook");
        ((ICasserole)k).prepareCasserole();
    }
}
