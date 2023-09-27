import Estabelecimento.Lancheria;
import Ingredientes.Ingrediente;
import Lanches.Lanche;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lancheria lancheria = new Lancheria("Sanduba");
        Scanner sc = new Scanner(System.in);
        boolean montaLanche = true;
        ArrayList<Ingrediente> ingredientes_lanche = new ArrayList<>();
        while(montaLanche){
            System.out.println("""
                               == Menu ==
                               1- Adicionar Ingrediente
                               2- Terminar Lanche""");

            int escolha = sc.nextInt();

            switch (escolha){
                case 1 -> ingredientes_lanche.add(lancheria.criar_ingrediente());
                case 2 -> montaLanche = false;
                default -> System.out.println("Escolha inválida!");
            }

        }

        Lanche l = lancheria.criar_lanche("Sanduiche monstro", 21.00F, ingredientes_lanche);
        lancheria.getInfoLanche(l);
    }
}