/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package att02;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
        Motoboy motoboy = new Motoboy("99999", "Lucas Locco", "9574", "8848745", 500);
        Medico medico = new Medico("44444", "Umbirajara", "6449613", "289248", 3055555);
        Engenheiro engenheiro = new Engenheiro("010101", "Rattaluli", "56546646", "5964676", 100000);
        
        System.out.println(medico.toString());
        System.out.println("");
        System.out.println(engenheiro.toString());
        System.out.println("");
        System.out.println(motoboy.toString());
        
                
    }
}
