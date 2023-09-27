package Lanches;

import Ingredientes.Ingrediente;

import java.util.ArrayList;

public abstract class Lanche {
    protected String nome;
    protected float preco;
    protected ArrayList<Ingrediente> ingredientes;

    public Lanche(String nome, float preco, ArrayList<Ingrediente> listaIngredientes) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = listaIngredientes;
    }

    public abstract String toString();
}
