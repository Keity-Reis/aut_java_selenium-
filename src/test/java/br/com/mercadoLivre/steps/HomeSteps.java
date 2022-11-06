package br.com.mercadoLivre.steps;

import br.com.mercadoLivre.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class HomeSteps extends BaseSteps {

    HomePage homePage = new HomePage();

    @Test
    public void pesquisarObjetoExistenteNoCamppoMercadoLivre() {
        homePage.setEscreverNoCampoMercadoLivre("Airfryer");
        homePage.setLimparCampoMercadoLivre();
        homePage.setEscreverNoCampoMercadoLivre("Geladeira");
        homePage.setClickPesquisa();
        Assert.assertEquals("Geladeira", homePage.getValidarPesquisa());}

}






