class Solution {
    public int largestRectangleArea(int[] heights)
     {
         Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {

            int currentHeight = (i == n) ? 0 : heights[i];

            while (!st.isEmpty() &&
                   currentHeight < heights[st.peek()]) {

                int poppedIndex = st.pop();
                int height = heights[poppedIndex];

                int width;

                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }

                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }

            if (i < n) {
                st.push(i);
            }
        }

        return maxArea;
    }
}
