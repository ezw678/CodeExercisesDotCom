class TreeNode:
   def __init__(self, data: int=0):
      self.data: int = data
      self.left: TreeNode = None
      self.right: TreeNode = None

   def add_left(self, left: 'TreeNode'):
      self.left = left

   def add_right(self, right: 'TreeNode'):
      self.right = right
