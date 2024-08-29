OFFSET = 10001

class Solution:
    def removeStones(self, stones: List[List[int]]) -> int:
        f = {}

        def find(x):
            fx = f.get(x)
            if fx is None:
                f[x] = x
                return x

            if fx != x:
                f[x] = fx = find(fx)

            return fx

        def merge(u, v):
            fu, fv = find(u), find(v)
            if fu != fv:
                f[fu] = fv

        for u, v in stones:
            merge(u, OFFSET+v)

        ans = 0
        for k in f.keys():
            if find(k) == k:
                ans += 1

        return len(stones) - ans