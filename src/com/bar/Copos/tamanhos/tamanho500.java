package com.bar.Copos.tamanhos;

import com.bar.Copos.Copo;

public class tamanho500 implements Copo {
    public int tamanho() {
        return 500;
    }

    @Override
    public double preco() {
        return 12.50;
    }
}
