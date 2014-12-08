package com.luxoft.training.lab2.employees;
//import com.luxoft.training.lab2.employees.Classes;

import com.luxsoft.training.utils.Dates;

import java.util.*;

public class Employer {
    public String EName;
    public String ESurName;
    public Dates EDate;
    public String WorkType;//- месячная ставка
                        //- почасовая оплата
                        //- % от объема продаж
                        //- базовая месячная ставка + % от объема продаж
    public int salary;
    public int hours = -1;
    public int hourly_rate = -1;
    public int BaseSalary =-1;
    public int SalesAmount = -1;
    public int comissions = -1;
    
   public void Employer(String Name,String SurName,Dates date,String worktype,int ssalary)
    {
        EName = Name;
        ESurName = SurName;
        EDate= new Dates();
        EDate.day= date.day;
        EDate.month=date.month;
        EDate.year=date.year;
        
        salary= ssalary;
        WorkType=worktype;
    }
        
        
    public void PrintEmploer()
    {
        System.out.println("EName:"+EName);
        System.out.println("ESurName:"+ESurName);
        EDate.PrintDate(); 
        System.out.println("Payment type:"+WorkType);
        
        if(WorkType == "monthly Salary")
        {
            System.out.println(WorkType+":"+salary);
            System.out.println("payment:"+(salary+200));
            
            //setSalary(salary+200);
        }
        if(WorkType == "comissions and Base Salary")
        {
            System.out.println("Sales Amount:"+SalesAmount);
            System.out.println("comissions:"+comissions);
            System.out.println("Base Salary:"+BaseSalary);
            System.out.println("payment:"+(BaseSalary+SalesAmount/comissions));
        }
        if(WorkType == "hourly rate")
        {
            System.out.println("hourly rate:"+hourly_rate);
            System.out.println("hours:"+hours);
            System.out.println("payment:"+(hours*hourly_rate));
        }
        if(WorkType == "commissions")
        {
             System.out.println("Sales Amount:"+SalesAmount);
            System.out.println("comissions:"+comissions);
            System.out.println("payment:"+(SalesAmount/comissions));
        }
    }
}
