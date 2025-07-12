// Remove brackets from an algebraic expression


import java.util.Scanner;

public class prob8 {
    public static String solve(String input){
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i) != '(' && input.charAt(i) != ')'){
                ans.append(input.charAt(i));
            }

        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Test case:");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            System.out.println("enter expression : " +i+":");
            String input = sc.nextLine();
            System.out.println("Oringinal string:"+input);
            System.out.println("After removing brackets:"+solve(input));
            System.out.println();
        }
        sc.close();
    }
}
