package com.cucumber.Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom_Class {
	@FindBy(id="username")
	public static WebElement userName;
	
	@FindBy(id="password")
	public static WebElement passWord;
	
	@FindBy(id="login")
	public static WebElement login;
	
	@FindBy(id="location")
	public static WebElement location;
	
	@FindBy(id="hotels")
	public static WebElement hotel;
	
	@FindBy(id="room_type")
	public static WebElement roomType;
	
	@FindBy(id="room_nos")
	public static WebElement roomNumber;
	
	@FindBy(id="datepick_in")
	public static WebElement dateIn;
	
	@FindBy(id="datepick_out")
	public static WebElement dateOut;
	
	@FindBy(id="adult_room")
	public static WebElement adultCount;
	
	@FindBy(id="child_room")
	public static WebElement childCount;
	
	@FindBy(id="Submit")
	public static WebElement submit;
	
	@FindBy(id="radiobutton_0")
	public static WebElement buttonClick;
	
	@FindBy(id="continue")
	public static WebElement continueClick;
	
	@FindBy(id="first_name")
	public static WebElement firstName;
	
	@FindBy(id="last_name")
	public static WebElement lastName;
	
	@FindBy(id="address")
	public static WebElement address;
	
	@FindBy(id="cc_num")
	public static WebElement cardNumber;
	
	@FindBy(id="cc_type")
	public static WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	public static WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	public static WebElement expYear;
	
	@FindBy(id="cc_cvv")
	public static WebElement ccvNumber;
	
	@FindBy(id="book_now")
	public static WebElement bookRoom;
	
	//new
	
	@FindBy(id="my_itinerary")
	public static WebElement itinerary;
	
	@FindBy(name="ids[]")
	public static WebElement checkbox;
	
	@FindBy(name="cancelall")
	public static WebElement cancelall;
	
	@FindBy(name="logout")
	public static WebElement logout;
	
	
	
	
	

}
