package com.bar.Ingredientes.Frutas;

import com.bar.Ingredientes.Fruta;

public class Maracuja implements Fruta {
    @Override
    public String tipoFruta() {
        return "Maracujá";
    }

    @Override
    public double preco() {
        return 3.00;
    }
}