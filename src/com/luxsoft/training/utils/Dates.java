package com.luxsoft.training.utils;
public class Dates{
	public int day,month,year;
	public void Dates(int day, int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
		}
	public String PrintDate(){
		return day+"/"+month+"/"+year;
	}
	
}