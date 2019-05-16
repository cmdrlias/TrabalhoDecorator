package com.bar.Ingredientes.BebidasAlcoolicas;

import com.bar.Ingredientes.Alcool;

public class Vinho implements Alcool {
    @Override
    public String tipo() {
        return "Vinho";
    }


    @Override
    public double preco() {
        return 15.00;
    }
}
