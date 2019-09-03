# Various sorting algorithms
import time
import random

def mergesort(arr):
    if len(arr) <= 1:
        return arr
    else:
        middle = len(arr) // 2
        leftarr = arr[:middle]
        rightarr = arr[middle:]

        mergesort(leftarr)
        mergesort(rightarr)

        i=j=k=0
        while i < len(leftarr) and j < len(rightarr):
            if leftarr[i] < rightarr[j]:
                arr[k] = leftarr[i]
                i += 1
            else:
                arr[k] = rightarr[j]
                j += 1
            k += 1

        while i < len(leftarr):
            arr[k] = leftarr[i]
            i += 1
            k += 1

        while j < len(rightarr):
            arr[k] = rightarr[j]
            j += 1
            k += 1
        
        return arr

def quicksort(arr):
    less = []
    equal = []
    greater = []
    if len(arr) <= 1:
        return arr
    else:
        pivot = random.choice(arr)
        for n in arr:
            if n < pivot:
                less.append(n)
            elif n == pivot:
                equal.append(n)
            else:
                greater.append(n)
        return quicksort(less) + equal + quicksort(greater)

def printList(arr): 
    for i in range(len(arr)):         
        print(arr[i],end=" ") 
    print() 

if __name__ == '__main__':
    arr = [1,2,3,4,7,4,10,-9,10,10,11,12,12,14,15,16,20,44,55,66,88,44,111]
    s = time.time()
    
    # O(nlogn) time and O(n) space complexity
    sortedbymerge = mergesort(arr)
    printList(sortedbymerge)
    print("Merge sort runtime: " + str(round(time.time() - s, 8)))
    
    # O(nlogn) time and O(n) space complexity
    sortedbyquick = quicksort(arr)
    printList(sortedbyquick)
    print("Quick sort runtime: " + str(round(time.time() - s, 8))) 