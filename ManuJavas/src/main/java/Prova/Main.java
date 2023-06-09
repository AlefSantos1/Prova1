package Prova;

public class Main {
    public static void main(String[] args) {
     Motoboy motoboy = new Motoboy("24646", "2634632", "423654754", "346453654", Setor.OPERACOES, 1600, Genero.FEMININO, "Lorena", "2iu35236", "423656", "fd");
     Medico medico = new Medico("493286734", "4365435", "4263527", "43653745", Setor.SAUDE, 10000, Genero.FEMININO, "Julia", "7134634962", "436t3t", "325246");
     Advogado advogado = new Advogado("92785yr2", "erwtg30489ty", "34tiyh334t", Setor.JURIDICO, 7222, Genero.FEMININO, "Roberta", "832746", "WRGEFH", "FEWLK");
     Cliente cliente = new Cliente(0, Genero.FEMININO, "Carla", "32410784", "iweufio@hbgfw", "ba");
     Juridica juridica = new Juridica("2398562354", "34t734tvbf", "Apple", "834027346", "werfhiour32", "34ioth4to");
        
        
            System.out.println(motoboy.toString()); 
            System.out.println("");
            System.out.println();
            System.out.println(medico);
            System.out.println();
            System.out.println(advogado);
            System.out.println();
            System.out.println(cliente);
            System.out.println("");
            System.out.println(juridica);
    }
    
}