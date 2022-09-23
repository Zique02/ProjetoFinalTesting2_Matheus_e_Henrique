package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {

    protected static final String btnRegister = "//*[@id=\"loginPanel\"]/p[2]/a"; //xpath

    protected static final String inputFirstName = "customer.firstName"; //id
    protected static final String inputLastName = "customer.lastName"; //id
    protected static final String inputAddress = "customer.address.street"; //id
    protected static final String inputCity =  "customer.address.city"; //id
    protected static final String inputState =  "customer.address.state"; //id
    protected static final String inputZipCode =  "customer.address.zipCode"; //id
    protected static final String inputPhoneNumber =  "customer.phoneNumber"; //id
    protected static final String inputSSN =  "customer.ssn"; //id
    protected static final String inputUsername =  "customer.username"; //id
    protected static final String inputPassword =  "customer.password"; //id
    protected static final String inputConfirmPassword =  "repeatedPassword"; //id

    protected static final String btnEndRegister = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input"; //xpath

    protected static final String msgWelcome = "//*[@id=\"rightPanel\"]/p"; //xpath

    public void abrirPaginaRegister() {
        WebElement abrir = getWebElement(By.xpath(btnRegister));
        abrir.click();
    }

    public void inserirDadosRegister(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String sSN, String username, String password, String confirmPassword){
        WebElement campoNome = getWebElement(By.id(inputFirstName));
        campoNome.clear();
        campoNome.sendKeys(firstName);
        WebElement campoSobrenome = getWebElement(By.id(inputLastName));
        campoSobrenome.clear();
        campoSobrenome.sendKeys(lastName);
        WebElement campoEndereco = getWebElement(By.id(inputAddress));
        campoEndereco.clear();
        campoEndereco.sendKeys(address);
        WebElement campoCidade = getWebElement(By.id(inputCity));
        campoCidade.clear();
        campoCidade.sendKeys(city);
        WebElement campoEstado = getWebElement(By.id(inputState));
        campoEstado.clear();
        campoEstado.sendKeys(state);
        WebElement campoZipCode = getWebElement(By.id(inputZipCode));
        campoZipCode.clear();
        campoZipCode.sendKeys(zipCode);
        WebElement campoTelefone = getWebElement(By.id(inputPhoneNumber));
        campoTelefone.clear();
        campoTelefone.sendKeys(phoneNumber);
        WebElement campoSSN = getWebElement(By.id(inputSSN));
        campoSSN.clear();
        campoSSN.sendKeys(sSN);
        WebElement campoUsername = getWebElement(By.id(inputUsername));
        campoUsername.clear();
        campoUsername.sendKeys(username);
        WebElement campoSenha = getWebElement(By.id(inputPassword));
        campoSenha.clear();
        campoSenha.sendKeys(password);
        WebElement campoConfirmarSenha = getWebElement(By.id(inputConfirmPassword));
        campoConfirmarSenha.clear();
        campoConfirmarSenha.sendKeys(confirmPassword);
    }

    public void confirmarResgistro() {
        WebElement btnRegistro = getWebElement(By.xpath(btnEndRegister));
        btnRegistro.click();
    }

    public String checarMsgWelcome() throws InterruptedException {
        WebElement mensagemDeConfirmacao = getWebElement(By.xpath(msgWelcome));
        return mensagemDeConfirmacao.getText();
    }
}
