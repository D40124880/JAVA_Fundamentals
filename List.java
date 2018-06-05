import java.util.ArrayList;
ArrayList<Integer> myArray = new ArrayList<Integer>();

// adding and finding
myArray.get(0);
int num = myArray.get(0);

// <object> is to include all types of objects of int, double, string, and etc
import java.util.ArrayList;
ArrayList<Object> list = new ArrayList<Object>();
list.add(10);
list.add("Hello");
list.add(new ArrayList<Integer>());
list.add(new Double(12.0)); // adding a Double of value 12.0
        
System.out.println(list); // [10, "Hello", [], 12.0]
