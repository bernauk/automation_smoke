package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage {

    public EmployeeListPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement inputUsername;

    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@title='Employees']/span")
    public WebElement employeeLink;

    @FindBy(xpath = "//span[.='Find Employee']")
    public WebElement findEmployee;


    @FindBy(xpath = "//a/span[.='Employees']")
    public WebElement employeesList;

    @FindBy(xpath = "//a/span[.='Inactive']")
    //@FindBy(xpath = "//div[p='Your search did not match any employees.']")
    public WebElement inactiveTab;

    @FindBy(xpath = "//div[@id='employee-ABC']")
    //@FindBy(xpath = "//div[p='Your search did not match any employees.']")
    public WebElement inactiveEmployeesTab;

    @FindBy(xpath = "//span[.='Search By Alphabet']")
    public WebElement alphabetTab;

    @FindBy(xpath = "//div[@id='employee-ABC-block']")
    public WebElement alphabetFunction;

    @FindBy(xpath = "//span[.='Search By Alphabet']")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@id='user-fio']")
    public WebElement searchBoxTab;





    public void login() {
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();


    }

    protected static void login(String username, String password) {
    }


    public void loginWithConfig() {
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();

    }





    }

