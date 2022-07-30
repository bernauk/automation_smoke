package com.cydeo.step_definitions;


import com.cydeo.pages.EmployeeListPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class EmployeeList_StepDefinitions  {


    EmployeeListPage employeeListPage = new EmployeeListPage();


    @Given("user is on the webpage")
    public void user_is_on_the_webpage() {
        String url = ConfigurationReader.getProperty("web.url");
        Driver.getDriver().get(url);
    }
    @When("user enters marketing username")
    public void user_enters_marketing_username() {
        employeeListPage.inputUsername.sendKeys(ConfigurationReader.getProperty("username"));

    }
    @When("user enters marketing password")
    public void user_enters_marketing_password() {
        employeeListPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

        employeeListPage.loginButton.click();
    }





    @Given("user is logged in as Marketing employee")
    public void user_is_logged_in_as_marketing_employee() {
        System.out.println("User is logged in");

    }
    @Then("user navigates to Employees link")
    public void user_navigates_to_employees_link() {

        employeeListPage.employeeLink.click();
    }
    @Then("user clicks on the Find Employee")
    public void user_clicks_on_the_find_employee() {

        employeeListPage.findEmployee.click();
    }
    @Then("user sees Employee List")
    public void user_sees_employee_list() {

        Assert.assertTrue(employeeListPage.employeesList.isDisplayed());
    }

    @Then("user clicks on the inactive tab")
    public void user_clicks_on_the_inactive_tab() {

        employeeListPage.inactiveTab.click();

    }

     @Then("user should see Inactive employees tab")
    public void user_should_see_inactive_employees_tab() {

        Assert.assertTrue(employeeListPage.inactiveEmployeesTab.isDisplayed());

    }

    @Then("the user clicks on the Search by Alphabet tab")
    public void the_user_clicks_on_the_search_by_alphabet_tab() {

        employeeListPage.alphabetTab.click();
    }
    @Then("verify that search by alphabet function is displayed")
    public void verify_that_search_by_alphabet_function_is_displayed() {

        Assert.assertTrue(employeeListPage.alphabetFunction.isDisplayed());
    }


    @Then("the user clicks on search box on the page")
    public void the_user_clicks_on_search_box_on_the_page() {

        employeeListPage.searchBox.click();
    }
    @Then("verify that search box is displayed")
    public void verify_that_search_box_is_displayed() {

        Assert.assertTrue(employeeListPage.searchBoxTab.isDisplayed());


    }

}


