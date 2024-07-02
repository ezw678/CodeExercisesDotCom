import os, sys
from os.path import dirname, abspath

sys.path.append(dirname(dirname(dirname(__file__))))

from Moderate.Python import is_prime
from CommonLibs import TreeNode

"""A palindrome is a word which reads the same backward or forward.
'abcba' is a palindrome. Write a method that returns the longest 
palindrome substring of a given string."""


def find_longest_palindrome(word: str) -> str:
    ln = len(word)
    start = 0
    end = -1
    for i, val in enumerate(word):
        l = r = i
        while l >= 0 and word[l] == val:
            l -= 1
        while r < ln and word[r] == val:
            r += 1
        while l >= 0 and r < ln and word[l] == word[r]:
            l -= 1
            r += 1

        l += 1
        r -= 1

        if r - l > end - start:
            end = r
            start = l

    return word[start : end + 1]


# Given two strings, write a method that finds the longest common sub-sequence.


def find_longest_common_sequence(s1: str, s2: str) -> str:
    ln1 = len(s1)
    ln2 = len(s2)

    T = [[0 for _ in range(ln2 + 1)] for _ in range(ln1 + 1)]
    for i in range(1, ln1 + 1):
        for j in range(1, ln2 + 1):
            if s1[i - 1] == s2[j - 1]:
                T[i][j] = T[i - 1][j - 1] + 1
            else:
                T[i][j] = max(T[i - 1][j], T[i][j - 1])

    res = ""
    i = ln1
    j = ln2
    while i > 0 and j > 0:
        if s1[i - 1] == s2[j - 1]:
            res += s2[j - 1]
            i -= 1
            j -= 1
        else:
            if T[i - 1][j] > T[i][j - 1]:
                i -= 1
            else:
                j -= 1

    return res[::-1]


"""The prime factors of 455 are 5, 7 and 13.
Write a method that calculates the largest prime factor of a given number."""


def largest_prime_factor(n: int) -> int:
    if n <= 2:
        return n

    for i in range(n - 1, 1, -1):
        if n % i == 0 and is_prime(i):
            return i

    return 1


"""Provided that you have a given number of small rice bags (1 kilo each) and big 
rice bags (5 kilos each), write a method that returns the minimum number of 
small bags necessary to package goal kilos of rice. Return -1 if it is not 
possible to package the required rice amount with the bags provided."""


def get_number_of_small_bags(big: int, small: int, goal: int) -> int:
    needed = -1
    if big * 5 >= goal:
        needed = goal % 5
    else:
        needed = goal - big * 5

    return needed if small >= needed else -1


"""A binary tree is perfect when all levels are complete.
Write a method that checks if a binary tree is perfect.
TreeNode API methods: node.left() and node.right()."""


def is_perfect_tree(node: TreeNode) -> bool:
    depth = get_depth(node)
    return is_perfect(node, 1, depth)


def get_depth(node: TreeNode) -> int:
    if node == None:
        return 0

    return 1 + get_depth(node.left)


def is_perfect(node: TreeNode, level: int, depth: int) -> bool:
    if node == None:
        return True

    if level > depth:
        return False

    if level == depth and node.left == None and node.right == None:
        return True

    if node.left != None and node.right != None:
        return is_perfect(node.left, level + 1, depth) and is_perfect(
            node.right, level + 1, depth
        )

    return False


"""A binary tree is complete when all levels apart from the last are filled and
all leaf nodes in the last level are aligned to the left.
Write a method that checks if a binary tree is complete.
TreeNode API methods: node.left() and node.right()."""


def is_complete_tree(node: TreeNode) -> bool:
    total_node_count = count_nodes(node)
    return is_complete(node, 0, total_node_count)


def count_nodes(node: TreeNode) -> int:
    if node == None:
        return 0

    return 1 + count_nodes(node.left) + count_nodes(node.right)


def is_complete(node: TreeNode, idx: int, total_node_count: int):
    if node == None:
        return True

    if idx >= total_node_count:
        return False

    return is_complete(node.left, 2 * idx + 1, total_node_count) and is_complete(
        node.right, 2 * idx + 2, total_node_count
    )
