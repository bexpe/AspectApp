package com.bexpe.api;

public interface IKucharz {
    void pobierzSkladnikiZMagazynu(int liczbaSkładnikow);
    void pobierzSkladnikiZMagazynu();
    void przygotujPizze();
    void przygotujPizze(int idPizzy);
    void wydajPizze();
}
