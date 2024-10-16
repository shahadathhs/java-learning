public class Variable {
    public static void main(String[] args) {
        // type variableName = value;

        String name = "Sajib";
        System.out.println(name);

        int myNum1 = 15;
        System.out.println(myNum1);

        myNum1 = 20;  // myNum1 is now 20
        System.out.println(myNum1);

        int myNum2;
        myNum2 = 15;
        System.out.println(myNum2);

        final int myNum3 = 15;
       // myNum3 = 20;  // will generate an error: cannot assign a value to a final variable


        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
    }
}
