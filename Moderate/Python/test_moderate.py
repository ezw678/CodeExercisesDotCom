import os, sys
from os.path import dirname, abspath

sys.path.append(dirname(dirname(dirname(abspath(__file__)))))
from CommonLibs import TreeNode
from code_exercises_moderate import *
from hypothesis import given, strategies as st


def test_fizz_buzz():
    assert fizz_buzz(1) == "1"
    assert fizz_buzz(5) == "Buzz"
    assert fizz_buzz(15) == "FizzBuzz"
    assert fizz_buzz(3) == "Fizz"
    assert fizz_buzz(121) == "121"
    assert fizz_buzz(125) == "Buzz"


def test_is_prime():
    assert is_prime(5) == True
    assert is_prime(13) == True
    assert is_prime(15) == False
    assert is_prime(917) == False
    assert is_prime(919) == True


def test_fibonacci():
    assert fibonacci(0) == 0
    assert fibonacci(3) == 2
    assert fibonacci(9) == 34


def test_fibonacci_tab():
    assert fibonacci_tab(0) == 0
    assert fibonacci_tab(3) == 2
    assert fibonacci_tab(9) == 34
    assert fibonacci_tab(25) == 75025
    assert fibonacci_tab(38) == 39088169


def test_fibonacci_mem():
    assert fibonacci_mem(0) == 0
    assert fibonacci_mem(3) == 2
    assert fibonacci_mem(9) == 34
    assert fibonacci_mem(25) == 75025
    assert fibonacci_mem(38) == 39088169


@given(st.integers(min_value=0, max_value=15))
def test_fibonacci(n: int):
    assert fibonacci(n) == fibonacci_mem(n) == fibonacci_tab(n)


def test_is_palindromea():
    assert is_palindrome("aba") == True
    assert is_palindrome("abc") == False
    assert is_palindrome("c") == True
    assert is_palindrome("abac") == False
    assert is_palindrome("abba") == True
    assert is_palindrome("kahwfgvjwyervl") == False


def test_even_fibonacci_sum():
    assert even_fibonacci_sum(50) == 44
    assert even_fibonacci_sum(450) == 188
    assert even_fibonacci_sum(1000) == 798


def test_gcd_1():
    assert gcd_1(55, 5) == 5
    assert gcd_1(16, 4) == 4
    assert gcd_1(1052, 52) == 4
    assert gcd_1(15, 65) == 5
    assert gcd_1(55, 54) == 1


def test_gcd_2():
    assert gcd_2(55, 5) == 5
    assert gcd_2(16, 4) == 4
    assert gcd_2(1052, 52) == 4
    assert gcd_2(15, 65) == 5
    assert gcd_2(55, 54) == 1


def test_package_rice():
    assert package_rice(2, 2, 12) == True
    assert package_rice(2, 1, 12) == False
    assert package_rice(2, 1, 5) == True
    assert package_rice(5, 3, 24) == False
    assert package_rice(2, 7, 18) == False
    assert package_rice(2, 10, 18) == True


def test_search():
    assert search(["abc", "bbb"]) == ["abc"]
    assert search(["ab", "abcd"]) == []
    assert search(["aaa"]) == ["aaa"]
    assert search(["aaa", "abbb", "b", "afs", "ksi", "air"]) == ["aaa", "afs", "air"]
    assert search(["aaa", "baa", "kkkkk", "acc"]) == ["aaa", "acc"]


def test_getString():
    assert get_string([1, 5, 7, 8]) == "o1,o5,o7,e8"
    assert get_string([101, 44]) == "o101,e44"
    assert get_string([100]) == "e100"


def test_decode():
    assert decode("xvm") == "car"
    assert decode("evqv") == "java"
    assert decode("diozmqdzr") == "interview"


def test_is_strict_tree():
    root = TreeNode()
    assert is_strict_tree(root) == True

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    assert is_strict_tree(root) == True

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    root.left.add_left(TreeNode())
    assert is_strict_tree(root) == False

    root = TreeNode()
    root.add_left(TreeNode())
    root.add_right(TreeNode())
    root.left.add_left(TreeNode())
    root.left.add_right(TreeNode())
    assert is_strict_tree(root) == True


def test_sums_to_target():
    assert sums_to_target([0, 1, 3, 4], 5) == True
    assert sums_to_target([1, 3, 4], 5) == True
    assert sums_to_target([2, 4, 6], 5) == False
    assert sums_to_target([-1, 4, 2, 1], 0) == True
    assert sums_to_target([-1, 4, 2, 1], 1) == True
