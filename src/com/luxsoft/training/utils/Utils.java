package com.luxsoft.training.utils;
import com.luxoft.training.lab2.employees.Employer;
import com.luxoft.training.lab2.employees.PaymentCalcDemo;


public class Utils {

    static public void sort(Employer[] EmpArray, int left, int right)
    {
        int i, j, p;
        Employer[] tmp;
        i=left;
        j=right;
        while (i!=j){
            if((EmpArray.length.compareTo(EmpArray.length)>0)!=(i>j)){
                tmp=mas[i];
                mas[i]=mas[j];
                mas[j]=tmp;

                p=i;
                i=j;

                if (p<j)
                    j=p+1;
                else j=p-1;
            }else{
                if (i<j) j--;
                else j++;
            }
        }

        if (left<i-1) sort(mas,left,i-1);
        if (i+1<right) sort(mas,i+1,right);
    }



}