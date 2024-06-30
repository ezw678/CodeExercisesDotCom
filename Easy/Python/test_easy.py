import os, sys
from os.path import dirname, abspath

sys.path.append(dirname(dirname(dirname(abspath(__file__)))))
from CommonLibs.tree_node import TreeNode
from CommonLibs.list_node import ListNode

from code_exercises_easy import *


def test_sum_a_b():
    assert sum_a_b(1, 2) == 3


def test_sum_35_multiples():
    assert sum_35_multiples(15) == 60
    assert sum_35_multiples(10) == 33
    assert sum_35_multiples(110) == 2843


def test_factorial():
    assert factorial(5) == 120
    assert factorial(1) == 1
    assert factorial(4) == 24
    assert factorial(6) == 720
    assert factorial(8) == 40320


def test_search():
    assert search(6, [3, 1, 3, 2, 6, 9, 7, 6]) == 4
    assert search(10, [10]) == 0
    assert search(10, [103, -110]) == -1
    assert search(22, [22, 22, 22, 22]) == 0


def test_reverse_str():
    assert reverse_str("java interview") == "weivretni avaj"
    assert reverse_str("aba") == "aba"
    assert reverse_str("code exercise") == "esicrexe edoc"
    assert reverse_str("yes") == "sey"


def test_average_1():
    assert average_1([0, 1]) == 0.5
    assert average_1([100, 10]) == 55.0
    assert average_1([20, 20, 20]) == 20.0
    assert average_1([2]) == 2.0


def test_average_2():
    assert average_2([0, 1]) == 0.5
    assert average_2([100, 10]) == 55.0
    assert average_2([20, 20, 20]) == 20.0
    assert average_2([2]) == 2.0


def test_average_3():
    assert average_3([0, 1]) == 0.5
    assert average_3([100, 10]) == 55.0
    assert average_3([20, 20, 20]) == 20.0
    assert average_3([2]) == 2.0


def test_upperCase():
    assert upper_case(["abc", "bbb"]) == ["ABC", "BBB"]
    assert upper_case(["ab", "abcd"]) == ["AB", "ABCD"]
    assert upper_case(["aaa"]) == ["AAA"]


def test_getElement():
    assert get_element([0, 1], 1) == 0
    assert get_element([3, 79, 55, 3], 2) == 55
    assert get_element([3, 79, 55], 2) == 55
    assert get_element([3, 79], 2) == -1


def test_get_number_of_nodes():
    root = TreeNode()
    assert get_number_of_nodes(root) == 1

    root = TreeNode()
    root.add_left(TreeNode())
    assert get_number_of_nodes(root) == 2

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    assert get_number_of_nodes(root) == 3

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    root.left.add_left(TreeNode())
    assert get_number_of_nodes(root) == 4


def test_count():
    head = ListNode()
    head.add_next(ListNode())
    assert count(head) == 2

    head = ListNode()
    head.add_next(ListNode())
    head.next.add_next(ListNode())
    head.next.next.add_next(ListNode())
    assert count(head) == 4

    head = ListNode()
    assert count(head) == 1


def test_count_leaf_nodes():
    root = TreeNode()
    assert count_leaf_nodes(root) == 1

    root = TreeNode()
    root.add_left(TreeNode())
    assert count_leaf_nodes(root) == 1

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    assert count_leaf_nodes(root) == 2

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    root.left.add_left(TreeNode())
    assert count_leaf_nodes(root) == 2


def test_depth_binary_tree():
    root = TreeNode()
    assert depth_binary_tree(root) == 1

    root = TreeNode()
    root.add_left(TreeNode())
    assert depth_binary_tree(root) == 2

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    assert depth_binary_tree(root) == 2

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    root.left.add_left(TreeNode())
    assert depth_binary_tree(root) == 3


def test_find():
    assert find([1, 3, 4]) == 3
    assert find([-1, 4, 2, 1]) == 2
    assert find([2, 4, 6]) == 4
