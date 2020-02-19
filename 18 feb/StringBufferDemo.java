package newproject;

public class StringBufferDemo {
	
	public static void main(String...args)
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity()); 
		sb.append("hello world drugjgfj ghikghgyiftgif");
		System.out.println(sb.capacity());
		sb.insert(6,"asd");
		System.out.println(sb);
		//sb.replace(1,3, asd);
		//System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
