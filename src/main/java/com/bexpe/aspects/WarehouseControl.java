package com.bexpe.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class WarehouseControl {

    @Pointcut("execution(* com.bexpe.api.ICook.takeIngredientsFromWarehouse(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void checkWarehouse() {
        System.out.println("Checking warehouse");
    }

    @AfterThrowing("pointCut()")
    public void reportDeficiencesInWarehouse() {
        System.out.println("Run out of ingredients");
    }
}
