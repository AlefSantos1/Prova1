package Prova;

public enum UnidadeFederativa {
    BAHIA ("Bahia"),
    SAO_PAULO ("São Paulo"),
    RIO_DE_JANEIRO ("Rio de Janeiro");
    
      private String nome;

    private UnidadeFederativa(String nome) {
        this.nome = nome;
    }

    public static UnidadeFederativa getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederativa getSAO_PAULO() {
        return SAO_PAULO;
    }

    public static UnidadeFederativa getRIO_DE_JANEIRO() {
        return RIO_DE_JANEIRO;
    }

    public String getNome() {
        return nome;
    }

   
      
    
    
}