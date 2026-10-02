class Solution {

    public String encode(List<String> strs) 
    {
        StringBuilder str= new StringBuilder();
        for(String s:strs)
        {
            str.append(s.length()).append("#").append(s);
        }
        return str.toString();

    }

    public List<String> decode(String str) 
    {
    List<String> list = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Find the #
            while (str.charAt(j) != '#') {
                j++;
            }

            // Get the length before #
            int length = Integer.parseInt(str.substring(i, j));

            // Extract the actual string
            int start = j + 1;
            int end = start + length;

            list.add(str.substring(start, end));

            // Move to the next encoded string
            i = end;
        }

        return list;
    }
}
