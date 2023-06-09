/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manujava;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {
   //abstract para herdar as classes fisica e juridica
    protected String nome;  
    protected String telefone;  

    //construtor
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    //get e set
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    //tostring para otimizar a exibição
    @Override
    public String toString() {
        return "\n Nome: " + nome + 
                "\n Telefone: " + telefone;
    }

 
    }
   
    
