package Prova;

public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String cnh, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, nome, telefone, email, endereco);
        this.cnh = cnh;
    }

  

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return   
               "\n cnh=" + cnh +
               "\n cpf:" + cpf +
               "\n rg:" + rg +
               "\n matricula:" + matricula +
               "\n setor:" + setor +
               "\n salario:" + salario;
    }

    
    
    
    }