package controle;

public interface ComunicacaoAerea {
    String recebePermissaoDePousar(String mensagem);
    String recebeAvisoDeProblemasNaPista(String mensagem);
}