package com.bar.Copos.tamanhos;

import com.bar.Copos.Copo;

public class tamanho300 implements Copo {

    public int tamanho() {
        return 300;
    }

    @Override
    public double preco() {
        return 7.00;
    }
}
