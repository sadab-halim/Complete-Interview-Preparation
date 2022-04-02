## Array Notes

An array is a collection of similar type of elements which has contiguous memory location.

It is a data structure where we store similar elements. We can store only a fixed set of elements in an array.

In Java, array is an object of a dynamically generated class. Java array inherits the Object class, and implements the Serializable as well as Cloneable interfaces. We can store primitive values or objects in an array in Java

Java provides the feature of anonymous arrays which is not available in C/C++.

![arrayexample](array1.png)

*Advantages*
- Code Optimization
- Random Access

*Disadvantages*
- Size Limit

## Types of Array in Java
- Single Dimensional Array
- Multidimensional Array

## Single Dimensional Array

*Syntax:* <br/>
```
a. dataType[] arr;
b. dataType []arr;
c. dataType arr[];
```

*Instantiation* <br/>
```
arrayVar = new dataType[size];
```

*Example:* <br/>
```
int[] arr = new int[5];
```

*Declaration, Instantiation and Initialization* <br/>
```
int[] arr = {1, 2, 3, 4, 5};
```

*For-Each Loop for Java Array:* <br/>
```
for(dataType variable: array) {
    // body of the loop
}
```

### Anonymous Array
Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.

```
public class TestAnonymousArray{  
    static void printArray(int arr[]){  
        for(int i=0;i<arr.length;i++)  
        System.out.println(arr[i]);  
    }  
  
    public static void main(String args[]){  
        printArray(new int[]{10,22,44,66});//passing anonymous array to method  
    }   
}  
```

### ArrayIndexOutOfBoundsException
The Java Virtual Machine (JVM) throws an ArrayIndexOutOfBoundsException if length of the array in negative, equal to the array size or greater than the array size while traversing the array.

```
public class TestArrayException{  
    public static void main(String args[]){  
        int arr[]={50,60,70,80};  
        for(int i=0;i<=arr.length;i++){  
            System.out.println(arr[i]);  
        }  
    }  
}  
```

## Multi Dimensional Array

*Syntax:* <br/>
```
dataType[][] arrayVar;
dataType [][]arrayVar;
dataType arrayVar[][];
dataType []arrayVar[];
```

*Example to instantiate Multidimensional Array* <br/>
```
int[][] new int[3][3] //3 rows and 3 columns
```

*Example of Multi dimensional array* <br/>
```
class Main{  
    public static void main(String args[]){  
        //declaring and initializing 2D array  
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
        //printing 2D array  
        for(int i=0;i<3;i++){  
            for(int j=0;j<3;j++){  
                System.out.print(arr[i][j]+" ");  
             }  
            System.out.println();  
        }  
    }
}  
```

## Jagged Array in Java
If we are creating odd number of columns in a 2D array, it is known as a jagged array. In other words, it is an array of arrays with different number of columns.

```
class Main{  
    public static void main(String[] args){  
        //declaring a 2D array with odd columns  
        int arr[][] = new int[3][];  
        arr[0] = new int[3];  
        arr[1] = new int[4];  
        arr[2] = new int[2];  
        //initializing a jagged array  
        int count = 0;  
        for (int i=0; i<arr.length; i++)  
            for(int j=0; j<arr[i].length; j++)  
                arr[i][j] = count++;  
   
        //printing the data of a jagged array   
        for (int i=0; i<arr.length; i++){  
            for (int j=0; j<arr[i].length; j++){  
                System.out.print(arr[i][j]+" ");  
            }  
            System.out.println();//new line  
        }  
    }  
}  
```

## What is class name of Java array ?
In Java, an array is an object. For array object, a proxy class is created whose name can be obtained by getClass().getName() method on the object.

```
class Main{  
    public static void main(String args[]){  
        //declaration and initialization of array  
        int arr[]={4,4,5};  
        //getting the class name of Java array  
        Class c=arr.getClass();  
        String name=c.getName();  
        //printing the class name of Java array   
        System.out.println(name);  
    }
}  
```

## Copying a Java Array
We can copy an array to another by the arraycopy() method of System class.

*Syntax:* <br/>
```
public static void arraycopy(
    Object src, int srcPos, Object dest, int destPos, int length
)
```

*Example:* <br/>
```
class Main {  
    public static void main(String[] args) {  
        //declaring a source array  
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd' };  
        //declaring a destination array  
        char[] copyTo = new char[7];  
        //copying array using System.arraycopy() method  
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
        //printing the destination array  
        System.out.println(String.valueOf(copyTo));  
    }  
}  
```

## Cloning an Array in Java
Since, Java array implements the Cloneable interface, we can create the clone of the Java array. If we create the clone of a single-dimensional array, it creates the deep copy of the Java array. <br/>

It means, it will copy the actual value. But, if we create the clone of a multidimensional array, it creates the shallow copy of the Java array which means it copies the references.

```
class Main{  
    public static void main(String args[]){  
        int arr[]={33,3,4,5};  
        System.out.println("Printing original array:");  

        for(int i:arr)  
            System.out.println(i);  
  
        System.out.println("Printing clone of the array:");  

        int carr[]=arr.clone();  
        for(int i:carr)  
            System.out.println(i);  
  
        System.out.println("Are both equal?");  
        System.out.println(arr==carr);  
    }
}  
```

