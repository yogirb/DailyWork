package newproject;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BookDetails 
{
	public static void main(String[] args) throws IOException	
	{
		String path="C:\\Users\\seed\\Desktop\\it.txt";
		
		Scanner sc=new Scanner(System.in);
		FileWriter out=new FileWriter(path);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		System.out.println("Enter your choice");	
		
		int num=sc.nextInt();	
		switch(num)
		{
		case 1:
			
			System.out.println("1:Enter the book details:");
			System.out.println("Enter book name:");
	        String bname=br.readLine();			
			System.out.println("Enter author name:");
			String aname=br.readLine();			
			System.out.println("Enter book price:");
			int price=sc.nextInt();		
			
		case 2:
			System.out.println("2:Display the book details:");
			//out.read(bname);
			System.out.println(bname);
			
			break;
			
		case 3:
			System.out.println("3:Exit");	
			
		}		
		
	}
}