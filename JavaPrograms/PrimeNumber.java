package JavaPrograms;

public class PrimeNumber {
	
	//To verify number is Prime or not
	
	public void primeNumber(int num){
		
		int flag = 0;   
		  
		for(int i=2; i<num; i++)
		{    
		  if(num%i == 0)
		   {    
			  System.out.println(num + " is not prime");    
			  flag = 1;    
			  break;    
		   }		   	   
		 }    
		  if(flag == 0)    
		  System.out.println(num + " is prime");    
	}  
} 
