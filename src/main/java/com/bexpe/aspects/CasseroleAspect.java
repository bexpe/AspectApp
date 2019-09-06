package com.bexpe.aspects;

import com.bexpe.api.ICasserole;
import com.bexpe.impl.CasseroleImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class CasseroleAspect {

    @DeclareParents(value="com.bexpe.api.ICook+", defaultImpl = CasseroleImpl.class)
    public static ICasserole iCasserole;
}
