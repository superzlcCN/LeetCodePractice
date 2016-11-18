
public class AddBinary_67 {
	public static String addBinary(String a, String b){
		int len_a = a.length();
		int len_b = b.length();
		String res = "";
		int c = 0;
		while(len_a >= 1 && len_b >= 1){
			len_a--;
			len_b--;
			int m = Integer.parseInt(String.valueOf(a.charAt(len_a)));
			int n = Integer.parseInt(String.valueOf(b.charAt(len_b)));
			
			if((m^n)==1){  // 0 1
				if (c == 0) {
					res += 1;
					c = 0;
				} else{
					res += 0;
					c = 1;
				}

			}else{
				if((m|n)==0){ // 0 0
					res += c;
					c = 0;
				}else{ // 1 1
					res += c;
					c = 1;
				}
			}
		} // end of while
		
		while(len_a >= 1){
			len_a--;
	
			int m = Integer.parseInt(String.valueOf(a.charAt(len_a)));
			if((m^c)==1){  // 0 1
				res += 1;
				c = 0;
			}else{
				if((m|c)==0){ // 0 0
					res += c;
					c = 0;
				}else{ // 1 1
					res += 0;
					c = 1;
				}
			}
		}
		
		while(len_b >= 1){
			len_b--;
			int m = Integer.parseInt(String.valueOf(b.charAt(len_b)));
			if((m^c)==1){  // 0 1
				res += 1;
				c = 0;
			}else{
				if((m|c)==0){ // 0 0
					res += c;
					c = 0;
				}else{ // 1 1
					res += 0;
					c = 1;
				}
			}
		}
		
		if(c == 1){
			res += c;
		}
		
		int len = res.length();
		String res1 = "";
		for (int i = len-1; i >= 0; i--) {
			res1 += res.charAt(i);
		}
		
		return res1;
	}

	public static void main(String[] args){
		String a = "11";
		String b ="111";
		
		String c = addBinary(a,b);
		
		System.out.println(c);
	}
}
