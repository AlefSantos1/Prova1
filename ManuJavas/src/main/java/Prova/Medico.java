package Prova;

public class Medico extends Funcionario{
     private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, nome, telefone, email, endereco);
        this.crm = crm;
    }


    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return 
               "\n crm: " + crm + 
               "\n cpf:" + cpf +
               "\n rg:" + rg +
               "\n matricula:" + matricula +
               "\n setor:" + setor +
               "\n salario:" + salario;
    }

 

}
