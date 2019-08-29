package com.bexpe.config;

import com.bexpe.api.IKucharz;
import com.bexpe.aspects.Komunikacja;
import com.bexpe.aspects.KontrolaMagazynu;
import com.bexpe.impl.Kucharz;
import com.bexpe.impl.PomocnikKucharza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy //niezbedna adnotacja przy aspektach musimy o niej pamietac
public class AppConfig {

    @Bean
    @Qualifier("kucharz")
    public IKucharz kucharz() {
        return new Kucharz();
    }

    @Bean
    @Qualifier("pomocnik kucharza")
    public IKucharz pomocnikKucharza() {
        return new PomocnikKucharza;
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
