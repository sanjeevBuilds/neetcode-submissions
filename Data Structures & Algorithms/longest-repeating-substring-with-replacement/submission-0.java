class Solution {
    public int characterReplacement(String s, int k)
     {
        int mostFreq=0;
        int left=0;
        int right=0;
        int count[]=new int[26];
        int replacement=0;
        int maxlength=0;
        while(right <s.length())
        {
           
             count[s.charAt(right)- 'A']++;
             mostFreq=Math.max(mostFreq,count[s.charAt(right) - 'A']);

             
            
            replacement=(right-left+1)-mostFreq;
            if(replacement>k)
            {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
            right++;


        }
        return maxlength;
        
    }
}
