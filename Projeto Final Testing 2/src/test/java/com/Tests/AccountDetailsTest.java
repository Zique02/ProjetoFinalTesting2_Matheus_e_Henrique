package com.Tests;

import com.Pages.AccountDetailsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountDetailsTest {

    private static AccountDetailsPage page;

    @BeforeEach
    public void setUp(){

        page = new AccountDetailsPage();
        page.openApp();

        //fazendo login para poder abrir a pagina 'Account Details'
        page.inserirDadosLogin("abraman3328", "123123");
        page.fazerLogin();
    }

    @Test
    public void testAccDetails() throws InterruptedException{

        page.abrirPaginaAccOverview();
        Thread.sleep(2000);
        String textoAccountOverviewVerificada = page.checarTxtBalance();

        assertTrue(textoAccountOverviewVerificada.contains("Balance includes deposits that may be subject to holds"));
        Thread.sleep(2000);

        page.clicarPrimeiraOpcaoDeConta();
        Thread.sleep(2000);
        String tituloAccountDetailsVerificado = page.checarTxtAccDetails();

        assertTrue(tituloAccountDetailsVerificado.contains("Account Details"));
        Thread.sleep(2000);

        page.abrirSeletorActivityPeriod();
        Thread.sleep(2000);
        page.selecionarActivityPeriodAll();
        Thread.sleep(2000);
        page.abrirSeletorType();
        Thread.sleep(2000);
        page.selecionarTypeAll();
        Thread.sleep(2000);
        page.clicarBtnGo();
        Thread.sleep(2000);


    }
    @AfterEach
    public void tearDown() {
        page.quitDriver();
    }
}
