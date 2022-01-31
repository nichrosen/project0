public class Main {
    
    public static void main(String[] args){

        count22NoOverlapResults();
        count22OverlapResults();
        factorsOf10Results();
        balancedParensResults();
        //reverseArrayResults();
    }

    static void count22NoOverlapResults(){
        
        Recursion test = new Recursion();

        String noOverlap1 = "22abc22";
        String output1 = "Test of count22NoOverlap method.\n" +
                         "Searching for \"22\" in string " + noOverlap1 + ".\n" +
                         "Found " + test.count22NoOverlap(noOverlap1) + " non-overlapping occurrences of \"22\".\n\n";

        String noOverlap2 = "abc22x22x22";
        String output2 = "Test of count22NoOverlap method.\n" +
                         "Searching for \"22\" in string " + noOverlap2 + ".\n" +
                         "Found " + test.count22NoOverlap(noOverlap2) + " non-overlapping occurrences of \"22\".\n\n";

        String noOverlap3 = "222";
        String output3 = "Test of count22NoOverlap method.\n" +
                         "Searching for \"22\" in string " + noOverlap3 + ".\n" +
                         "Found " + test.count22NoOverlap(noOverlap3) + " non-overlapping occurrences of \"22\".\n\n";

        System.out.print(output1 + output2 + output3);
        System.out.print("\n\n\n");

    }

    static void count22OverlapResults(){

        Recursion test = new Recursion();

        String overlap1 = "22abc22";
        String output1 = "Test of count22Overlap method.\n" +
                         "Searching for \"22\" in string " + overlap1 + ".\n" +
                         "Found " + test.count22Overlap(overlap1) + " non-overlapping and overlapping occurrences of \"22\".\n\n";
        
        String overlap2 = "abc22x22x22";
        String output2 = "Test of count22Overlap method.\n" +
                         "Searching for \"22\" in string " + overlap2 + ".\n" +
                         "Found " + test.count22Overlap(overlap2) + " non-overlapping and overlapping occurrences of \"22\".\n\n";
        
        String overlap3 = "222"; System.out.println(test.count22Overlap(overlap3));
        String output3 = "Test of count22Overlap method.\n" +
                         "Searching for \"22\" in string " + overlap3 + ".\n" +
                         "Found " + test.count22Overlap(overlap3) + " non-overlapping and overlapping occurrences of \"22\".\n\n";
        
        String overlap4 = "abc222222";
        String output4 = "Test of count22Overlap method.\n" +
                         "Searching for \"22\" in string " + overlap4 + ".\n" +
                         "Found " + test.count22Overlap(overlap4) + " non-overlapping and overlapping occurrences of \"22\".\n\n";

        System.out.print(output1 + output2 + output3 + output4);
        System.out.print("\n\n\n");

    }

    static void factorsOf10Results(){

        Recursion test = new Recursion();

        int[] intArray1 = new int[]{ 1, 10, 20 };
        String intArrayString1 = "";
        for(int i = 0; i < intArray1.length; i++)
            intArrayString1 += intArray1[i] + " ";
        String output1 = "Test of factorsOf10 method.\n" +
                         "Searching for consecutive factors of 10 in array { " + intArrayString1 + "}.\n" +
                         "Found " + test.factorsOf10(intArray1, 0) + " consecutive factors of 10.\n\n";
        
        int[] intArray2 = new int[]{ 100, 10, 20, 200 };
        String intArrayString2 = "";
        for(int i = 0; i < intArray2.length; i++)
            intArrayString2 += intArray2[i] + " ";
        String output2 = "Test of factorsOf10 method.\n" +
                         "Searching for consecutive factors of 10 in array { " + intArrayString2 + "}.\n" +
                         "Found " + test.factorsOf10(intArray2, 0) + " consecutive factors of 10.\n\n";
        
        int[] intArray3 = new int[]{ 1000, 100, 10, 1, 10 };
        String intArrayString3 = "";
        for(int i = 0; i < intArray3.length; i++)
            intArrayString3 += intArray3[i] + " ";
        String output3 = "Test of factorsOf10 method.\n" +
                         "Searching for consecutive factors of 10 in array { " + intArrayString3 + "}.\n" +
                         "Found " + test.factorsOf10(intArray3, 0) + " consecutive factors of 10.\n\n";
        
        int[] intArray4 = new int[]{ 10, 20, 33, 340 };
        String intArrayString4 = "";
        for(int i = 0; i < intArray4.length; i++)
            intArrayString4 += intArray4[i] + " ";
        String output4 = "Test of factorsOf10 method.\n" +
                         "Searching for consecutive factors of 10 in array { " + intArrayString4 + "}.\n" +
                         "Found " + test.factorsOf10(intArray4, 0) + " consecutive factors of 10.\n\n";

        System.out.print(output1 + output2 + output3 + output4);
        System.out.print("\n\n\n");

    }

    static void balancedParensResults(){

        Recursion test = new Recursion();
        ArrayStack stack = new ArrayStack();

        String balParenString1 = "(a+b) * c";
        String output1 = "Test of balancedParens method.\n" +
                         "Testing if parentheses are balanced in string " + balParenString1 + ".\n" +
                         "Parentheses are balanced: " + test.balancedParens(balParenString1, stack) + ".\n\n";
        
        String balParenString2 = "c";
        String output2 = "Test of balancedParens method.\n" +
                         "Testing if parentheses are balanced in string " + balParenString2 + ".\n" +
                         "Parentheses are balanced: " + test.balancedParens(balParenString2, stack) + ".\n\n";
        
        String balParenString3 = "((a+b) * c)";
        String output3 = "Test of balancedParens method.\n" +
                         "Testing if parentheses are balanced in string " + balParenString3 + ".\n" +
                         "Parentheses are balanced: " + test.balancedParens(balParenString3, stack) + ".\n\n";
        
        String balParenString4 = "(a+b) * c)";
        String output4 = "Test of balancedParens method.\n" +
                         "Testing if parentheses are balanced in string " + balParenString4 + ".\n" +
                         "Parentheses are balanced: " + test.balancedParens(balParenString4, stack) + ".\n\n";
         
        String balParenString5 = "(a+b * c";
        String output5 = "Test of balancedParens method.\n" +
                         "Testing if parentheses are balanced in string " + balParenString5 + ".\n" +
                         "Parentheses are balanced: " + test.balancedParens(balParenString5, stack) + ".\n\n";

        System.out.print(output1 + output2 + output3 + output4 + output5);
        System.out.print("\n\n\n");

    }

    static void reverseArrayResults(){

        Recursion test = new Recursion();

        Object[] objects = new Object[]{ "A", "B", "C", "D", "E"}; 
        int index1 = 0;
        int index2 = objects.length - 1;

        String arrayString = "";
        for(int i = 0; i < objects.length; i++)
            arrayString += objects[i] + " ";

        String output1 = "Test of reverseArray method.\n";
        String output2 = "Original array is { " + arrayString + "}.\n";
        String output3 = "Reverse array is { ";
        String output4 = "}.\n\n";

        System.out.print(output1 + output2 + output3);
        test.TESTreverseArray(objects, index1, index2);
        System.out.print(output4);
        System.out.print("\n\n\n");

    }
}
