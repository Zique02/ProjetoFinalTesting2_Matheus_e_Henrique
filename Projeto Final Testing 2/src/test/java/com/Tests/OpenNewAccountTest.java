package com.Tests;

import com.Pages.NewAccountPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OpenNewAccountTest {

    private static NewAccountPage page;

    @BeforeEach
    public void setUp(){

        page = new NewAccountPage();
        page.openApp();

        //fazendo login para poder abrir a pagina 'Open New Account'

        page.inserirDadosLogin("abraman3328", "123123");
        page.fazerLogin();
    }

    @Test
    public void testOpNewAcc() throws InterruptedException{

        page.abrirPaginaOpNewAccount();
        Thread.sleep(2000);
        page.abrirMenuDropdown();
        Thread.sleep(2000);
        page.selecionaSavings();
        Thread.sleep(2000);
        page.confirmarOpNewAcc();
        Thread.sleep(2000);
        String mensagemCongratsVerificada = page.checarMsgAccOp();

        assertTrue(mensagemCongratsVerificada.contains("Congratulations, your account is now open."));

    }
    @AfterEach
    public void tearDown() {
        page.quitDriver();
    }
}
