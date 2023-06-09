/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manujava;

import java.time.LocalDate; 
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    
    public static void main(String[] args) {
        //criando objeto
        Fisica pessoaFisica = new Fisica("65949846", "598557", LocalDate.of(2004, Month.APRIL,21), "Josefa", "494444");
        Juridica pessoaJuridica = new Juridica("5994497979", "7", "Ponei", "666464");
        
        //exibir 
        System.out.println(pessoaFisica.toString());
        System.out.println("");
        System.out.println(pessoaJuridica);
    }
    
    
}
