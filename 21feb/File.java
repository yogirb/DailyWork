package newproject;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

public class File {

	public static void main(String[] args) throws FileNotFoundException, IOException
	
	{
		
		String path1="C:\\Users\\seed\\Desktop\\it.txt";
		String path2="C:\\Users\\seed\\Desktop\\cs.txt";
		String path3="C:\\Users\\seed\\Desktop\\etc.txt";
		String path4="C:\\Users\\seed\\Desktop\\mech.txt";
		
		
		FileOutputStream  out1=new FileOutputStream(path1);
		FileOutputStream  out2=new FileOutputStream(path2);
		FileOutputStream  out3=new FileOutputStream(path3);
		FileOutputStream  out4=new FileOutputStream(path4);
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		String data="the common data";
		byte[] b=data.getBytes();
		
		bout.write(b);
		
		bout.writeTo(out1);
		bout.writeTo(out2);
		bout.writeTo(out3);
		bout.writeTo(out4);
	}


}
