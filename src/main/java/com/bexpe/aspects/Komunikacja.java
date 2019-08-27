package com.bexpe.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Komunikacja {

    @After("execution(* com.bexpe.api.IKucharz.pobierzSkladnikiZMagazynu(..))")
    public void poinformujOPobraniuSkladnikow() {
        System.out.println("pobrano skladniki");
    }

    @Around("execution(* com.bexpe.api.IKucharz.wydajPizze(..))")
    public void wydaniePizzy(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Pizza jest gotowa do wydania");
            joinPoint.proceed();
            System.out.println("Wydano pizze");

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
