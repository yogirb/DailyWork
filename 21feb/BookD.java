package newproject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class BookD {
	public static void main(String[] args) throws IOException	
	{
		Scanner sc=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Enter your choice:");
		System.out.println("1:Enter the book details:");
		System.out.println("2:Display the book details:");
		System.out.println("3:Exit");		
		int num=sc.nextInt();	
		
		switch(num)
		{
		case 1:
			System.out.println("Enter book name:");
			String bname1=br.readLine();
			
	        String bname="Book name:"+bname1;		
	        
	        System.out.println("Enter author name:");
	        
			String aname1=br.readLine();
			
			String aname="Author name:"+aname1;		
			
			System.out.println("Enter book price:");
			
			int price=sc.nextInt();	
			
			String pr1=Integer.toString(price);
			
			String pr="price:"+pr1;		
			
			String path="C:\\Users\\seed\\Desktop\\it.txt";
			
			
			FileOutputStream out=new FileOutputStream(path,true);
			
			String message="CTS";
			
			byte b1[]=bname.getBytes();
			byte b2[]=aname.getBytes();
			byte b3[]=pr.getBytes();
			out.write(b1);
			out.write(b2);
			out.write(b3);
			out.close();
			break;		
			case 2:			
			String path1="C:\\Users\\seed\\Desktop\\it.txt";
			FileInputStream in=new FileInputStream(path1);			
			int i;
			while((i=in.read())!=-1) {
				System.out.print((char)i);
		}
		case 3:
			System.exit(0);
		default:
			System.out.println("Input is invalid");
		break;
		}	}
}