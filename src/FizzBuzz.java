
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for(int number=1; number<=100; number++) {
			String numberstring =String.valueOf(number);
			if(number%3==0 && number%5==0) {
				numberstring ="FizzBuzz";
				System.out.println(numberstring);
			}else if(number%3==0 && number%5!=0) {
				numberstring ="Fizz";
				System.out.println(numberstring);
			}else if(number%3!=0 && number%5==0) {
				numberstring ="Buzz";
				System.out.println(numberstring);
			}else {
				System.out.println(number);
			}
			
		}
		
	}

}
