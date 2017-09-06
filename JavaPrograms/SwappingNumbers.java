package JavaPrograms;

public class SwappingNumbers {
	
	//Swapping two numbers without using third variable
	
	public void swappingNumbers(int num1, int num2){
		     
        System.out.println("Before Swapping");
        System.out.println("Value of num1 is :" + num1);
        System.out.println("Value of num2 is :" + num2);
       
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
       
        System.out.println("After Swapping");
        System.out.println("Value of num1 is :" + num1);
        System.out.println("Value of num2 is :" + num2);
	}

}