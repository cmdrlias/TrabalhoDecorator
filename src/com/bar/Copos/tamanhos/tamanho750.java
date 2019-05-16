package com.bar.Copos.tamanhos;

import com.bar.Copos.Copo;

public class tamanho750 implements Copo {
    public int tamanho() {
        return 750;
    }

    @Override
    public double preco() {
        return 15.00;
    }
}
