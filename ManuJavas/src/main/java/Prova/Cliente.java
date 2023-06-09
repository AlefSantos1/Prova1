package Prova;

public class Cliente extends Fisica{
 private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(genero, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }



    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + '}';
    }

    
  

}