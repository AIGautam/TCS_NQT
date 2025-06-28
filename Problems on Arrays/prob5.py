# Count frequency of each element in the array

from collections import Counter
arr = [3,4,3,5,4,3]
freq = Counter(arr)
for key, value in freq.items():
    print(key, value)