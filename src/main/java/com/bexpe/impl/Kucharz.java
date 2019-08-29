package com.bexpe.impl;

import com.bexpe.api.IKucharz;

public class Kucharz implements IKucharz {
    public void pobierzSkladnikiZMagazynu() {
        System.out.println("Kucharz pobiera skladniki z magazynu");
    }

    public void przygotujPizze() {
        System.out.println("Kucharz przygotowuje pizze");
    }

    public void wydajPizze() {
        System.out.println("Kucharz wydaje pizze");
    }

    public void pobierzSkadnikizMagazynu(int liczbaSkladnikow) {
        System.out.println("Kucharz pobiera" + liczbaSkladnikow + "skladnikow");
    }

    public void przygotujPizze(int idPizzy) {
        System.out.println("Kucharz przygotowuje pizze o id " + idPizzy);
    }
}
