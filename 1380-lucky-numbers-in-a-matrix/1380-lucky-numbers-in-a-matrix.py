class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        return {min(row) for row in matrix} & {max(col) for col in zip(*matrix)}