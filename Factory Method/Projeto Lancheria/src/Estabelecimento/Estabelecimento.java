package Estabelecimento;

import Lanches.Lanche;
import Ingredientes.Ingrediente;

import java.util.ArrayList;

public abstract class Estabelecimento {
    protected String nome_estabelecimento;

    public abstract Lanche criar_lanche(String nomeLanche, float preco, ArrayList<Ingrediente> ingredientes);
    public abstract Ingrediente criar_ingrediente();
    public abstract void getInfoLanche(Lanche lanche);

    public Estabelecimento(String nome_estabelecimento) {
        this.nome_estabelecimento = nome_estabelecimento;
    }
}
