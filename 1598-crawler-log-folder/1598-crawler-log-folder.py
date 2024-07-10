class Solution:
    def minOperations(self, logs: List[str]) -> int:
        f=0
        for element in logs:
            if element=="../":
                if f>0:
                    f-=1
            elif element =="./":
                continue
            else:
                f+=1
        return f
        