// Sum of the Numbers in a String

public class prob9 {
    static int findSum(String str) {
    int sum = 0;
    StringBuilder num = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (Character.isDigit(ch)) {
            num.append(ch); 
        } else {
            if (num.length() > 0) {
                sum += Integer.parseInt(num.toString());
                num.setLength(0); 
            }
        }
    }

    if (num.length() > 0) {
        sum += Integer.parseInt(num.toString());
    }

    return sum;
}

    public static void main(String[] args) {
        String str = "a3gh42hb3";
        int result = findSum(str);
        System.out.println(result);
    }
}



// public class prob9 {

//        static int findSum(String str) {
//               String tempSum = "0";
//               int sum = 0;
//               for (int i = 0; i < str.length(); i++) {
//                      char s = str.charAt(i);

//                      if (Character.isDigit(s))
//                             tempSum += s;

//                      else {
//                             sum += Integer.parseInt(tempSum);
//                             tempSum = "0";
//                      }
//               }

//               return sum + Integer.parseInt(tempSum);
//        }

//        public static void main(String[] args) {

//               String str = "1bc268";
//               System.out.print("Sum: ");
//               System.out.println(findSum(str));
//        }
// }

