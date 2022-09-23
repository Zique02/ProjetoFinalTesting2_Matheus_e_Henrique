package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountsOverviewPage extends BasePage {

    protected static final String linkOpenAccountOverview = "//*[@id=\"leftPanel\"]/ul/li[2]/a"; //xpath

    protected static final String txtBalance = "//*[@id=\"accountTable\"]/tfoot/tr/td"; //xpath

    public void abrirPaginaAccOverview() {
        WebElement abrirLinkOverview = getWebElement(By.xpath(linkOpenAccountOverview));
        abrirLinkOverview.click();
    }

    public String checarTxtBalance() throws InterruptedException {
        WebElement checarTexto = getWebElement(By.xpath(txtBalance));
        return checarTexto.getText();

    }
}
