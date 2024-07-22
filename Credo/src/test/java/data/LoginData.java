package data;

import org.testng.annotations.DataProvider;

import utils.RandomStringUtils;
public class LoginData {

	    @DataProvider(name = "loginData")
	    public static Object[][] loginData() {
	    	
	    	RandomStringUtils r =new RandomStringUtils();

	        return new Object[][]{
			{r.getRandomAlphaNumeric(51), r.getRandomAlphaNumeric(), "Georgian"},
		    {r.getRandomAlphaNumeric(), r.getRandomAlphaNumeric(), "Georgian"},
		    {r.getRandomAlphaNumeric(), "   ", "Georgian"},

			{r.getRandomAlphaNumeric(51), r.getRandomAlphaNumeric(), "Megruli"},
			{r.getRandomAlphaNumeric(), r.getRandomAlphaNumeric(), "Megruli"},
			{r.getRandomAlphaNumeric(), "   ", "Megruli"},

			{r.getRandomAlphaNumeric(51), r.getRandomAlphaNumeric(), "Svanuri"},
			{r.getRandomAlphaNumeric(), r.getRandomAlphaNumeric(), "Svanuri"},
			{r.getRandomAlphaNumeric(), "   ", "Svanuri"},

			{r.getRandomAlphaNumeric(), r.getRandomAlphaNumeric(5), "english"}
	        };
	    }
	

}
