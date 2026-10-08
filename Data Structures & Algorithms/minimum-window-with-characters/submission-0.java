class Solution {
    public String minWindow(String s, String t) 
    {
       
       
        int minlength=0;
        int count[] = new int[128];
        int count1[] = new int[128];
        for( char x:t.toCharArray())
        {
            
            count[x]++;
        }
        int need=0;
        int right=0;
        int left=0;
        int minIndex=Integer.MAX_VALUE;
        int minLeft=0;
        while(right<s.length())
        {
            count1[s.charAt(right)]++;
       if(count[s.charAt(right)]>=count1[s.charAt(right)])
            {
                need++;
            }
            while(need==t.length())
            {
                if(right-left+1 <minIndex)
                {
                minIndex=Math.min(minIndex,right-left+1);
                minLeft=left;
                }
            count1[s.charAt(left)]--;
            
            
            if(count1[s.charAt(left)]<count[s.charAt(left)])
            {
                need--;
            }
            left++;
            }
            
            right++;

        }
            if(minIndex==Integer.MAX_VALUE)
            {
                return "";
            }
            return s.substring(minLeft,minLeft+minIndex);

    }
        
        
 }


