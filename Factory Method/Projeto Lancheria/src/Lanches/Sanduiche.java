package Lanches;

import Ingredientes.Ingrediente;

import java.util.ArrayList;

public class Sanduiche extends Lanche{


    public Sanduiche(String nome, float preco, ArrayList<Ingrediente> listaIngredientes) {
        super(nome, preco, listaIngredientes);
    }

    @Override
    public String toString() {
        StringBuilder lista_ingredientes = new StringBuilder();
        for(Ingrediente i : this.ingredientes){
            lista_ingredientes.append("\n").append(i);
        }
        return "Nome: " + this.nome + "\nPreço: R$" + this.preco + "\nIngredientes:" + lista_ingredientes;
    }


}
