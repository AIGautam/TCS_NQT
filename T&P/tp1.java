
// remove dublicate

import java.util.LinkedHashMap;

public class tp1 {
    public static void  removeDublicate(String str){
        LinkedHashMap<Character, Integer> set = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            set.put(c, 1);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : set.keySet()){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String str =  "bahabha";
        removeDublicate(str);

    }
}
