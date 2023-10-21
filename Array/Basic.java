package Array;
public class Basic {
	public boolean sameFirstLast(int[] nums) {
		  if(nums.length>=1 && nums[0]==nums[nums.length-1])
		  {
		    return true;
		  }
		  return false;
		}
public static void main(String[] args) {
	int[] num= {1,2,3,4,5,1};
	System.out.println(new Basic().sameFirstLast(num));
}

}
