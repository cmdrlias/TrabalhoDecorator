package com.bar.Ingredientes.BebidasAlcoolicas;

import com.bar.Ingredientes.Alcool;

public class Vodka implements Alcool {
    @Override
    public String tipo() {
        return "Vodka";
    }


    @Override
    public double preco() {
        return 16.50;
    }
}
