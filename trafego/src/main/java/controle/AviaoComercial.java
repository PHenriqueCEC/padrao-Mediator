package controle;

public class AviaoComercial {
    public String recebePermissaoDePousar(String mensagem){
        return ControleTrafegoAereo.getInstancia().recebePermissaoDoAeroporto(mensagem);
    }

    public String recebeAvisoDeProblemasNaPista(String mensagem){
        return ControleTrafegoAereo.getInstancia().recebeAvisoDeProblemasNaPistaAeroporto(mensagem);
    }


}
