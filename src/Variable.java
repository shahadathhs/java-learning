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

        String namep = "Jhon";

        System.out.println("Hello " + namep);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y

        int xx = 5, yy = 6, z = 50;
        System.out.println(xx + yy + z);

        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c);


       /*
        The general rules for naming variables are:
        Names can contain letters, digits, underscores, and dollar signs
        Names must begin with a letter
        Names should start with a lowercase letter, and cannot contain whitespace
        Names can also begin with $ and _
        Names are case-sensitive ("myVar" and "myvar" are different variables)
        Reserved words (like Java keywords, such as int or boolean) cannot be used as names
      */

    }
}
