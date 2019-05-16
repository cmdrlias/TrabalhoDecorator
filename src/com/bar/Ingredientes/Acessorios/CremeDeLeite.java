package com.bar.Ingredientes.Acessorios;

import com.bar.Ingredientes.Acessorio;

public class CremeDeLeite implements Acessorio {
    @Override
    public String tipoAcessorio() {
        return "Creme de Leite";
    }

    @Override
    public double preco() {
        return 1.50;
    }
}
