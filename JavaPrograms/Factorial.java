package JavaPrograms;

public class Factorial {
	
	////Calculate Factorial 
	
	public void caculateFactorial(int num){
		int f = 1;
		for(int i=num; i>0; i--)
		{
			f = f * i;
			System.out.println(f);
		}		
		System.out.println("The factorial of " + num + " is " + f);
	}
}
