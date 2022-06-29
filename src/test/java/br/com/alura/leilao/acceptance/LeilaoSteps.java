package br.com.alura.leilao.acceptance;

import br.com.alura.leilao.e2e.pages.Browser;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LeilaoSteps {

    @Dado("um usuario logado")
    public void um_usuario_logado() {

        new Browser().getLoginPage();
    }
    @Quando("acessa a pagina de novo leilao")
    public void acessa_a_pagina_de_novo_leilao() {
    }
    @Quando("prenche o formulario com dados validos")
    public void prenche_o_formulario_com_dados_validos() {
    }
    @Entao("volta para a pagina de leiloes")
    public void volta_para_a_pagina_de_leiloes() {
    }
    @Entao("o novo leilao aparece na tabela")
    public void o_novo_leilao_aparece_na_tabela() {
    }

}
