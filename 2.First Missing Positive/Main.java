
// Time: O(n)
// Space: O(1)
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i=0;
        while(i<n){
            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
                
            }else{
                i++;
                
            }
        }
        for( i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
      

        
    }
    void swap(int nums[],int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] nums = {1,5,4};
        System.out.println(sol.firstMissingPositive(nums));
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}