# Average of all the elements in the array

arr = list(map(int, input("Enter element").split()))

total = sum(arr)
average = total / len(arr)

print("Array:", arr)
print("Average:", average)



# in java code

# import java.util.*;
# public class Main
# {
# 	public static void main(String[] args) {
# 		Scanner sc  = new Scanner(System.in);
# 		int n =  sc.nextInt();
# 		int arr[] =  new int[n];
# 		int sum =  0;
# 		for(int i = 0; i<n; i++){
# 		    arr[i] =  sc.nextInt();
# 		    sum = sum+arr[i];
# 		}
# 		double average = (double) sum / n;
# 		System.out.println("Average: " + average);
		
# 	}
# }


