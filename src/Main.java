import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			if(n > 0){
				List<String> list = fun1(n);
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			}
		}	
	}

	public static List<String> fun1(int n){
		List<String> result = new ArrayList<String>();
		if (n==1) {
			result.add("()");
		}else{
			List<String> result1 = fun1(n-1);
			for (int i = 0; i <result1.size(); i++) {
				if(!result.contains("("+result1.get(i)+")"))
					result.add("("+result1.get(i)+")");
				
				if(!result.contains("()"+result1.get(i)))
					result.add("()"+result1.get(i));
				
				if(!result.contains(result1.get(i)+"()"))
					result.add("()"+result1.get(i));
			}
			
		}
		return result;
	}
	
}
