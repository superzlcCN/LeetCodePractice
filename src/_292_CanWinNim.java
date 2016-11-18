
public class _292_CanWinNim {

	public boolean canWinNim(int n){
		return n%4!=0;
	}
	
	public static void main(String[] args){
		_292_CanWinNim n = new _292_CanWinNim();
		System.out.println(n.canWinNim(5));
	}
}
