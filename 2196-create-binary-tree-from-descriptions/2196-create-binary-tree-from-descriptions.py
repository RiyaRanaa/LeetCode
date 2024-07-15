# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def createBinaryTree(self, descriptions: List[List[int]]) -> Optional[TreeNode]:
        hmap = defaultdict(TreeNode)
        allChildren = set()
        root = set()

        for parentId, childId, isLeft in descriptions:
            allChildren.add(childId)
            root.discard(childId)

            if parentId not in allChildren:
                root.add(parentId)
            
            hmap[parentId].val = parentId
            hmap[childId].val = childId
            if isLeft == 1:
                hmap[parentId].left = hmap[childId]
            else:
                hmap[parentId].right = hmap[childId]

        return hmap[root.pop()]