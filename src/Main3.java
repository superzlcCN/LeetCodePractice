import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			int m = in.nextInt();
		}
		/*Scanner in = new Scanner(System.in);
		  
	       
		while (in.hasNextInt()) {//注意while处理多个case
		    int num = in.nextInt();
		    int m = calNumOf1(num);
		    int num2 = num+1;
		    while(m!=calNumOf1(num2)){
		    	num2++;
		    }
		    System.out.println(num2);
		}
		*/
		
		int m = '9'-'0';
		System.out.println(getMyRet("3+8×2/9-2"));
		
	//	System.out.println(getDiffNum(3,"1,3,5",5,"2,4,1,7,5"));
		//System.out.println(getOutString(4, "3,1,2,4", 7));
	}

	public static int getDiffNum(int len1,String s1,int len2,String s2){
		
		String[] ch_arr1 = s1.split(",");
		String[] ch_arr2 = s2.split(",");
		int i = ch_arr1.length-1;
		int j = ch_arr2.length-1;
		int count = 0;
		
		while(i >= 0 && j >= 0){
			String c1 = ch_arr1[i--];
			String c2 = ch_arr2[j--];
			if(!c1.equals(c2))
				count++;
		}
		
		return count;
	}
	
	public static String getOutString(int len,String str,int m){
		String[] arr = str.split(",");
		
		StringBuilder result = new StringBuilder();
		
		List<String> list1 = new ArrayList<String>();
		
		for (int i = 0; i < arr.length; i++) {
			list1.add(arr[i]);
		}
		
		int step = m % list1.size();
		while(list1.size() > 1){
			result.append(list1.get(step-1));
			m = Integer.parseInt(list1.get(step-1));
			list1.remove(step-1);
			step = (step + m) % list1.size();
			
		}
		result.append(list1.get(0));
		return result.toString();
	}
	private static int getMyRet(String str){
		char[] c_arr = str.toCharArray();
		Stack<Character> opr_stack = new Stack<Character>();
		Stack<Integer> num_stack = new Stack<Integer>();
		
		for (int i = 0; i < c_arr.length; i++) {
			char c = c_arr[i];
			switch (c) {
			case '+':
			case '-':
			{
				opr_stack.push(c);
				break;
			}
			case '×':
			{
				int num1 = num_stack.pop();
				int num2 = c_arr[i+1]-'0';
				num_stack.push(num1*num2);
				i++;
				break;
			}
			case '/':{
				int num1 = num_stack.pop();
				int num2 = c_arr[i+1]-'0';
				num_stack.push(num1/num2);
				i++;
				break;
			}

			default:
				num_stack.push(c-'0');
				break;
			}
		}
		while(!opr_stack.isEmpty()){
			char opr = opr_stack.pop();
			int num1 = num_stack.pop();
			int num2 = num_stack.pop();
			switch (opr) {
			case '+':
				
				num_stack.push(num1+num2);
				break;
			case '-':
				num_stack.push(num2-num1);
				break;
			default:
				break;
			}
		}
		return num_stack.pop();
	}
	
}
