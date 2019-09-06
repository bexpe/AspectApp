package com.bexpe.config;

import com.bexpe.api.ICasserole;
import com.bexpe.api.ICook;
import com.bexpe.aspects.CasseroleAspect;
import com.bexpe.aspects.Comunication;
import com.bexpe.aspects.WarehouseControl;
import com.bexpe.impl.CasseroleImpl;
import com.bexpe.impl.Cook;
import com.bexpe.impl.CooksHelper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy //niezbedna adnotacja przy aspektach musimy o niej pamietac
public class AppConfig {

    @Bean
    public ICasserole casseroleInterface() {
        return new CasseroleImpl();
    }

    @Bean
    public CasseroleAspect casseroleAspect(){
        return new CasseroleAspect();
    }

    @Bean
    @Qualifier("cook")
    public ICook cook() {
        return new Cook();
    }

    @Bean
    @Qualifier("cooks_helper")
    public ICook cooksHelper() {
        return new CooksHelper();
    }

    @Bean
    public Comunication comunication() {
        return new Comunication();
    }

    @Bean
    public WarehouseControl warehouseControl() {
        return new WarehouseControl();
    }
}
