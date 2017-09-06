package JavaPrograms;

public class ExtractNumber {
	
	public void extractNumer(){
		int num = 345;
		int res = num/100;
		System.out.println(res);
		int res1 = (num/10)%10;
		System.out.println(res1);
		int res2 = num%10;
		System.out.println(res2);
	}

}
