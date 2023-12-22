package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressBook { // DO NOT change the class name

	static WebDriver driver;

	public WebDriver createDriver() {
		// Create driver, store in in static variable 'driver' and return it
		driver = DriverSetup.getWebDriver();
		// driver.get("http://webapps.tekstac.com/AddressBook/");
		//driver.manage().window().maximize();
		return driver;
	}

	public void setNewFormValues(String nickname, String contact, String company, String city, String country,
			String type) {
		// Find the form elements and set values by passing those values from 'main'
		// method.
		// Submit form to add the details
		driver.findElement(By.id("nickname")).sendKeys(nickname);
		driver.findElement(By.id("contact")).sendKeys(contact);
		driver.findElement(By.id("company")).sendKeys(company);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("country")).sendKeys(country);
		driver.findElement(By.id("type")).sendKeys(type);
		driver.findElement(By.id("add")).click();

	}

	public WebElement getNewNickName() {
		// Find and return the 'nickname' web element of the row displayed after first
		// submit
		WebElement nickname = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[1]"));
		// System.out.println(nickname);
		return nickname;
	}

	public WebElement getNewContact() {
		// Find and return the 'contact' web element of the row displayed after first
		// submit
		WebElement contact = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[2]"));
		return contact;
	}

	public WebElement getNewCompany() {
		// Find and return the 'company' web element of the row displayed after first
		// submit
		WebElement company = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[3]"));
		return company;
	}

	public WebElement getNewCity() {
		// Find and return the 'city' web element of the row displayed after first
		// submit
		WebElement city = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[4]"));
		return city;
	}

	public WebElement getNewCountry() {
		// Find and return the 'country' web element of the row displayed after first
		// submit
		WebElement country = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[5]"));
		return country;
	}

	public WebElement getNewType() {
		// Find and return the 'type' web element of the row displayed after first
		// submit
		WebElement type = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[6]"));
		return type;
	}

	public void editDetails() throws InterruptedException {
		// Find the first radio button and click
		// Find edit button and click
		driver.findElement(By.id("radio0")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("edit")).click();
	}

	public String getEditNickName() {
		// Find and return the 'nickname' value in the edit box in the form after
		// cicking edit
		// driver.findElement(By.xpath("//div[@id='t1']/table//td[2]/input[@id='nickname']")).click();
		// String name =
		// driver.findElement(By.xpath("//div[@id='t1']/table//td[2]/input[@id='nickname']")).getAttribute("value");
		String name = driver.findElement(By.id("nickname")).getAttribute("value");
		// driver.findElement(By.id("inputTag")).getAttribute("value");
		//// *[@id="nickname"]
		// *[@id="nickname"]
		System.out.println("Name is" + name);
		return name;

	}

	public String getEditContact() {
		// Find and return the 'contact' value in the edit box in the form after cicking
		// edit
		String contact = driver.findElement(By.id("contact")).getAttribute("value");
		System.out.println(contact);
		return contact;

	}

	public String EditNewCompany() {
		// Find and return the 'company' value in the edit box in the form after cicking
		// edit
		String company = driver.findElement(By.id("company")).getAttribute("value");
		System.out.println(company);
		return company;

	}

	public String getEditCity() {
		// Find and return the 'city' value in the edit box in the form after cicking
		// edit
		String city = driver.findElement(By.id("city")).getAttribute("value");
		System.out.println(city);
		return city;

	}

	public String getEditCountry() {
		// Find and return the 'country' value in the edit box in the form after cicking
		// edit
		String country = driver.findElement(By.id("country")).getAttribute("value");
		System.out.println(country);
		return country;

	}

	public String getEditType() {
		// Find and return the 'type' value in the edit box in the form after cicking
		// edit
		String type = driver.findElement(By.id("type")).getAttribute("value");
		System.out.println(type);
		return type;
	}

	public void setUpdateFormValues(String nickname, String contact, String company, String city, String country,
			String type) {
		// Set form values to update and submit (by passing those values from 'main'
		// method).
		driver.findElement(By.id("nickname")).clear();
		driver.findElement(By.id("contact")).clear();
		driver.findElement(By.id("company")).clear();
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("country")).clear();
		driver.findElement(By.id("type")).clear();

		driver.findElement(By.id("nickname")).sendKeys(nickname);
		driver.findElement(By.id("contact")).sendKeys(contact);
		driver.findElement(By.id("company")).sendKeys(company);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("country")).sendKeys(country);
		driver.findElement(By.id("type")).sendKeys(type);
		driver.findElement(By.id("add")).click();
	}

	public void deleteDetails() {
		// Find the SECOND row of address displayed and click the radio button
		// Find delete button and click to delete SECOND row
		driver.findElement(By.id("radio1")).click();
		driver.findElement(By.id("delete")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		AddressBook ab = new AddressBook();
		// Add required code
		driver = ab.createDriver();
		driver.get("https://webapps.tekstac.com/AddressBook/");
		driver.manage().window().maximize();
		ab.setNewFormValues("Terrance", "Terrance", "Cts", "CHN", "IN", "home");
		String nickname1 = ab.getNewNickName().getText();
		System.out.println("name" + nickname1);
		String contact1 = ab.getNewContact().getText();
		System.out.println("contact-->" + contact1);
		String city1 = ab.getNewCity().getText();
		System.out.println("City-->" + city1);
		String company1 = ab.getNewCompany().getText();
		System.out.println("company--->" + company1);
		String country1 = ab.getNewCountry().getText();
		System.out.println("country---?" + country1);
		String type1 = ab.getNewType().getText();
		System.out.println("type---?" + type1);
		ab.editDetails();
		ab.setUpdateFormValues("Joshua", "Josh", "Cts1", "CHN", "IND", "Office");
		ab.editDetails();
		String nickname = ab.getEditNickName();
		System.out.println("name" + nickname);
		String contact = ab.getEditContact();
		System.out.println("contact-->" + contact);
		String city = ab.getEditCity();
		System.out.println("City-->" + city);
		String company = ab.EditNewCompany();
		System.out.println("company--->" + company);
		String country = ab.getEditCountry();
		System.out.println("country---?" + country);
		String type = ab.getEditType();
		System.out.println("type---?" + type);
		ab.setUpdateFormValues("Terrance", "Teri", "Cts1", "CBE1", "IN1", "home1");
		// ab.setUpdateFormValues("Abirami1","Abi1","Cts1","CBE1","IN1","home1");
		ab.setNewFormValues("Terrance", "Terrance", "Cts", "CBE", "IN", "home");
		ab.deleteDetails();
	}
}
