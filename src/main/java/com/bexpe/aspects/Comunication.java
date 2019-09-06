package com.bexpe.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Comunication {

    @Pointcut("args(argumentInt)")
    public void pointcutInt(int argumentInt) {}

    @Pointcut("target(com.bexpe.api.ICook)")
    public void pointcutTarget(){
    }

    @Pointcut("@target(annotation)")
    public void pointcutTargetAnnotation(Deprecated annotation){
    }

    @Pointcut("within(com.bexpe.impl.Cook)")
    public void pointcutWithin(){
    }

    @Before("pointcutWithin()")
    public void advice() {
        System.out.println("advice ");
    }

    @After("execution(* com.bexpe.api.ICook.takeIngredientsFromWarehouse(..))")
    public void informAboutTakingIngredients() {
        System.out.println("Ingredients has been taken");
    }

    @Around("execution(* com.bexpe.api.ICook.givePizzaAway(..))")
    public void givingPizzaAway(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Pizza is ready to give away");
            joinPoint.proceed();
            System.out.println("Pizza has been given away");

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
