class Solution {
    public int trap(int[] height) 
    {
        int left= 0;
        int right=height.length-1;
        int maxleft=0;
        int maxright=0;
        int result=0;
        int water=0;
        while(left<right)
        {
            if(height[left]<height[right])
            {
               
                maxleft=Math.max(maxleft,height[left]);
                water=maxleft-height[left];
                result=result+water;
                left++;
            }else{
              
                maxright=Math.max(maxright,height[right]);
                water=maxright-height[right];
                result=result+water;
                right--;
            }
        }
        return result;
    }
}
