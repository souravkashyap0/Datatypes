package com.xworkz.control;

public class TollGate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String registration="KA";//registration ="DL"it is not allowed 
		if (registration=="KA") {
			System.out.println("The vehicles are allowed in every tollgate for free");
		}
		else {
			System.out.println("The vehicles are not allowed in every tollgate for free and the owners need to pay the toll tax or road tax");
		}
	}

}
