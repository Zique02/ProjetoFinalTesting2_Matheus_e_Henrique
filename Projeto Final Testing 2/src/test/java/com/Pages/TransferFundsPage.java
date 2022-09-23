package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TransferFundsPage extends BasePage {

    protected static final String linkTransferFunds = "//*[@id=\"leftPanel\"]/ul/li[3]/a"; //xpath
    protected static final String txtTransferFunds = "//*[@id=\"rightPanel\"]/div/div/h1"; //xpath
    protected static final String inputAmount = "amount"; //id
    protected static final String inputFromAcc = "//*[@id=\"fromAccountId\"]/option[1]"; //xpath
    protected static final String inputToAcc = "//*[@id=\"fromAccountId\"]/option[2]"; //xpath
    protected static final String btnTransfer = "//*[@id=\"rightPanel\"]/div/div/form/div[2]/input"; //xpath
    protected static final String msgTransferComplete = "//*[@id=\"rightPanel\"]/div/div/h1"; //xpath

    public void abrirLinkTransferFunds() {
        WebElement linkFunds = getWebElement(By.xpath(linkTransferFunds));
        linkFunds.click();
    }

    public String checarTxtTransferFunds() throws  InterruptedException {
        WebElement txtFunds = getWebElement(By.xpath(txtTransferFunds));
        return txtFunds.getText();
    }

    public void preencherCampoAmount(String amount){
        WebElement campoQuantidade = getWebElement(By.id(inputAmount));
        campoQuantidade.clear();
        campoQuantidade.sendKeys(amount);
    }

    public void selecionaPrimeiraConta() {
        WebElement primeiraOpcao = getWebElement(By.xpath(inputFromAcc));
        primeiraOpcao.click();
    }

    public void selecionaSegundaConta() {
        WebElement segundaOpcao = getWebElement(By.xpath(inputToAcc));
        segundaOpcao.click();
    }

    public void confirmaTransferencia() {
        WebElement btnConfirma = getWebElement(By.xpath(btnTransfer));
        btnConfirma.click();
    }

    public String checarMsgTransfereciaCompleta() {
        WebElement checarMsg = getWebElement(By.xpath(msgTransferComplete));
        return checarMsg.getText();
    }
}
