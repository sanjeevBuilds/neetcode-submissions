class Solution {
    public int lengthOfLongestSubstring(String s)
     {
        int left=0;
        int right =0;
        char []str=s.toCharArray();
        
        int maxlength=0;
        HashSet<Character> sets = new HashSet<>();
        
        while(right<s.length())
        
        {
            if(!sets.contains(str[right]))
            {
                sets.add(str[right]);
                
                maxlength=Math.max(maxlength,right-left+1);
                right++;

            }else
            {
                sets.remove(s.charAt(left));
                left++;


            }
          
        }
        return maxlength;
    }
}
