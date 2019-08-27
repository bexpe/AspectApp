package com.bexpe.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class KontrolaMagazynu {

    @Pointcut("execution(* com.bexpe.api.IKucharz.pobierzSkladnikiZMagazynu(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void sprawdzSkladnikiMagazynu() {
        System.out.println("sprawdzam stan magazynowy");
    }

    @AfterThrowing("pointCut()")
    public void zglosBrakiWMagazynie() {
        System.out.println("Braki w magazynie");
    }
}
