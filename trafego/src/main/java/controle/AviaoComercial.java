package controle;

public class AviaoComercial {
    public String recebePermissaoDePousar(String mensagem){
        return ControleTrafegoAereo.getInstancia().recebePermissaoDePousar(mensagem);
    }

    public String recebeAvisoDeProblemasNaPista(String mensagem){
        return ControleTrafegoAereo.getInstancia().recebeAvisoDeProblemasNaPista(mensagem);
    }


}
