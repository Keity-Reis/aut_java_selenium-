package br.com.mercadoLivre.pages;

import org.openqa.selenium.By;

public class CadastroPage extends BasePage{

    private static final By campoCriarContaMercadoLivre =
            new By.ByCssSelector("[data-link-id=\"registration\"]");
    private static final By btnConfirmar = new By.ByCssSelector("[data-testid=\"action:understood-button\"]");
    private static final By btnBox = new By.ByCssSelector("[class=\"andes-checkbox__input\"]");
    private static final By btnContinuar = new By.ByCssSelector("[class=\"andes-button landing-card__action andes-" +
            "button--large andes-button--loud\"]");


    public void setCampoCriarContaMercadoLivre(){ click(campoCriarContaMercadoLivre);}
    public void setBtnConfirmar(){ click(btnConfirmar);}
    public void setbtnBox(){ click(btnBox);}
    public void setBtnContinua(){ click(btnContinuar);}







}




