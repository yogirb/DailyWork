package newproject;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;



public class FileInStream {
	
	
	public static void main(String[] args) throws IOException
	{
		String path="C:\\Users\\seed\\Desktop\\new 1.txt";
		String newPath="C:\\Users\\seed\\Desktop\\new 2.txt";
		File file= new File(path);
		
		//System.out.println("File NAme:"+file.getName());
	//	System.out.println("File Length:"+file.length());
	//	System.out.println("Parent Name:"+file.getParent());
	//	System.out.println("File Length:"+file.());
	
		FileInputStream in =new FileInputStream(file);
		BufferedInputStream bin= new BufferedInputStream(in);
		
		FileOutputStream out =new  FileOutputStream(newPath);
		BufferedOutputStream bout =new BufferedOutputStream(out);
		//bout.close();
		int i;
		while((i=bin.read()) !=-1)
				{
			//System.out.print(i);System.out.print((char)i);
			//
			//bout.write(i);
			bout.close();
	         	}
	         	
		
		
		
	}

}
