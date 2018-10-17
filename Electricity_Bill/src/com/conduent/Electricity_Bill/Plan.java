package com.conduent.Electricity_Bill;  
public abstract class Plan {
	protected double rate;  
    abstract void getRate();  

    public void calculateBill(int units){  
         System.out.println(units*rate);  
     }  
}
