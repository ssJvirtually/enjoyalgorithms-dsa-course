import java.util.HashMap;
import java.util.Map;
import java.util.jar.Manifest;

public class RomanToInteger {


    public static void main(String[] args) {
        String s = "IC";

        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
    
    Map<Character,Integer> romanValues = new HashMap();
    
    romanValues.put('I',1);
    romanValues.put('V',5);
    romanValues.put('X',10);
    romanValues.put('L',50);
    romanValues.put('C',100);
    romanValues.put('D',500);
    romanValues.put('M',1000);
    int sum = 0;
     
     
     for(int i=0;i<s.length();){
            if(i<s.length()-1 && romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i+1))){


                sum += romanValues.get(s.charAt(i+1)) - romanValues.get(s.charAt(i));
                i = i+2;
            }
            else {
                sum += romanValues.get(s.charAt(i));
                i++;
            }
        }
    return sum;
    }
}