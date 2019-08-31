package com.bexpe.impl;

import com.bexpe.api.IKucharz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PomocnikKucharza implements IKucharz {

    @Autowired
    @Qualifier("pomocnik_kucharza")
    private IKucharz kucharz;

    public void pobierzSkladnikiZMagazynu(int liczbaSkładnikow) {
        System.out.println("Pomocnik pobiera " + liczbaSkładnikow + "z Magazynu");
    }

    public void pobierzSkladnikiZMagazynu() {
        System.out.println("Pomocnik pobiera skladniki z magazynu");
    }

    public void przygotujPizze() {
        System.out.println("Pomocnik oddelogowuje przygotowanie do kucharza");
        kucharz.przygotujPizze();
    }

    public void przygotujPizze(int idPizzy) {
        System.out.println("Pomocnik oddelogowuje przygotowanie pizzy o id " + idPizzy + "do kucharza");
        kucharz.przygotujPizze(idPizzy);
    }

    public void wydajPizze() {
        System.out.println("Pomocnik wydaje pizze");
    }
}