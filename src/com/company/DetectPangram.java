// 97-122 (a-z)
package com.company;

public class DetectPangram {

    public static void main(String[] args){
        String a = "abababaAnanan";
        System.out.println(check("The quick brown fox jumps over the lazy dog")); //true

        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(check(pangram1));  //true

        String pangram2 = "The qqquick brwrown fox jumps over the lazy dog.";
        System.out.println(check(pangram2)); //true

        String pangram3 = "The uick brown fox jumps over the lazy dog.";
        System.out.println(check(pangram3));  //false

        String pangram4 = "global";
        System.out.println(check(pangram4));  //false

//w 3 przypadku pokazuje true, a w petla wykonuje sie w nieskonczonosc

    }

    public static boolean check(String sentence){
        sentence = sentence.toLowerCase();
        int conditionValue = 0;

        for(int i = 97; i<=122; i++){
            for(int j = 0; j<sentence.length();j++){
                if((int)sentence.charAt(j) == i){
                    conditionValue++;
                    j = sentence.length();
                }
                if(j == sentence.length()-1 && (int)sentence.charAt(j)!= i)
                    return false;
            }
        }

        if(conditionValue == 26)
            return true;
        return false;
    }
}
