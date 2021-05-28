package day2lab;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[]arr=new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
