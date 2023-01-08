package controle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AviaoTest {

    @Test
    void deveSolicitarPermissaoAoAeroporto(){
        Aviao aviao = new Aviao();
        assertEquals("Contato recebido.\nPermissão de pousar concedida\n"+
                        ">>Avião tem permissão de pousar",
                aviao.recebePermissaoDePousar("Estamos a 15km do aeroporto, solicitou permissão de pousar."));
    }

    @Test
    void deveInformarProblemaNaPista(){
        Aviao aviao = new Aviao();
        assertEquals("Contato recebido.\nProblemas na pista.\n"+
                        ">>Problemas na pista, impossível pousar",
                aviao.recebeAvisoDeProblemasNaPista("Problemas na pista, aguardar contato para pousar"));
    }


}
