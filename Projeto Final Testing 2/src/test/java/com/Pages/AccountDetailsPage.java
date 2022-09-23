package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountDetailsPage extends BasePage {

    protected static final String linkAccOverview = "//*[@id=\"leftPanel\"]/ul/li[2]/a";//xpath
    protected static final String txtBalanceIncludes = "//*[@id=\"accountTable\"]/tfoot/tr/td"; //xpath

    protected static final String firstAccOption = "//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a"; //xpath
    protected static final String txtAccountDetails = "//*[@id=\"rightPanel\"]/div/div[1]/h1";//xpath

    protected static final String selectorActivityPeriod = "//*[@id=\"month\"]";//xpath
    protected static final String optionActivityPeriodAll = "//*[@id=\"month\"]/option[1]"; //xpath
    protected static final String selectorType = "//*[@id=\"transactionType\"]"; //xpath
    protected static final String optionTypeAll = "//*[@id=\"transactionType\"]/option[1]"; //xpath
    protected static final String BtnGo = "//*[@id=\"rightPanel\"]/div/div[2]/form/table/tbody/tr[3]/td[2]/input"; //xpath

    public void abrirPaginaAccOverview() {
        WebElement abrirLinkOverview = getWebElement(By.xpath(linkAccOverview));
        abrirLinkOverview.click();
    }

    public String checarTxtBalance() throws InterruptedException {
        WebElement checarTexto = getWebElement(By.xpath(txtBalanceIncludes));
        return checarTexto.getText();

    }


    public void clicarPrimeiraOpcaoDeConta() {
        WebElement clicarPrimeira = getWebElement(By.xpath(firstAccOption));
        clicarPrimeira.click();
    }

    public String checarTxtAccDetails() throws InterruptedException {
        WebElement checarTextoDetails = getWebElement(By.xpath(txtAccountDetails));
        return checarTextoDetails.getText();
    }


    public void abrirSeletorActivityPeriod() {
        WebElement abrirSeletor = getWebElement(By.xpath(selectorActivityPeriod));
        abrirSeletor.click();
    }

    public void selecionarActivityPeriodAll() {
        WebElement selecionarAll = getWebElement(By.xpath(optionActivityPeriodAll));
        selecionarAll.click();
    }

    public void abrirSeletorType() {
        WebElement abrirSeletor = getWebElement(By.xpath(selectorType));
        abrirSeletor.click();
    }

    public void selecionarTypeAll() {
        WebElement selecionarAll = getWebElement(By.xpath(optionTypeAll));
        selecionarAll.click();
    }

    public void clicarBtnGo() {
        WebElement clicarGo = getWebElement(By.xpath(BtnGo));
        clicarGo.click();
    }
}
