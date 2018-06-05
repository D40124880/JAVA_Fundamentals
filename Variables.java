public class Variables {
    public static void main(String[] args) {
        int ourInt; // we can declare a varibale without setting its value
        ourInt = 400; // we can assign a value to the variable later in our code
        double pi = 3.14159265; // we can also declare and assign on the same line
        boolean bool = true;
        char singleCharacter = 'A';

        String multipleCharacters = "ABC";
    }
}
//-----/-//-/-/-/-/-/-/-/--/-/-/-/-/---/-//--/-/-/-//--//--/-/-/-/-/-/-/-/-/-/-/-/-///
public class Casting {
    public static void main(String] args) {
        int i = 120;   // going from a big variable type to a smaller variable type
        byte b = (byte) i;

        System.out.println(b);
    }
}

public class Casting {
    public static void main(String] args) {
        byte i = 127;   // going from a small variable type to a bigger variable type
        int b = i;

        System.out.println(b);
    }
}

//-----/-//-/-/-/-/-/-/-/--/-/-/-/-/---/-//--/-/-/-//--//--/-/-/-/-/-/-/-/-/-/-/-/-///

class Casting {
    public static void main(String[] args) {
        double d = 35.25;
        double dd = 35.99;
        
        // casting the double d into a int
        int i = (int) d;
        
        // casting the double dd into a int
        int ii = (int) dd;
        System.out.println(i);
        System.out.println(ii);
    }
}
// output: 35
// output: 35

//-----/-//-/-/-/-/-/-/-/--/-/-/-/-/---/-//--/-/-/-//--//--/-/-/-/-/-/-/-/-/-/-/-/-///

class Casting {
    public static void main(String[] args) {
        int i = 35;
        float f = i;
        System.out.println("The number is: " + f);
    }
}
// output: 35.0

//-----/-//-/-/-/-/-/-/-/--/-/-/-/-/---/-//--/-/-/-//--//--/-/-/-/-/-/-/-/-/-/-/-/-///

// TestSum.java   ---primitive
public static void name(String[] args) {
    long start = System.currentTimeMillis();
    Integer sum = 0;
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
        sum += i;
    }
    System.out.println("Sum: " + sum);
    double total = (double) (end - start) / 1000;
    System.out.println("Time of execution: " + total + " seconds");
}
// Sum: 1073741825
// Time of execution: 6.477 seconds

//-----/-//-/-/-/-/-/-/-/--/-/-/-/-/---/-//--/-/-/-//--//--/-/-/-/-/-/-/-/-/-/-/-/-///

// TestSum.java   ---object
public static void main(String[] args) {
    long start = System.currentTimeMillis();
    int  sum = 0;
    for (int i = "operator from-rainbow">=0; i < Integer.MAX_VALUE; i++) {
        su += i;
    }
    System.out.println("Sum: " + sum);
    long end = System.currentTimeMillis();
    double total = (double) (end - start) / 1000;
    System.out.println("Time of execution: " + total + " seconds");
}
// ahhhh much better now!
// Sum: 1073741825
// Time of execution: 0.763 seconds





// null values: Primitive data types can only hold data. However, Object types are pointers to where the data is stored. This means that this pointer can point to nothing (null), while primitive types cannot.
public class TestNull {
    public static void main(String[] args) {
        Integer a = 10;
        int b = 10;
        a = null;
        b = null;
    }
}