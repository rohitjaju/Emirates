package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.lang.*;

public class assignments {
	
	 public static WebDriver driver;
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

	//input[@id='womf-date-picker--depart']
	//checkbox__input js-one-way control__one-way;


	 WebElement departure = driver.findElement(By.id("6cc1e7ce-e1b2-4256-a30a-f6f092fbfaf3"));
	 WebElement arrival = driver.findElement(By.id("7da5cf9e-f8e0-485d-931e-7f881f2254df"));
	 WebElement oneway_chk = driver.findElement(By.xpath("//input['@class='checkbox__input js-one-way control__one-way']"));
	  
	 //section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[3]/table/tbody//tr//td[@data-date='8']
	 WebElement depart_date = driver.findElement(By.xpath("//*[@id='panel0']/div/div/div/div[2]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[3]/table/tbody//tr//td[@data-date='8']"));
	 
	 WebElement search_flights = driver.findElement(By.xpath("//button//span[contains(text(),'Search flights')]"));
	 WebElement list_flights = driver.findElement(By.xpath("//div[@id='ctl00_c_ctlOutBoundHdr_dvSortFilter']"));
	 WebElement continue_to_passengers = driver.findElement(By.xpath("//a[@id='ctl00_c_lnkContinue']"));
	 
	 
	 
	 public void input_flyDate(String day, WebElement depart_date)
	 		{
		   		depart_date = driver.findElement(By.xpath("//section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[3]/table/tbody//tr//td[@data-date=day]"));
		   		depart_date.click();
		   		search_flights.click();
	 
	 		}
	 
	
@Given("^User opens application \"([^\"]*)\"$")
public void user_opens_application(String arg1) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C://Users//Rohit Jaju//Downloads//chromedriver_win32//chromedriver.exe");				
	WebDriver driver = new ChromeDriver();
	driver.get(arg1);
    
}

@When("^user selects \"([^\"]*)\" and \"([^\"]*)\" destination$")
public void user_selects_departure_and_arrival_destination(String arg1, String arg2) throws Throwable {
	departure.sendKeys(arg1);
	arrival.sendKeys(arg2);
    throw new PendingException();
}

@When("^user selects flight type \"([^\"]*)\"$")
public void user_selects_flight_type_i_e_return_or_oneway(String type) throws Throwable {
	oneway_chk.sendKeys(type);
    throw new PendingException();
}

@When("^user selects the flight date multiple dates if flight is return/oneway$")
public void user_selects_the_flight_date_multiple_dates_if_flight_is_return_oneway() throws Throwable {
	
	depart_date.click();
	search_flights.click();
	
    throw new PendingException();
}

@Then("^Validate the Flight listing$")
public void validate_the_Flight_listing() throws Throwable {
	if(list_flights.isDisplayed())
	System.out.println("Validated Flight Listing Successfully");
	else {
		System.out.println("Validated Flight Listing Failed");
	}
    throw new PendingException();
}
	

	
}
