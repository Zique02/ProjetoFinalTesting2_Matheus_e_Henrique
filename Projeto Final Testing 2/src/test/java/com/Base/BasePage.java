package com.Base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver driver;
    protected static final String URL = "https://parabank.parasoft.com/parabank/index.htm";

    protected static final String inputUsername = "//*[@id=\"loginPanel\"]/form/div[1]/input";//xpath
    protected static final String inputPassword = "//*[@id=\"loginPanel\"]/form/div[2]/input";//xpath
    protected static final String btnLogIn = "//*[@id=\"loginPanel\"]/form/div[3]/input";//xpath

    public void inserirDadosLogin(String username, String password) {
        WebElement campoNomeUsuario = getWebElement(By.xpath(inputUsername));
        campoNomeUsuario.clear();
        campoNomeUsuario.sendKeys(username);
        WebElement campoSenha = getWebElement(By.xpath(inputPassword));
        campoSenha.clear();
        campoSenha.sendKeys(password);
    }

    public void fazerLogin() {
        WebElement completarLogin = getWebElement(By.xpath(btnLogIn));
        completarLogin.click();
    }

    public BasePage() {this.driver = new ChromeDriver();}

    public void openApp() {
        getDriver().get(URL);
        getDriver().manage().window().maximize();
    }

    private WebDriver getDriver() {return driver;}

    public WebElement getWebElement(By locator) {
        WebElement element = null;
        try{
            element= driver.findElement(locator);
        } catch (Exception e) {
            System.out.println("Elemento não encontrado");
            System.out.println("Mensagem de erro: " + e);

        }
        return element;
    }

    public void quitDriver() {getDriver().quit();}
}
