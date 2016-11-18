
public class CanWinNim292 {

	public boolean canWinNim(int n){
		return n%4!=0;
	}
	
	public static void main(String[] args){
		CanWinNim292 n = new CanWinNim292();
		System.out.println(n.canWinNim(5));
	}
}
