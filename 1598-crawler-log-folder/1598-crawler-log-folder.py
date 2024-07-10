class Solution:
    def minOperations(self, logs: List[str]) -> int:
        s=0
        for element in logs:
            if element=="../":
                if s>0:
                    s-=1
            elif element =="./":
                continue
            else:
                s+=1
        return s
        