package com.masterCore;

public class P12_ArrayException {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		// TODO Auto-generated method stub
		try {
			for(int i = 0; i<= arr.length; i++)
				System.out.println(arr[i]);
			
		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println(e);
			System.err.println("Array Index out of bound!!!!");
			
		}
		
	}

}
