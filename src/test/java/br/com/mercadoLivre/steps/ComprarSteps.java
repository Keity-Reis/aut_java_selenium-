package br.com.mercadoLivre.steps;

import br.com.mercadoLivre.pages.ComprarPage;
import org.junit.Test;

public class ComprarSteps extends BaseSteps{

    ComprarPage comprarPage = new ComprarPage();

    @Test
    public void compras(){
     comprarPage.setProcurarGeladeira("geladeira fors free");
     comprarPage.setClickPesquisa();
     comprarPage.setBtnCookies();
     comprarPage.setEscolherItem();
     comprarPage.setAdicionarAoCarrinho();

    }

}
