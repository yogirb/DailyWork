package newproject;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	
	
	
	public static void serialize(Employee employee,String path)
	{
		
		try {
			FileOutputStream fout = new FileOutputStream(path);
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			ObjectOutputStream oos =new ObjectOutputStream(bout);
			oos.writeObject(employee);
			oos.close();
			bout.close();
			fout.close();
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public static Object deserialize(String filePath) throws ClassNotFoundException
	
	{
		try {
			FileInputStream fin =new FileInputStream(filePath);
			BufferedInputStream bin=new BufferedInputStream(fin);
			ObjectInputStream oin=new ObjectInputStream(bin);
			Object obj=oin.readObject();
			return obj;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		//Employee employee = new Employee(201,"yogi","pune","pat", 15,5555555, 1236547896);
	//	serialize(employee,"employee.txt");
		//System.out.println("object saved");
		
		Employee employee=(Employee) deserialize("employee.txt");
		System.out.println(employee);
		
		
	}

}
