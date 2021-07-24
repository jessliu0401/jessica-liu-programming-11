import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int problemOne(String s) {
        int answer = 0;//this records how many vowels there are in the string
        for (int a = 0; a < s.length(); a++) {//we scan the string letter by letter
            //if the letter are equal to the vowels, we add 1 to the answer
            if (s.charAt(a) == 'a' || s.charAt(a) == 'e' || s.charAt(a) == 'i' || s.charAt(a) == 'o' || s.charAt(a) == 'u') {
                answer++;
            }
        }
        return answer;//we return the answer
    }



    static int problemTwo(String s) {
        int answer = 0;//this records the final answer
        for (int i = 0; i < s.length() - 2; i++) {
            //we scan the string 3 letters once, and we move forward 1 index per scan
            // for example, first we scan pos 012, then we scan pos 123
            if (s.substring(i, i + 3).equals("bob")) {
                // if the three letters are equal to bob, then we add 1 to answer
                answer++;
            }
        }
        return answer;
    }






    static String problemThree(String s) {
        int startIndex = 0;//where the final string would start
        int theLength =1;//the final length(when the whole string gets scanned, value of sLength would be implemented in here
        int sLength = 1;//substring length(would reset during the program)

        for (int i = 0;i < s.length()-1;i++){//scan the string
            if (s.charAt(i) <= s.charAt(i+1)){//if they are in order

                sLength =sLength+1;//the final string's length would be 1 longer
                int a=i+1;
                /*if during the scanning process, a longer alphabetical string is found
                this part would replace the final indexes with the new alphabetical substring
                 */
                if (theLength<sLength){
                    theLength = sLength;
                    startIndex = a-(theLength-1);


                }

            }else {// if we get to this part, this means that none of the letters are in alphabetical order
                //therefore the longest substring would be just one letter long
                sLength =1;
            }


        }//we print the results here
        String result = s.substring(startIndex,startIndex+theLength);
        return result;
    }













    public static void main(String[] args) {
        String answer = problemThree("yqpnlilestyiwmmqsqpv");
        System.out.println(answer);



    }
}
