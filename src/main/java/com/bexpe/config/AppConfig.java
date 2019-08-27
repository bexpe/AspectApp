package com.bexpe.config;

import com.bexpe.api.IKucharz;
import com.bexpe.aspects.Komunikacja;
import com.bexpe.aspects.KontrolaMagazynu;
import com.bexpe.impl.Kucharz;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy //niezbedna adnotacja przy aspektach musimy o niej pamietac
public class AppConfig {

    @Bean
    public IKucharz kucharz() {
        return new Kucharz();
    }

    @Bean
    public Komunikacja komunikacja() {
        return new Komunikacja();
    }

    @Bean
    public KontrolaMagazynu kontrolaMagazynu() {
        return new KontrolaMagazynu();
    }
}
