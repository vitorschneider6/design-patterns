package Estabelecimento;

import Ingredientes.*;
import Lanches.Lanche;
import Lanches.Sanduiche;

import java.util.ArrayList;
import java.util.Scanner;

public class Lancheria extends Estabelecimento{
    public Lancheria(String nome_estabelecimento) {
        super(nome_estabelecimento);
    }

    @Override
    public Lanche criar_lanche(String nomeLanche, float preco, ArrayList<Ingrediente> ingredientes) {
        return new Sanduiche(nomeLanche, preco, ingredientes);
    }

    @Override
    public Ingrediente criar_ingrediente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Qual ingrediente você deseja criar?
                1- Salada
                2- Presunto
                3- Queijo
                4- Pão""");
        int escolha = sc.nextInt();
        System.out.println("Nome do Ingrediente:");
        String nome = sc.next();


        return switch (escolha) {
            case 1 -> new Salada(nome);
            case 2 -> new Presunto(nome);
            case 3 -> new Queijo(nome);
            default -> new Pao(nome);

        };
    }

    @Override
    public void getInfoLanche(Lanche lanche) {
        System.out.println(lanche);
    }
}
