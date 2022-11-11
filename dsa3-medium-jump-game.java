class Solution {
    public boolean canJump(int[] nums) {
        int energy=0;
        for(int i=0;i<=energy;i++){
            energy=Math.max(nums[i]+i, energy);
            if(energy>=nums.length-1){
                return true;
            }
        }
        return false;
    }
  
	public static void main(String[] args) {
		int [] nums = {2,3,1,1,4};
		System.out.println(canJump(nums);
	}
	
}
