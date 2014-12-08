package com.luxoft.training.lab2.employees;
import java.util.Scanner;

import com.luxsoft.training.utils.Dates;



public class PaymentCalcDemo {
     public static void main(String[] args) {
        
         System.out.println("vvedite koli4estvo rabotnikov");
         int n, worktypenumber, salary, day, month, year;
         String surName;
         String name, worktype="";//- мес€чна€ ставка
        //- почасова€ оплата
        //- % от объема продаж
        //- базова€ мес€чна€ ставка + % от объема продаж
         
         Scanner scan = new Scanner(System.in);
         n= scan.nextInt();
         //создание и инициализаци€ массива работников
        Employer[] EmpArray = new Employer[n];
        
        for(int i =0;i<EmpArray.length;i++)
        {
            EmpArray[i] = new Employer();
            Dates date = new Dates();
            System.out.println("vvedite Name");
            name= scan.nextLine();
            System.out.println("vvedite Surname");
            surName= scan.nextLine();
            System.out.println("vvedite Date. For example 19.03.1971"
            		+ "vvedite Day");
            day=scan.nextInt();
            System.out.println("vvedite Month");
            month=scan.nextInt();
            System.out.println("vvedite Year");
            year=scan.nextInt();
            System.out.println("choose Worktype. Insert number of worktype"
            		+ ":1. monthly Salary"
            		+ "2.comissions and Base Salary"
            		+ "3.hourly rate"
            		+ "4.commissions");
            
            worktypenumber=scan.nextInt();
            if (worktypenumber == 1) { worktype= "monthly Salary";} else{
            	if (worktypenumber == 2){ worktype="comissions and Base Salary";} else{
            		if (worktypenumber == 3){ worktype="hourly rate";} else{ worktype="commissions";}
            		}
            	}
            
            System.out.println("vvedite Salary");
            salary=scan.nextInt();
            date.Dates(day,month,year);
            	EmpArray[i].Employer(name, surName, date, worktype,salary);
           // EmpArray[i].PrintEmploer();
            //System.out.println("");
        } 
        //сортировка массива работников по фамилии
        for(int i = 0;i<EmpArray.length;i++)
        {
            for(int j = 0;j<EmpArray.length-1;j++)
            {
                if(EmpArray[j].ESurName.charAt(0)>EmpArray[j+1].ESurName.charAt(0))
                {
                    Employer temp = new Employer();
                    temp = EmpArray[j];
                    EmpArray[j]=EmpArray[j+1];
                    EmpArray[j+1]=temp;
                }
            }
        }
        //¬ывод результата на экран ( каждый раз новый список)
        for(int i =0;i<EmpArray.length;i++)
        {
            EmpArray[i].PrintEmploer();
            System.out.println("");
        }
       
        // TODO code application logic here
    }
    
}

