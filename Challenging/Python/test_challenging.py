import os, sys
from os.path import dirname, abspath

sys.path.append(dirname(dirname(dirname(abspath(__file__)))))

from CommonLibs import TreeNode
from code_exercises_challenging import *


def test_find_longest_palindrome():
    assert find_longest_palindrome("abattd") == "aba"
    assert find_longest_palindrome("abc") == "a"
    assert find_longest_palindrome("abcba") == "abcba"
    assert find_longest_palindrome("thhwerw") == "hh"


def test_find_longest_common_sequence():
    assert find_longest_common_sequence("abattd", "gdgeaba") == "aba"
    assert find_longest_common_sequence("abc", "sdsad") == "a"
    assert find_longest_common_sequence("abcba", "abcba") == "abcba"
    assert find_longest_common_sequence("thhwerwaaa", "aaa") == "aaa"


def test_largest_prime_factor():
    assert largest_prime_factor(2) == 2
    assert largest_prime_factor(55) == 11
    assert largest_prime_factor(455) == 13
    assert largest_prime_factor(1015) == 29
    assert largest_prime_factor(13195) == 29


def test_get_number_of_small_bags():
    assert get_number_of_small_bags(2, 2, 12) == 2
    assert get_number_of_small_bags(2, 1, 12) == -1
    assert get_number_of_small_bags(2, 1, 5) == 0
    assert get_number_of_small_bags(5, 3, 24) == -1
    assert get_number_of_small_bags(2, 7, 18) == -1
    assert get_number_of_small_bags(2, 10, 18) == 8


def test_is_perfect_tree():
    root = TreeNode()
    assert is_perfect_tree(root) == True

    root = TreeNode()
    root.add_left(TreeNode())
    assert is_perfect_tree(root) == False

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    assert is_perfect_tree(root) == True

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    root.right.add_right(TreeNode())
    assert is_perfect_tree(root) == False

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    root.left.add_left(TreeNode())
    assert is_perfect_tree(root) == False

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    root.left.add_left(TreeNode())
    root.left.add_right(TreeNode())
    assert is_perfect_tree(root) == False


def test_is_complete_tree():
    root = TreeNode()
    assert is_complete_tree(root) == True

    root = TreeNode()
    root.add_right(TreeNode())
    assert is_complete_tree(root) == False

    root = TreeNode()
    root.add_left(TreeNode())
    assert is_complete_tree(root) == True

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    assert is_complete_tree(root) == True

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    root.left.add_left(TreeNode())
    assert is_complete_tree(root) == True

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    root.right.add_left(TreeNode())
    root.right.add_right(TreeNode())
    assert is_complete_tree(root) == False
