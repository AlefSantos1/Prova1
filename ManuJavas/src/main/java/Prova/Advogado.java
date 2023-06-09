package Prova;

public class Advogado extends Funcionario{
     private String oab;

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, nome, telefone, email, endereco);
        this.oab = oab;
    }

 

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "\n oab=" + oab +
               "\n cpf:" + cpf +
               "\n rg:" + rg +
               "\n matricula:" + matricula +
               "\n setor:" + setor +
               "\n salario:" + salario;
    }

    

     
}