public class main {
    /*Add values to the end of an array.
    Delete values from the end of an array (often referred to as pop).  Array size should shrink by one.
    Insert values into an array at chosen index position. (Increases the size of the array by 1 Ex. array 2, 3, 5.  Insert 4 into position 2 gives 2,3,4,5)
     */
// change method name in this section to use different methods
    // we will add the name "steve" to the code
    public static void main(String[] args) {
        String[] names = {"bob", "lee", "dav"};
        names = deleteBehind(names);
        System.out.println(names[0]);
        System.out.println(names[1]);
        
    }

    // method 1: add values to end of array
    public static String[] addBehind(String[] names) {
        String[] morenames = new String[names.length + 1];

        for (int i = 0; i < names.length; i++) {
            morenames[i] = names[i];
        }
        morenames[morenames.length - 1] = "steve";
        return morenames;
    }

    // method 2. delete value from end of array
    public static String[] deleteBehind(String[] names) {
        String[] lessnames = new String[names.length - 1];
        for (int i = 0; i < lessnames.length; i++) {
            lessnames[i] = names[i];
        }
        return lessnames;
    }

    // method 3: add values in the middle of array
    // put the position you want the text to be in the new array at int pos
    public static String[] addMiddle(String[] names, int pos) {
        String[] insertnames = new String[names.length + 1];
        for (int i = 0; i < insertnames.length; i++) {
            if (i < pos) {
                insertnames[i] = names[i];
            } else if (i == pos) {
                insertnames[i] = "steve";
            } else if (i > pos) {
                insertnames[i] = names[i - 1];
            }

        }
        return insertnames;
    }
}









