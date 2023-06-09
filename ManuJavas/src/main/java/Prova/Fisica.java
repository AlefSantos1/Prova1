package Prova;

public abstract class Fisica extends Pessoa{
    protected Genero genero;

    public Fisica(Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "\n Gênero: " + genero;
    }
    
    
}