package JavaPrograms;

 public class ReverseNumber {
	 
	 //To verify number is Palindrome
	 
	 public void reverseNumber(int num){
		 
		 int oldnum = num;
		 int digit = 0;
		 int reverse = 0;
		 
		 while(num!=0)
		 {
			 digit = num%10;
			 reverse = reverse*10 + digit;
			 num = num/10;		 
		 }
		 	System.out.println(reverse);
	 
	 if(oldnum == reverse)
	 {
		 System.out.println("Is palindrome");
		 
	 }else
	 {
		 System.out.println("Not palindrome");
	 }
 }	 
}
