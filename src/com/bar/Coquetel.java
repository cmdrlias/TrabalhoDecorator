package com.bar;

import com.bar.Copos.Copo;
import com.bar.Copos.tamanhos.tamanho300;
import com.bar.Copos.tamanhos.tamanho500;
import com.bar.Copos.tamanhos.tamanho750;
import com.bar.Ingredientes.Alcool;
import com.bar.Ingredientes.BebidasAlcoolicas.*;
import com.bar.Ingredientes.Fruta;
import com.bar.Ingredientes.Frutas.Kiwi;
import com.bar.Ingredientes.Frutas.Laranja;
import com.bar.Ingredientes.Frutas.Limao;
import com.bar.Ingredientes.Frutas.Maracuja;
import com.bar.Ingredientes.Refrigerante;
import com.bar.Ingredientes.Refrigerantes.Coca;
import com.bar.Ingredientes.Refrigerantes.Guarana;
import com.bar.Ingredientes.Refrigerantes.Soda;

import java.util.ArrayList;
import java.util.List;

public class Coquetel {
    public static void main(String[] args) {

        List<Copo> copos = new ArrayList<>();

        copos.add(new tamanho500());
        copos.add(new tamanho300());
        copos.add(new tamanho750());


        List<Alcool> alcool = new ArrayList<>();

        alcool.add(new Gin());
        alcool.add(new Vodka());
        alcool.add(new Champagne());
        alcool.add(new Cachaca());
        alcool.add(new Vinho());

        List<Refrigerante> refrigerantes = new ArrayList<>();

        refrigerantes.add(new Coca());
        refrigerantes.add(new Guarana());
        refrigerantes.add(new Soda());

        List<Fruta> frutas = new ArrayList<>();

        frutas.add(new Kiwi());
        frutas.add(new Laranja());
        frutas.add(new Limao());
        frutas.add(new Maracuja());

        for (Copo c : copos) {
            System.out.print("Tamanho do copo: " + c.tamanho() + "\n");
            System.out.print("Preço do copo: " + c.preco() + "\n");
        }

        for (Alcool a : alcool) {
            System.out.print("Tipo da bebida alcóolica: " + a.tipo() + "\n");
            System.out.print("Preço da bebida alcóolica: " + a.preco() + "\n");
        }

        for (Refrigerante r : refrigerantes) {
            System.out.print("Sabores de refrigerante: " + r.sabor() + "\n");
            System.out.print("Preço de refrigerante: " + r.preco() + "\n");
        }

        for (Fruta f : frutas) {
            System.out.print("Sabores de refrigerante: " + f.tipoFruta() + "\n");
            System.out.print("Preço de refrigerante: " + f.preco() + "\n");
        }
    }
}
