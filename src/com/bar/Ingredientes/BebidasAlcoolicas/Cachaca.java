package com.bar.Ingredientes.BebidasAlcoolicas;

import com.bar.Ingredientes.Alcool;

public class Cachaca implements Alcool {
    @Override
    public String tipo() {
        return "Cachaça";
    }


    @Override
    public double preco() {
        return 5.00;
    }
}
