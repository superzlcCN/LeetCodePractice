import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;


public class TestA {
	public void solve(int n,ArrayList<Integer> list,ArrayList<Integer> cost){
		HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
		int max_high = 0; //最长腿的高度
		int index_high = 0;
		for (int i = 0; i < list.size(); i++) {
			h1.put(list.get(i), h1.get(list.get(i))+1); //key:长度,value:桌子序号
			if(max_high < h1.get(list.get(i))){
				max_high = list.get(i);
				index_high = i;
			}
		}
		
		
		if(h1.get(max_high)>n/2){
			return;
		}
		
		Collections.sort(list);
		
		
		int n1 = h1.get(max_high);
		int l1 = n;
		int cost1 = 0;
		
		while(n1 > l1/2){
			for(int i = 0; i < list.size();i++){
				int mins = list.get(i);
				l1--;
				cost1+=list.get(i);
				if(n1 > l1/2){
					break;
				}
			}
		}
		
		
		
		
	}
	
	public static void main(String[] args){
		TestA b = new TestA();
	}
}
