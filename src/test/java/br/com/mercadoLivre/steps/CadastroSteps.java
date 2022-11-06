package br.com.mercadoLivre.steps;

import br.com.mercadoLivre.pages.CadastroPage;
import org.junit.Test;

public class CadastroSteps extends BaseSteps
{

    CadastroPage cadastroPage = new CadastroPage();

@Test
public void CadastrarClienteNoMercadoLivre(){
    cadastroPage.setCampoCriarContaMercadoLivre();
    cadastroPage.setBtnConfirmar();
    cadastroPage.setbtnBox();
    cadastroPage.setBtnContinua();
}
}






