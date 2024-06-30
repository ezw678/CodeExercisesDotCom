class ListNode:
   def __init__(self, data: int=0):
      self.data: int = data
      self.next: ListNode = None

   def add_next(self, node: 'ListNode'):
      self.next = node

