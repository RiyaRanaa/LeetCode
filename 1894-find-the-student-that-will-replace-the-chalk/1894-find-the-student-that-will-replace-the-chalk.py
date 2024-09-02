class Solution:
    def chalkReplacer(self, chalk, k):
        total_sum = sum(chalk)
        k = k % total_sum

        if k == 0:
            return 0
        i = 0
        while i < len(chalk):
            if k < chalk[i]:
                return i
            else:
                k -= chalk[i]
                i += 1

        return 0