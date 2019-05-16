package com.bar.Ingredientes.Acessorios;

import com.bar.Ingredientes.Acessorio;

public class Acucar implements Acessorio {
    @Override
    public String tipoAcessorio() {
        return "Açúcar";
    }

    @Override
    public double preco() {
        return 1.50;
    }
}
