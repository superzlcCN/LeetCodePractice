import java.lang.reflect.Array;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Base64.Decoder;

import javax.naming.spi.DirStateFactory.Result;

/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.
 * @author zlc
 *
 */
public class _91_DecodeWays {

	
	public int numDecoding(String s){
		if (s == null || s.length() == 0) {
			return 0;
		}
		char[] arr_ch = s.toCharArray();
		int[] result = new int[arr_ch.length];
		
		for(int i = result.length-1; i >= 0;i--){
			if (arr_ch[i]-'0' > 0)
			if (i == result.length-1) {
				result[i] = 1;
			}else{
				String str_num = String.valueOf(new char[]{arr_ch[i],arr_ch[i+1]});
				if ( Integer.valueOf(str_num)< 27) {
					result[i] = ((i + 2) < arr_ch.length)?result[i+1]+result[i+2]:result[i+1]+1;
				}else{
					result[i] = result[i+1];
				}
			}
		}
		return result[0];
	}
	
}
