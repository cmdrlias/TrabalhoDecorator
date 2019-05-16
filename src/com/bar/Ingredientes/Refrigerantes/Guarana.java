package com.bar.Ingredientes.Refrigerantes;

import com.bar.Ingredientes.Refrigerante;

public class Guarana implements Refrigerante {
    @Override
    public String sabor() {
        return "Guaraná";
    }

    @Override
    public double preco() {
        return 2.50;
    }
}
