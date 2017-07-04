package com.Arrays;
/*This class will elustrate the use of array*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  num[]=new int[10]; //Initialised the array with size 10
		
		for(int i=1;i<10;i++){  //Inserting the elements in the array
			num[i]=i;
		}
		
		for(int i=1;i<10;i++){			//Displaying the even elements of the array
			
			if(i%2==0){
			System.out.println(num[i]);			//Printing the even numbers
		}
		

	}
}
}
