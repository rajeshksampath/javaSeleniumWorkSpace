package com.selenium.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class DisplayCustomer {

	WebDriver browser;

	public DisplayCustomer(WebDriver driver) {

		this.browser = driver;

	}

	public String getTitle() {

		return browser.findElement(By.xpath("//h2[@align='left']")).getText();

	}

	public String getName() {

		return browser.findElement(By.xpath("//table//tbody//tr[1]//td[2]")).getText();

	}

	public String getAge() {

		return browser.findElement(By.xpath("//table//tbody//tr[2]//td[2]")).getText();

	}

	public String getAddress() {

		return browser.findElement(By.xpath("//table//tbody//tr[3]//td[2]")).getText();

	}

	public String getPhoneNumber() {

		return browser.findElement(By.xpath("//table//tbody//tr[4]//td[2]")).getText();

	}

	public String getEmail() {

		return browser.findElement(By.xpath("//table//tbody//tr[5]//td[2]")).getText();

	}

}
