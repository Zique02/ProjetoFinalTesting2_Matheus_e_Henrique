package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewAccountPage extends BasePage {

    protected static final String linkOpenNewAccount = "//*[@id=\"leftPanel\"]/ul/li[1]/a";//xpath

    protected static final String dropdownAccountType = "//*[@id=\"type\"]";//xpath
    protected static final String optionSavings = "//*[@id=\"type\"]/option[2]";//xpath
    protected static final String btnOpenNewAccount = "//*[@id=\"rightPanel\"]/div/div/form/div/input"; //xpath

    protected static final String msgAccountOpened = "//*[@id=\"rightPanel\"]/div/div/p[1]";//xpath

    public void abrirPaginaOpNewAccount() {
        WebElement abrirLink = getWebElement(By.xpath(linkOpenNewAccount));
        abrirLink.click();
    }

    public void abrirMenuDropdown() {
        WebElement abrirMenu = getWebElement(By.xpath(dropdownAccountType));
        abrirMenu.click();
    }

    public void selecionaSavings() {
        WebElement selecionarOpcao = getWebElement(By.xpath(optionSavings));
        selecionarOpcao.click();
    }

    public void confirmarOpNewAcc() {
        WebElement btnOpNewAcc = getWebElement(By.xpath(btnOpenNewAccount));
        btnOpNewAcc.click();
    }

    public String checarMsgAccOp() throws InterruptedException {
        WebElement mensagemDeConfirmacao = getWebElement(By.xpath(msgAccountOpened));
        return mensagemDeConfirmacao.getText();
    }

}
