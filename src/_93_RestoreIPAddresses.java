import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.

For example:
Given "25525511135",

return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)

 */

public class _93_RestoreIPAddresses {
	
	public List<String> restoreIpAddresses(String s) {
		
		List<List<String>> _result = new ArrayList<>();
		List<String> result = new ArrayList<>();
		if (s==null||s.length()==0) {
			return result;
		}
		
		if (s.matches("^0+&")) {
			result.add("0.0.0.0");
			return result;
		}
		_restoreIP(_result, s, 0, new ArrayList<String>());
		
		_result.stream().forEach(
				el->{
					String ip_add = el.stream().collect(Collectors.joining("."));
					result.add(ip_add);
				}
		);
		
		
		return result;
    }
	
	public void _restoreIP(List<List<String>> result,String s,int start,List<String> ip_str){
		
		if(start == s.length() && ip_str.size() < 4){
			int temp = 4 - ip_str.size();
			for (int i = 0; i < temp;i++) {
				ip_str.add("0");
				
			}
			result.add(new ArrayList<>(ip_str));
			for (int i = 0; i < temp;i++) {
				ip_str.remove(ip_str.size()-1);  //将添加的0位删除，以免干扰后续处理过程
			}
			return;
		}
		int temp = 4 - ip_str.size();
		if (temp * 3 < s.length()-start) { //当剩余字符大于ip缺值时直接返回
			return;
		}
		
		if (ip_str.size()==4) {
			if (start == s.length()) {
				result.add(new ArrayList<>(ip_str));
				
			}
			return;
		}
		if(start >= s.length())
			return;
		
		
		ip_str.add(s.substring(start,start+1));
		_restoreIP(result, s, start+1, ip_str);
		ip_str.remove(ip_str.size()-1);
		
		if (start+1<s.length()) {
			ip_str.add(s.substring(start,start+2));
			_restoreIP(result, s, start+2, ip_str);
			ip_str.remove(ip_str.size()-1);
		}
		
		if (start+2<s.length()) {
			int num = Integer.valueOf(s.substring(start,start+3));
			if (num <= 255) {
				ip_str.add(String.valueOf(num));
				_restoreIP(result, s, start+3, ip_str);
				ip_str.remove(ip_str.size()-1);
			}
		}	
	}
	
	public static void main(String[] args) {
		String ip_addr = "0";
		_93_RestoreIPAddresses n = new _93_RestoreIPAddresses();
		System.out.println(n.restoreIpAddresses(ip_addr));
	}
}
