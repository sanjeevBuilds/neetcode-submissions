class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        from functools import cache
        n=len(nums)
        @cache
        def bt(prev,i):
            if i==n:
                return 0
            pick=0
            if prev==None or nums[i]>prev:
                #include
                pick=1+bt(nums[i],i+1)
            skip=bt(prev,i+1)
            return max(pick,skip)
        return bt(None,0)

        