package com.bar.Ingredientes.Refrigerantes;

import com.bar.Ingredientes.Refrigerante;

public class Soda implements Refrigerante {
    @Override
    public String sabor() {
        return "Soda";
    }

    @Override
    public double preco() {
        return 2.50;
    }
}
