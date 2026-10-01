class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> map =new HashMap<>();
        for(String s: strs)
        {
            char [] st=s.toCharArray();
            Arrays.sort(st);

            String str=new String(st);
            if(!map.containsKey(str))
            {
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(s);


        }
        return new ArrayList<>(map.values());

        
    }
}
