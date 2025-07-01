# Count frequency of each element in the array

from collections import Counter
arr = [3,4,3,5,4,3]
freq = Counter(arr)
for key, value in freq.items():
    print(key, value)
    
    
    
    # In java code
    
#     import java.util.*;

# public class FrequencyCount {
#     public static void main(String[] args) {
#         int[] arr = {10, 5, 10, 15, 10, 5};
        
#         HashMap<Integer, Integer> map = new HashMap<>();
        
#         for (int num : arr) {
#             // put count or increase it if already exists
#             map.put(num, map.getOrDefault(num, 0) + 1);
#         }
        
#         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
#             System.out.println(entry.getKey() + " " + entry.getValue());
#         }
#     }
# }