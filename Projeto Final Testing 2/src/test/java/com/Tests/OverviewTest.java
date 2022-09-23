package com.Tests;

import com.Pages.AccountsOverviewPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OverviewTest {

    private static AccountsOverviewPage page;

    @BeforeEach
    public void setUp(){

        page = new AccountsOverviewPage();
        page.openApp();

        //fazendo login para poder abrir a pagina 'Accounts Overview'
        page.inserirDadosLogin("abraman3328", "123123");
        page.fazerLogin();
    }

    @Test
    public void testAccOverview() throws InterruptedException{

        page.abrirPaginaAccOverview();
        Thread.sleep(2000);
        String textoAccountOverviewVerificada = page.checarTxtBalance();

        assertTrue(textoAccountOverviewVerificada.contains("Balance includes deposits that may be subject to holds"));

    }
    @AfterEach
    public void tearDown() {
        page.quitDriver();
    }
}
