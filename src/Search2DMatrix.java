
public class Search2DMatrix {
	public static boolean searchMatrix(int[][] matrix,int target){
		int begin = 0;
		int end = matrix.length-1;
		if(begin != end){
			while(begin <= end){
				int mid = begin + (end - begin)/2;
				if(matrix[mid][0] == target){
					return true;
				}else if(matrix[mid][0] > target){
					end = mid - 1;
				}else{
					begin = mid + 1;
				}
			}
		}
		
		if(end == -1){
			return false;
		}
		int row = end;
		begin = 0;
		end = matrix[end].length-1;
		while(begin<=end){
			int mid = begin + (end - begin)/2;
			if (matrix[row][mid] == target) {
				return true;
			}else if(matrix[row][mid] > target){
				end = mid-1;
			}else{
				begin = mid + 1;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args){
		int[] nums1 = {1,3,5,7};
		int[] nums2 = {10,11,16,20};
		int[] nums3 = {23,30,34,50};
		
		
		int[][] nums = {nums1,nums2,nums3};
		int[] nums4 = {1,10,23};
		//System.out.println(binSearch(nums4,1));
		System.out.println(searchMatrix(nums,11));
	}
}
