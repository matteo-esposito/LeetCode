import time

def binarySearchIterative(search_value, arr):
    left = 0
    right = len(arr) - 1
    while left <= right:
        middle = (left + right) // 2
        if arr[middle] == search_value:
            return middle
        elif search_value > arr[middle]:
            left = middle + 1
        else:
            right = middle - 1
    return False

def binarySearchRecursive(search_value, arr, left, right):
    middle = (left + right) // 2
    if arr[middle] == search_value:
        return middle
    elif search_value > arr[middle]:
        return binarySearchRecursive(search_value, arr, middle + 1, right)
    else:
        return binarySearchRecursive(search_value, arr, left, middle - 1)

if __name__ == '__main__':
    arr = [1,2,3,4,7,10,10,10,10,11,12,12,14,15,16,20,44,55,66,88,111]
    s = time.time()
    
    # O(logn) time complexity but O(1) space complexity
    binarySearchIterative(88, arr)
    print("Iterative runtime: " + str(round(time.time() - s, 8)))
    
    # O(logn) time and space complexity (stack of calls.)
    binarySearchRecursive(88, arr, 0, len(arr))
    print("Recursive runtime: " + str(round(time.time() - s, 8))) 