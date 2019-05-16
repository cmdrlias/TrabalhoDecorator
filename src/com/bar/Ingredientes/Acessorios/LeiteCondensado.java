package com.bar.Ingredientes.Acessorios;

import com.bar.Ingredientes.Acessorio;

public class LeiteCondensado implements Acessorio {
    @Override
    public String tipoAcessorio() {
        return "Leite Condensado";
    }

    @Override
    public double preco() {
        return 1.50;
    }
}
