package com.bar.Ingredientes.Frutas;

import com.bar.Ingredientes.Fruta;

public class Limao implements Fruta {
    @Override
    public String tipoFruta() {
        return "Limão";
    }

    @Override
    public double preco() {
        return 3.00;
    }
}
