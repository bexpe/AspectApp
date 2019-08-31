package com.bexpe.aspects;

import com.bexpe.api.InterfejsZapiekanka;
import com.bexpe.impl.ImplZapiekanka;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class AspektZapiekanka {

    @DeclareParents(value="com.bexpe.api.IKucharz+", defaultImpl = ImplZapiekanka.class)
    public static InterfejsZapiekanka iZapiekanka;
}
