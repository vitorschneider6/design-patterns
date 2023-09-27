package Ingredientes;

public abstract class Ingrediente {
    protected String nome;

    public Ingrediente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
