import java.util.Scanner;

public class Main2 {
	public static int fun(String str){
		int max = 0;
		int len = 0;
		
		for(int i = 0; i < str.length();i++){
			if(!isKey(str.charAt(i))){
				len++;
			}else{
				if(len > max){
					max = len;
					len = 0;
				}
			}
		}
		
		if(!isKey(str.charAt(0))){
			if(!isKey(str.charAt(str.length()-1))){
				int i = 0;
				int len1 = 0;
				while(!isKey(str.charAt(i))){
					i++;
					len1++;
				}
				int len2 = 0;
				int j = str.length()-1;
			
				while(!isKey(str.charAt(j))){
					j--;
					len2 ++;
				}
				if(len1+len2 > max){
					max = len1 + len2;
				}
			}
			
			
		}
		return max;
	}
	
	private static boolean isKey(char c){
		switch (c) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
			return true;
		default:
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String l = scanner.nextLine();
		
			System.out.println(fun(l));
		}
		
	}
	
}
