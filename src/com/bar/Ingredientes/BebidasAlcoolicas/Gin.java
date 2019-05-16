package com.bar.Ingredientes.BebidasAlcoolicas;

import com.bar.Ingredientes.Alcool;

public class Gin implements Alcool {
    @Override
    public String tipo() {
        return "Gin";
    }


    @Override
    public double preco() {
        return 20.00;
    }
}
