package newproject;
public class DuplicateArray {  
	
	public static void main(String[] args) {      
          
      
        int [] arr = new int [] {5,1,1};   
          
      
     
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                {
                	
                	  System.out.println(arr[j]);  
                	
                }
                 
            }  
            
           
            
            
            
        }  
    }  
}  