package br.com.mercadoLivre.pages;

import org.openqa.selenium.By;

public class ComprarPage extends BasePage {

    private static final By buscaGeladeira =
            new By.ByCssSelector("[aria-label=\"Digite o que você quer encontrar\"]");
    private static final By clickPesquisa =
            new By.ByCssSelector("[class=\"nav-search-btn\"]");
    private static final By btnCookies =
            new By.ByCssSelector("[data-testid=\"action:understood-button\"]");
    private static final By escolherItem =
            new By.ByCssSelector("#root-app > div > div.ui-search-main.ui-search-main--exhibitor.ui-search-main--" +
                    "only-products.ui-search-main--with-topkeywords.shops__search-main > section > ol > li:nth-" +
                    "child(1) > div > div > div.ui-search-result__content-wrapper.shops__result-content-wrapper > " +
                    "div.ui-search-item__group.ui-search-item__group--title.shops__items-group");
    private static final By adicionarAoCarrinho =
            new By.ByCssSelector("[class=\"andes-button andes-spinner__icon-base andes-button--quiet\"]");


    public void setProcurarGeladeira(String pesquisar){ sendKeys(buscaGeladeira, pesquisar);}
    public void setClickPesquisa(){ click(clickPesquisa);}
    public void setBtnCookies(){ click(btnCookies);}
    public void setEscolherItem(){ click(escolherItem);}
    public void setAdicionarAoCarrinho(){ click(adicionarAoCarrinho);}


}