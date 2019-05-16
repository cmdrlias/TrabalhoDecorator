package com.bar.Decorator;

import com.bar.Copos.Copo;

public abstract class CopoDecorator implements Copo {
    protected Copo copo;

    public CopoDecorator(Copo copo) {
        this.copo = copo;
    }

    public int tamanho() {
        return copo.tamanho();
    }
}
