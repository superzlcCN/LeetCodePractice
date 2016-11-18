
public class AddDigits258 {
	public static int addDigits(int num){
		if(num < 10){
			return num;
		}
		int res = 0;
		while(num!= 0){
			res += (num %10);
			num/= 10;
		}
		return addDigits(res);
	}
	
	public static void main(String[] args){
		System.out.println(addDigits(19));
	}
}
