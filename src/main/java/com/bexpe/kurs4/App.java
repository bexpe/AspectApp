package com.bexpe.kurs4;

import com.bexpe.api.IKucharz;
import com.bexpe.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IKucharz k = context.getBean(IKucharz.class);
        k.pobierzSkladnikiZMagazynu();
        k.przygotujPizze();
        k.wydajPizze();
    }
}
