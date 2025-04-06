class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        hashmap=Counter(nums)
        for x in hashmap:
            if(hashmap[x]==1):
                return x
        