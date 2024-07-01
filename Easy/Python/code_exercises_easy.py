import os, sys
from os.path import dirname, abspath

sys.path.append(dirname(dirname(dirname(abspath(__file__)))))

from CommonLibs import ListNode, TreeNode
import numpy as np


# Write a method that sums two numbers.


def sum_a_b(i: int, j: int) -> int:
    return i + j


"""Given a number n, write a method that sums all multiples of three and five up to
n (inclusive)."""


def sum_35_multiples(n: int) -> int:
    return sum(n for n in range(3, n + 1) if n % 3 == 0 or n % 5 == 0)


"""Write a method that calculates the factorial of a given number.
Factorial is the product of all positive integers less than or equal
to n. For example, factorial(4) = 4x3x2x1 = 24.
TIP: To make it more interesting, try to do it recursively."""


def factorial(n: int) -> int:
    if n == 1:
        return 1
    return factorial(n - 1) * n


"""Write a method that returns the index of the first occurrence of given integer in a list.
Assume that the index of the first element in the list is zero.
If the number does not exist return -1."""


def search(n: int, ls: list[int]) -> int:
    return ls.index(n) if n in ls else -1


"""Write a method that reverses a string.
For example, 'java interview' becomes 'weivretni avaj'."""


def reverse_str(s: str) -> str:
    return s[::-1]


"""Write a method that returns the largest integer in the list.
You can assume that the list has at least one element."""


def maximum(nums: list[int]) -> int:
    return max(nums)


# Write a method that returns the average of a list of integers.
def average_1(nums: list[int]) -> float:
    return sum(nums) / len(nums)


def average_2(nums: list[int]) -> float:
    return np.average(nums)


def average_3(nums: list[int]) -> float:
    return np.mean(nums)


# Write a method that converts all strings in a list to their upper case.
def upper_case(strs: list[str]) -> list[str]:
    return [s.upper() for s in strs]


"""Write a method that returns the nth odd element of a list. If the index of the 
element exceeds the list size, then return -1."""


def get_element(nums: list[int], n: int) -> int:
    idx = 2 * n - 2
    return nums[idx] if idx < len(nums) else -1


"""Write a method that returns the number of nodes in a binary tree.
TreeNode API methods: node.left() and node.right()."""


def get_number_of_nodes(node: TreeNode) -> int:
    if node == None:
        return 0

    return 1 + get_number_of_nodes(node.left) + get_number_of_nodes(node.right)


def count(node: ListNode) -> int:
    if node == None:
        return 0

    return 1 + count(node.next)


# Count the number of leaf nodes in a binary tree
def count_leaf_nodes(node: TreeNode) -> TreeNode:
    if node == None:
        return 0

    if node.left == None and node.right == None:
        return 1

    return count_leaf_nodes(node.left) + count_leaf_nodes(node.right)


"""Write a method that returns the maximum depth of a binary tree. The maximum depth
is the number of nodes from the root (inclusive) until the furthest node (inclusive)."""


def depth_binary_tree(node: TreeNode) -> int:
    if node == None:
        return 0

    return 1 + max(depth_binary_tree(node.left), depth_binary_tree(node.right))


"""Find the second largest number in an integer array. You can assume a minimum array 
length of two."""


def find(nums: list[int]) -> int:
    nums.sort(reverse=True)
    return nums[1]


def main():
    pass


if __name__ == "__main__":
    main()
