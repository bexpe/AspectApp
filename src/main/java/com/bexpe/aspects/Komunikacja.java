package com.bexpe.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Komunikacja {

    @Pointcut("args(argumentInt)")
    public void pointcutInt(int argumentInt) {}

    @Pointcut("target(com.bexpe.api.IKucharz)")
    public void pointcutTarget(){
    }

    @Pointcut("@target(annotation)")
    public void pointcutTargetAnnotation(Deprecated annotation){
    }

    @Pointcut("within(com.bexpe.impl.Kucharz)")
    public void pointcutWithin(){
    }

    @Before("pointcutWithin()")
    public void porada() {
        System.out.println("PORADA ");
    }

//    @After("execution(* com.bexpe.api.IKucharz.pobierzSkladnikiZMagazynu(..))")
//    public void poinformujOPobraniuSkladnikow() {
//        System.out.println("pobrano skladniki");
//    }
//
//    @Around("execution(* com.bexpe.api.IKucharz.wydajPizze(..))")
//    public void wydaniePizzy(ProceedingJoinPoint joinPoint) {
//        try {
//            System.out.println("Pizza jest gotowa do wydania");
//            joinPoint.proceed();
//            System.out.println("Wydano pizze");
//
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }
//    }
}
