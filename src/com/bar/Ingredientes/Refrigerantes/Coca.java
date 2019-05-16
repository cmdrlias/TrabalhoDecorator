package com.bar.Ingredientes.Refrigerantes;

import com.bar.Ingredientes.Refrigerante;

public class Coca implements Refrigerante {
    @Override
    public String sabor() {
        return "Coca-Cola";
    }

    @Override
    public double preco() {
        return 2.50;
    }
}
