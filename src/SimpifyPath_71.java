import java.util.Iterator;
import java.util.Stack;

		
public class SimpifyPath_71 {
	public static String simplifyPath(String path) {
		String res = "";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < path.length(); i++) {
			switch (path.charAt(i)) {
			case '/':
				if(i>0 && !stack.isEmpty() &&stack.peek() == '/'){
					// do nothing
				}else{
					stack.push('/');
				}
				break;
			case '.':
				if(!stack.isEmpty() && stack.peek()=='.'){
					stack.push('.');
					break;
				}
				if (i + 1 < path.length()) {
					if(path.charAt(i+1)=='.'){
					if(i+2 < path.length() && path.charAt(i+2)!='/'){
						stack.push('.');
						break;
					}
					if(stack.size()>1){
						stack.pop();
						while(!stack.isEmpty()&&stack.peek()!='/'){
							stack.pop();
						}
					}
					}else {
						stack.push('.');
					}
					//stack.pop();
				}else{
					
				}
				break;
			default:
				stack.push(path.charAt(i));
				break;
			}
		} // end of for
		
		if (stack.peek()=='/' && stack.size()!=1) {
			stack.pop();
		}
		
		Iterator<Character> c = stack.iterator();
		
		while(c.hasNext()){
			res+=c.next();
		}
		
		return res;
    }
	
	public static void main(String[] args){
		String pathString ="/./";
		System.out.println(simplifyPath(pathString));
	}
}
