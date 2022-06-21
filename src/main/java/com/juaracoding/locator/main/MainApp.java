package com.juaracoding.locator.main;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.locator.driver.DriverSingleton;
import com.juaracoding.locator.pages.Login;
import com.juaracoding.locator.pages.Register;

public class MainApp {

	public static void main(String[] args) {
		@SuppressWarnings("static-access")
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("http://automationpractice.com/index.php");
		
		Login login = new Login();
		login.fieldEmptyIsErrorCase();
		login.fieldEmailNotValidatingCase();
		login.fieldCompletedCase();
		
		Register regis = new Register();
		regis.regis();
		regis.fieldEmptyFormPersonalIsErrorCase();
		regis.fieldFormatFormPersonalIsNotValidCase();
		regis.fieldCompletedFormPersonalIsSuccessCase();
		regis.fieldCompletedYourAddresslIsSuccessCase();
		
	
	}}
