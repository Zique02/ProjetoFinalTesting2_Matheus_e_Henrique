package com.Tests;

import com.Pages.TransferFundsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransferFundsTest {

    private static TransferFundsPage page;

    @BeforeEach
    public void setUp(){

        page = new TransferFundsPage();
        page.openApp();

        //fazendo login para poder abrir a pagina 'Transfer Funds'
        page.inserirDadosLogin("abraman3328", "123123");
        page.fazerLogin();
    }

    @Test
    public void testTransferFunds() throws InterruptedException{

        page.abrirLinkTransferFunds();
        Thread.sleep(2000);
        String tituloTransferFundsVerificada = page.checarTxtTransferFunds();

        assertTrue(tituloTransferFundsVerificada.contains("Transfer Funds"));
        Thread.sleep(2000);

        page.preencherCampoAmount("10");
        Thread.sleep(2000);
        page.selecionaPrimeiraConta();
        Thread.sleep(2000);
        page.selecionaSegundaConta();
        Thread.sleep(2000);
        page.confirmaTransferencia();
        Thread.sleep(2000);
        String tituloTransferCompleteVerificada = page.checarMsgTransfereciaCompleta();

        assertTrue(tituloTransferCompleteVerificada.contains("Transfer Complete!"));

    }

    @AfterEach
    public void tearDown() {
        page.quitDriver();
    }
}
