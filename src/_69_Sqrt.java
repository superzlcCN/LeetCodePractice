import java.util.ArrayList;
import java.util.List;


public class _69_Sqrt {
	public int mySqrt(int x){
		if(x==0)
			return 0;
		double last = 0;
		double cur = 1;
		
		while(last!=cur){
			last = cur;
			cur = (x/last + last)/2.0;
		}
		List a=new ArrayList(); 
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.trimToSize();
		
		return (int)cur;
	
	}
	
	
	public int Sqrt(int x){
		if(x==0)
			return 0;
		
		int begin = 0;
		int end = (x+1)/2;
		
		while(begin < end){
			int mid = begin + (end-begin)/2;
			int tmp = mid * mid;
			if(tmp == x)
				return mid;
			if(tmp < x){
				begin = mid;
			} else{
				end = mid;
			}
		}
		int tmp = end * end;
		if (tmp > x) {
			return end-1;
		}else {
			return end;
		}
		
		}
}
