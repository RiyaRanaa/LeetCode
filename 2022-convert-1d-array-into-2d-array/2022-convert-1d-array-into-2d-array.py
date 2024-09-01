class Solution:
    def construct2DArray(self, original, m, n):
        if len(original) != m * n:
            return []

        result = [[0] * n for _ in range(m)]

        for i in range(len(original)):
            result[i // n][i % n] = original[i]

        return result