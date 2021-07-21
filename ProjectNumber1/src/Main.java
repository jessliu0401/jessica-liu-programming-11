public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {
        int answer = 0;
        for (int a = 0; a < s.length(); a++) {
            if (s.charAt(a) == 'a' || s.charAt(a) == 'e' || s.charAt(a) == 'i' || s.charAt(a) == 'o' || s.charAt(a) == 'u') {
                answer++;
            }
        }
        return answer;
    }


    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        for (int i = 0; i < s.length() - 2; i++){
            if ( s.substring(i, i+3).equals("bob")){
                answer ++;
            }
        }
        return answer;


    //Code your solution to problem number 3 here
        //Problem 3
        // Assume s is a string of lower case characters.
        //Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print
        //Longest substring in alphabetical order is: beggh
        //In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print
        //Longest substring in alphabetical order is: abc
    static String problemThree(String s){
        int pos = 0;
        String[] strings;
        for (int a = 0;  a < s.length() - 1;  a++){

            int result = s.substring(a,a).compareTo(s.substring(a+1,a+1));

            if (result <= 0) {
               strings [pos] += s.charAt(a);}

            else pos ++;}
            return strings;

            public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s = "bobby";
        String[] final = problemThree(s);
        System.out.println();
    }
}
