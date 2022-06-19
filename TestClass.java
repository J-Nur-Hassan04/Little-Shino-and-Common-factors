/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        String[] str = name.trim().split("\\s+");

        long num1 = Long.parseLong(str[0]);
        long num2 = Long.parseLong(str[1]);

        long a = num1;
        long b = num2;

        if(a>b)
        {
            num1 = b;
            num2 = a;
        }

        ArrayList<Long> list = new ArrayList<Long>();

        int incrementer = num1 % 2 == 0 ? 1 : 2;
        for (long i = 1; i <= Math.sqrt(num1); i += incrementer){
            if (num1 % i == 0){
                list.add(i);
            }
            if (i != num1 / i){
                list.add(num1 / i);
            }
        }

        int count = 0;
        for (int i = 0; i < list.size(); i ++){
            if ((num2 % list.get(i)) == 0){
                //System.out.println( factor.get(i));
                count ++;
            }
        }
        System.out.println(count);
        

    }
}
