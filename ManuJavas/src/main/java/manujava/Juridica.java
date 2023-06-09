
package manujava;


public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;

    public Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n CNPJ: " + cnpj + 
                "\n Inscrição Estadual: " + inscricaoEstadual;
    }
    
    
}
