package com.Pompages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Step;

public class LanguageSetup {
	
	WebDriver driver;
    WebDriverWait wait;
    
    String georgian ="ქართული";
    String megruli ="მეგრული";
    String svanuri ="სვანური";

    By setLanguage = By.xpath("//div[@id='languageSwitcherBtn']");
    By georgianLanguage = By.xpath("//div[@class='sub-language']//p[@class='paragraph-14'][contains(text(),'ქართული')]");
    By megruliLanguage = By.xpath("//div[@class='sub-language']//p[@class='paragraph-14'][contains(text(),'მეგრული')]");
    By svanuriLanguage = By.xpath("//div[@class='sub-language']//p[@class='paragraph-14'][contains(text(),'სვანური')]");
    By english =By.xpath("//p[normalize-space()='English']");
    By errorMessage = By.xpath("//div[@class='error-msg']");

    public LanguageSetup(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    @Step("Clicking on language setup btn")
    public void clickLanguageBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(setLanguage)).click();
    }

    @Step("Select the language: {0}")
    public void selectLanguage(String language) {
    	try {

    	if(language.trim().equalsIgnoreCase("Georgian"))
        wait.until(ExpectedConditions.visibilityOfElementLocated(georgianLanguage)).click();
    	else if(language.trim().equalsIgnoreCase("Megruli"))
            wait.until(ExpectedConditions.visibilityOfElementLocated(megruliLanguage)).click();
    	else if(language.trim().equalsIgnoreCase("Svanuri"))
            wait.until(ExpectedConditions.visibilityOfElementLocated(svanuriLanguage)).click();
    	else 
    		wait.until(ExpectedConditions.visibilityOfElementLocated(english)).click();

    		System.out.println(language+" is selected");
    	}catch(Exception e)	{
    		e.printStackTrace();
    		System.out.println(language+"  selection failed or not found");

    	}

    }

}
