class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
int value=0;
       
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++)
            {
               value= target-nums[i];
               if(map.containsKey(value))
               {
                return new int [] { map.get(value),i};
               }
               map.put(nums[i],i);

            }
            return new int []{};
    
    
    }
}
