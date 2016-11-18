
public class SingleNumerIII {
	public static int[] singleNumer(int[] nums){
		int[] res = new int[2];
		int xor = 0;
		
		for (int i : nums) {
			xor = xor ^ i;
		}
		
		res[0] = 0;
		res[1] = 0;
		
		int n = xor & (~(xor-1));
		for (int i : nums) {
			if((i & n)!=0){
				res[0] = res[0] ^ i;
			}else{
				res[1] = res[1] ^ i;
			}
		}
		
		return res;
	}
	public static void main(String[] args){
		int[] nn = {1,2,1,3,5,2};
		int[] rr = singleNumer(nn);
		System.out.println(rr[0]);
	}
}
