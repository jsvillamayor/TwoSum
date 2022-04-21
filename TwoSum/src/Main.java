
public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1,2,7,10,11,15};
		int target = 40;
		boolean answer = false;
		
		for(int i=0;i<nums.length;i++) {
			
			for(int j=i+1;j<nums.length;j++) {
				
				if(nums[i]+nums[j]==target) {
					System.out.println("["+i+","+j+"]");
					answer = true;
				}
				
			}
			
		}
		if(!answer)
			System.out.println("There is no solution.");
		

	}

}
