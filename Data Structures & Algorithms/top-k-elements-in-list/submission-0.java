class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x: nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        TreeMap<Integer,Integer> tree=new TreeMap<Integer,Integer>(map);
       List<Integer> lt=new ArrayList<Integer>(map.keySet());
int result[]=new int[k];
lt.sort((a,b)->map.get(b)-map.get(a));
for (int i=0;i<k;i++)
{
    result[i]=lt.get(i);

}
return result;
    }
}
