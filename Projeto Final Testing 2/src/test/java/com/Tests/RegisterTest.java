package com.Tests;

import com.Pages.RegisterPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.Base.BasePage.driver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterTest {

    private static RegisterPage page;

    @BeforeEach
    public void setUp(){

        page = new RegisterPage();
        page.openApp();
    }

    @Test
    public void testeRegister() throws InterruptedException{

        page.abrirPaginaRegister();
        Thread.sleep(2000);
        page.inserirDadosRegister("Avram","Olsen", "3562 Lacinia Ave", "new york", "USA", "67-52", "(426) 154-6155", "123123", "abraman3328", "123123", "123123") ;
        Thread.sleep(2000);
        page.confirmarResgistro();
        Thread.sleep(2000);
        String mensagemWelcomeVerificada = page.checarMsgWelcome();

        assertTrue(mensagemWelcomeVerificada.contains("Your account was created successfully. You are now logged in."));

    }
    @AfterEach
    public void tearDown() {
        page.quitDriver();
    }

}
