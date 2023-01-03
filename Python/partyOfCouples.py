"""
In a party of N people, each person is denoted by an integer. Couples are represented by the same number.
Find out the only single person in the party of couples.

Input: N = 5
arr = {1, 2, 3, 2, 1}
Output: 3
Explaination: Only the number 3 is single.

You do not need to read input or print anything. Your task is to complete the function findSingle()
which takes the size of the array N and the array arr[] as input parameters and returns the only single person.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

"""

def findSingle(N, arr):
    single = 0
    for i in arr:
        single ^= i
    return single

N = 5
arr = {1, 2, 3, 2, 1}

print(findSingle(N,arr))
    
