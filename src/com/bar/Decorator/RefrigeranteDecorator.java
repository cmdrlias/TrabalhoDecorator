package com.bar.Decorator;

import com.bar.Ingredientes.Refrigerante;

public class RefrigeranteDecorator {
    private Refrigerante refri;

    public RefrigeranteDecorator(Refrigerante refri) {
        this.refri = refri;
    }

    public String sabor() {
        return refri.sabor();
    }
}
