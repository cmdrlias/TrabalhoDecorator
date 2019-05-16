package com.bar.Ingredientes.Acessorios;

import com.bar.Ingredientes.Acessorio;

public class Gelo implements Acessorio {
    @Override
    public String tipoAcessorio() {
        return "Gelo";
    }

    @Override
    public double preco() {
        return 1.50;
    }
}
