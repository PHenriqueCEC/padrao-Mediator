package controle;

public class Aeroporto implements ComunicacaoAerea {
    private static Aeroporto instancia = new Aeroporto();
    private Aeroporto() {}

    public static Aeroporto getInstancia(){
        return instancia;
    }

    public String recebePermissaoDePousar(String mensagem){
        return "Avião tem permissão de pousar";
    }

    public  String recebeAvisoDeProblemasNaPista(String mensagem){
        return "Problemas na pista, impossível pousar";
    }
}
