class Solution:
    def hIndex(self, citations: List[int]) -> int:
        i = 0
        h = 0

        citations.sort()
        while i < len(citations):
            lenlimit = min(citations[i],len(citations) - (i))
            h = max(h,lenlimit)
            i += 1

        return h