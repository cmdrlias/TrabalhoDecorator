package com.bar.Ingredientes.Acessorios;

import com.bar.Ingredientes.Acessorio;

public class Groselha implements Acessorio {
    @Override
    public String tipoAcessorio() {
        return "Groselha";
    }

    @Override
    public double preco() {
        return 1.50;
    }
}
