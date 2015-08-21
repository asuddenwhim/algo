import java.util.*;
import java.lang.*;
import java.io.*;

class BinarySearch {

	public static int binary_search(int[]arr, int low, int high, int key){
		int mid = (low+high)/2;
		if(arr[mid]==key) return mid;
		else if(arr[mid]<key) return binary_search(arr,mid+1,high,key);
		return binary_search(arr,low,mid-1,key);
	}

	public static void main(String []args){
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the integers seperated by space: ");
		String num = c.nextLine();
		System.out.println("Enter the integer to be found: ");
		String keyy = c.nextLine();
		String tokens [] = num.split("\\s+");
		int arr[] = new int[tokens.length];
		int k=0;
		for(String i : tokens){
			arr[k] = Integer.parseInt(i); 
			k++;
		}
		int key = Integer.parseInt(keyy);
		int pos = binary_search(arr,0,tokens.length-1,key)+1;
		System.out.println("Binary Search, pos:"+ pos);
	}
}