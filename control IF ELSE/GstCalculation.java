package com.xworkz.control;

public class GstCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price=4000;
		double taxAmount;
		if(price<=2000) {
			taxAmount=(price*0.2)/100;
			System.out.println("The TAXAMOUNT IS: "+taxAmount);
		}
		else if(price>=3000 && price <= 5000) {
			taxAmount=(price*0.3)/100;
			System.out.println("The TAXAMOUNT IS: "+taxAmount);
		}
		else if(price >=4000 && price<=5000) {
			taxAmount=(price*0.4)/100;
			System.out.println("The TAXAMOUNT IS: "+taxAmount);
		}
		else if(price >=5000 && price<=6000) {
			taxAmount=(price*0.5)/100;
			System.out.println("The TAXAMOUNT IS: "+taxAmount);
		}
		else if(price>=6000){
			taxAmount=(price*0.6)/100;
			System.out.println("The TAXAMOUNT IS: "+taxAmount);
		}
		
	}
	
}


