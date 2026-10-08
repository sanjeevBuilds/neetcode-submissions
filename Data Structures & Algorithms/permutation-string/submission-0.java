class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
        while(s1.length()>s2.length())
        {
           return false;

        }
        int count[]= new int[26];
        int count1[] =new int[26];
            for(char x : s1.toCharArray())
            {
                count[x - 'a']++;
            }
            int left=0;
            for(int right=0;right<s2.length();right++)
            {
                count1[s2.charAt(right) - 'a']++;

            
            if(right - left + 1 > s1.length())
            {
                count1[s2.charAt(left)- 'a']--;
                left++;
            }
            if(Arrays.equals(count,count1))
            {
                return true;
            }
            }


        
        return false;
    }
}
