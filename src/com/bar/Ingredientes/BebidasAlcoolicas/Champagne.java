package com.bar.Ingredientes.BebidasAlcoolicas;

import com.bar.Ingredientes.Alcool;

public class Champagne implements Alcool {
    @Override
    public String tipo() {
        return "Champagne";
    }

    @Override
    public double preco() {
        return 12.50;
    }
}
