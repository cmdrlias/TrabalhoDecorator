package com.bar.Ingredientes;

import com.bar.Ingredientes.Acessorios.*;
import com.bar.Ingredientes.BebidasAlcoolicas.*;
import com.bar.Ingredientes.Frutas.Kiwi;
import com.bar.Ingredientes.Frutas.Laranja;
import com.bar.Ingredientes.Frutas.Limao;
import com.bar.Ingredientes.Frutas.Maracuja;
import com.bar.Ingredientes.Refrigerantes.Coca;
import com.bar.Ingredientes.Refrigerantes.Guarana;
import com.bar.Ingredientes.Refrigerantes.Soda;

public class Ingrediente {
    public Ingrediente() {

    }

    public Refrigerante addRefrigerante(int sabor) {
        Refrigerante refri;
        if(sabor == 1) {
            return  new Coca();
        } else if (sabor == 2) {
            return new Guarana();
        } else if (sabor == 3) {
            return new Soda();
        } else {
            return null;
        }
    }

    public Alcool addAlcool(int tipo) {
        if(tipo == 1) {
            return new Cachaca();
        } else if (tipo == 2) {
            return new Champagne();
        } else if (tipo == 3) {
            return new Gin();
        } else if (tipo == 4) {
            return new Vinho();
        } else if (tipo == 5) {
            return new Vodka();
        } else {
            return null;
        }
    }

    public Acessorio addAcessorio(int tipoAcessorio) {
        if (tipoAcessorio == 1) {
            return new Acucar();
        } else if (tipoAcessorio == 2) {
            return new CremeDeLeite();
        } else if (tipoAcessorio == 3) {
            return new Gelo();
        } else if (tipoAcessorio == 4) {
            return new Groselha();
        } else if (tipoAcessorio == 5) {
            return new LeiteCondensado();
        } else {
            return null;
        }
    }

    public Fruta addFruta(int tipoFruta) {
        if (tipoFruta == 1) {
            return new Kiwi();
        } else if (tipoFruta == 2) {
            return new Laranja();
        } else if (tipoFruta == 3) {
            return new Limao();
        } else if (tipoFruta == 4) {
            return new Maracuja();
        } else {
            return null;
        }
    }
}
