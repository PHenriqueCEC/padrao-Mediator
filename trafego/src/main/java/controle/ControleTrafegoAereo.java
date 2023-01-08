package controle;

public class ControleTrafegoAereo {

    private static ControleTrafegoAereo instancia = new ControleTrafegoAereo();

    private ControleTrafegoAereo () {}

    public static ControleTrafegoAereo getInstancia(){
        return instancia;
    }

    public String recebePermissaoDoAeroporto(String mensagem){
        return  "Contato recebido.\n"+
                "Permissão de pousar concedida\n"+
                ">>" +  Aeroporto.getInstancia().recebePermissaoDePousar(mensagem);
    }
    public String recebeAvisoDeProblemasNaPistaAeroporto(String mensagem){
        return  "Contato recebido.\n"+
                "Problemas na pista.\n"+
                ">>" +  Aeroporto.getInstancia().recebeAvisoDeProblemasNaPista(mensagem);
    }

}
