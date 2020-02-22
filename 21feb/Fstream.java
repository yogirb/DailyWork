package newproject;

//file output stream

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Fstream {

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		//FileOutputStream  out=new FileOutputStream();
		String path="C:\\Users\\seed\\Desktop\\new 1.txt";
		FileOutputStream  out=new FileOutputStream(path, true);
		
		String message="the joining date waw 28 jan";
		byte b[]=message.getBytes();
		out.write(b);
		out.close();
	}

}
