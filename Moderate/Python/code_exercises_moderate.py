import os, sys
from os.path import dirname, abspath

sys.path.append(dirname(dirname(dirname(abspath(__file__)))))
from CommonLibs import TreeNode
import numpy as np


"""Write a method that returns 'Fizz' for multiples of three and 'Buzz'
for the multiples of five. For numbers which are multiples of both three
and five return 'FizzBuzz'. For numbers that are neither, return
the input number."""


def fizz_buzz(n: int) -> str:
    return (
        "FizzBuzz"
        if n % 3 == 0 and n % 5 == 0
        else "Fizz" if n % 3 == 0 else "Buzz" if n % 5 == 0 else str(n)
    )


"""A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
Write a method that checks if a number is a prime number."""


def is_prime(n: int) -> bool:
    for i in range(2, n):
        if n % i == 0:
            return False

    return True


"""Write a method that returns the nth element of the Fibonacci Sequence
The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
The next number is found by adding up the two numbers before it.
Assume that indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ...
actually this nth is actually just the index, i.e., 3rd is 2, and 2 is not the 4th."""


def fibonacci(n: int) -> int:
    if n <= 1:
        return n

    return fibonacci(n - 1) + fibonacci(n - 2)


def fibonacci_tab(n: int) -> int:
    if n <= 1:
        return n

    fbs = [0] * (n + 1)
    fbs[0] = 0
    fbs[1] = 1

    for i in range(2, n + 1):
        fbs[i] = fbs[i - 1] + fbs[i - 2]

    return fbs[n]


def fibonacci_mem(n: int) -> int:
    M = [-1] * (n + 1)

    return fibonacci_m(n, M)


def fibonacci_m(n: int, M: list[int]) -> int:
    if n <= 1:
        return n

    if M[n] == -1:
        M[n] = fibonacci_m(n - 1, M) + fibonacci_m(n - 2, M)

    return M[n]


"""A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
Write a method that detects if a string is a palindrome."""


def is_palindrome(word: str) -> bool:
    return word[::-1] == word


"""Write a method that returns the sum of all even Fibonacci numbers. Consider all Fibonacci 
numbers that are less than or equal to n."""


def even_fibonacci_sum(n: int) -> int:
    fb1 = 0
    fb2 = 1
    fb = 1
    sm = 0
    while fb <= n:
        fb = fb1 + fb2
        sm += fb if fb % 2 == 0 and fb <= n else 0
        fb1 = fb2
        fb2 = fb

    return sm


"""The Greatest Common Divisor of two positive integers is the largest integer that 
divides both without remainder."""


def gcd_1(p: int, q: int) -> int:
    smaller = min(p, q)
    for i in range(smaller, 1, -1):
        if p % i == 0 and q % i == 0:
            return i

    return 1


def gcd_2(p: int, q: int) -> int:
    return np.gcd(p, q)


"""Provided that you have a given number of small rice bags (1 kilo each) and big rice bags 
(5 kilos each), write a method that returns true if it is possible to make a package 
with goal kilos of rice."""


def package_rice(big: int, small: int, goal: int) -> bool:
    needed = small + 1

    if goal > big * 5:
        needed = goal - big * 5
    else:
        needed = goal % 5

    return small >= needed


"""Given a list of strings, write a method that returns a list of all strings that start 
with the letter 'a' (lower case) and have exactly 3 letters. """


def search(strs: list[str]) -> list[str]:
    return list(filter(lambda s: s[0] == "a" and len(s) == 3, strs))


def search(strs: list[str]) -> list[str]:
    return list([s for s in strs if s[0] == "a" and len(s) == 3])


"""Write a method that returns a comma-separated string based on a given list of integers. 
Each element should be preceded by the letter 'e' if the number is even, and preceded by 
the letter 'o' if the number is odd. For example, if the input list is (3,44), the 
output should be 'o3,e44'."""


def get_string(nums: list[int]) -> str:
    return ",".join(["e" + str(n) if n % 2 == 0 else "o" + str(n) for n in nums])


"""The Ceasar cipher is a basic encryption technique used by Julius Ceasar to securely 
communicate with his generals. Each letter is replaced by another letter N positions 
down the english alphabet. For example, for a rotation of 5, the letter 'c' would be 
replaced by an 'h'. In case of a 'z', the alphabet rotates and it is transformed 
into a 'd'. Implement a decoder for the Ceasar cipher where N = 5."""


def decode(code: str) -> str:
    return "".join(
        [
            (
                chr(ord(c) + 5)
                if ord(c) + 5 <= ord("z")
                else chr(ord("a") - 1 + ord(c) + 5 - ord("z"))
            )
            for c in code
        ]
    )


"""A binary tree is strict when all nodes have either two or zero child nodes.
Write a method that checks if a binary tree is strict. TreeNode API methods: node.left() 
and node.right()."""


def is_strict_tree(node: TreeNode) -> bool:
    if node == None:
        return True

    if (
        node.left != None
        and node.right == None
        or node.left == None
        and node.right != None
    ):
        return False

    return is_strict_tree(node.left) and is_strict_tree(node.right)


"""Write a method that checks if there is at least on pair of numbers which sum equals target.
arr=[1, 3, 4] and target=5 result is true because the pair (1,4) sums to five."""


def sums_to_target(nums: list[int], target: int) -> bool:
    temp = set()
    for n in nums:
        dif = target - n
        if dif in temp:
            return True
        else:
            temp.add(n)

    return False


def main():
    pass


if __name__ == "__main__":
    main()
