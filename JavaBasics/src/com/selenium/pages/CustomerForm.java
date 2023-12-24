package com.selenium.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class CustomerForm { // Do not change the class name

	WebDriver driver;

	public CustomerForm(WebDriver driver) {

		this.driver = driver;

	}

	public void setCustomerName(String cName) {

		driver.findElement(By.xpath("//input[@name='cname']")).sendKeys(cName);

	}

	public void setAge(String age) {

		driver.findElement(By.xpath("//input[@name='age']")).sendKeys(age);

	}

	public void setAddress(String address) {

		driver.findElement(By.xpath("//input[@name='address']")).sendKeys(address);

	}

	public void setPhoneNumber(String phoneNumber) {

		driver.findElement(By.xpath("//input[@name='phonenumber']")).sendKeys(phoneNumber);

	}

	public void setEmail(String email) {

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);

	}

	public void submitForm() {

		driver.findElement(By.xpath("//input[@id='submit']")).click();

	}

	public String getErrorMessage() {

		return driver.findElement(By.xpath("//div[@id='message']")).getText();

	}

	public String resetData() {

		return driver.findElement(By.xpath("//div[@id='reset']")).getText();

	}

}