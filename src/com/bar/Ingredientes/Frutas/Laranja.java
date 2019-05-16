package com.bar.Ingredientes.Frutas;

import com.bar.Ingredientes.Fruta;

public class Laranja implements Fruta {
    @Override
    public String tipoFruta() {
        return "Laranja";
    }

    @Override
    public double preco() {
        return 3.00;
    }
}
