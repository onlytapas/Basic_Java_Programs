package JavaPrograms;

public class GreatestNumber {
	
	//Find the greatest of three numbers
	
	public void findGreatestNumber (int num1, int num2, int num3){
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(num1 + " is greatest");
		}else if(num2 >num3)
		{
			System.out.println(num2 + " is greatest");
		}else
		{
			System.out.println(num3 + " is greatest");
		}
	}
	
	
	//Find the greatest numbers
	public void greatesNumber()
	{
		int greatest = 0;
		int num[] = {3,24,11,67,85,6,36, 24, 36, 10};
		greatest =  num[0];
		for(int i=0; i<num.length; i++)
		{
			if(num[i]>greatest)
				greatest = num[i];						
		}		
		System.out.println(greatest);
	}
}
