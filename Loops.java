// while loops
int i = 0;
while(i < 7){
    System.out.println("foo");
    i++;
}

//--------------------------------------------------------
// for loops
for (int i = 0; i < 7; i++){
    System.out.println("bar");
}

for (initialization; termination; increment){
    body statements
}

// OR

int i = 0;
while(i < 7)
{
    System.out.println("bar");
    i++;
}

//--------------------------------------------------------
// enhanced for loops
ArrayList<String> dynamicArray = new ArrayList<String>();
dynamicArray.add("hello");
dynamicArray.add("world");
dynamicArray.add("etc");
for (int i = 0; i < dynamicArray.size(); i++){
    System.out.println(dynamicArray.get(i));
}

for(int i = 0; i < dynamicArray.size(); i++){
    String name = dynamicArray.get(i);
    System.out.println("hello " + name);
    // other operations using name
}

//--------------------------------------------------------
// other ways to write for loops to look exactly like the one above or before this next one
for(String name : dynamicArray){
    System.out.println("hello " + name);
    // other operations using name
}

for(element container : collection){
    // body statements
}
