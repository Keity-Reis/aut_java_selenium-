package br.com.mercadoLivre.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {


    private static final By campoMercadoLivre =
            new By.ByCssSelector("[aria-label=\"Digite o que você qu" +
                    "er encontrar\"]");
    private static final By limparCampoMercadoLivre =
            new By.ByCssSelector("[aria-label=\"Digite o que você quer encontrar\"]");
    private static final By clickPesquisa =
            new By.ByCssSelector("[class=\"nav-search-btn\"]");
    private static final By validarPesquisaComSucesso =
            new By.ByCssSelector("[class=\"ui-search-breadcrumb__title shops-custom-primary-font\"]");
    private static final By pegarUmOjetoEspecifico =
            new By.ByCssSelector("[class=\"ui-pdp-title\"]");




    public void setEscreverNoCampoMercadoLivre(String pesquisar){
            sendKeys(campoMercadoLivre, pesquisar);}
    public void setLimparCampoMercadoLivre() {limparCampo(limparCampoMercadoLivre);}

    public void setClickPesquisa(){
            click(clickPesquisa);}
    public String getValidarPesquisa(){
            return lerText( validarPesquisaComSucesso);}

    

    }








