package com.bar.Ingredientes.Frutas;

import com.bar.Ingredientes.Fruta;

public class Kiwi implements Fruta {
    @Override
    public String tipoFruta() {
        return "Kiwi";
    }

    @Override
    public double preco() {
        return 3.00;
    }
}