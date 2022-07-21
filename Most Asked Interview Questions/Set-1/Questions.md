# Set - 1

## 1. Define Basic Principles of OOPS
The basic principles of OOPS are as follows:
- Polymorphism
- Inheritance
- Encapsulation
- Abstraction

**Polymorphism:** The word “polymorphism” means having many forms.
Polymorphism can be defined as the ability of a message to be displayed in more than one form. 

A real-life example of polymorphism is a person who at the same time can have different characteristics. Like a man at the same time is a father, a husband and an employee. So the same person exhibits different behavior in different situations. This is called polymorphism.

Polymorphism is mainly divided into two types:
- Compile-time Polymorphism
- Runtime Polymorphism

**Inheritance:** The capability of a class to derive properties and characteristics from another class is called Inheritance.

Inheritance is a feature or a process in which, new classes are created from the existing classes. The new class created is called “derived class” or “child class” and the existing class is known as the “base class” or “parent class”. The derived class now is said to be inherited from the base class.

When we say derived class inherits the base class, it means, the derived class inherits all the properties of the base class, without changing the properties of base class and may add new features to its own. These new features in the derived class will not affect the base class. 

The derived class is the specialized class for the base class:
- **Sub Class:** The class that inherits properties from another class is called Subclass or Derived Class. 
- **Super Class:** The class whose properties are inherited by a subclass is called Base Class or Superclass. 

**Modes of Inheritance:**
- Public Mode
- Protected Mode
- Private Mode

**Types of Inheritance:**
- Single Inheritance
- Multilevel Inheritance
- Multiple Inheritance
- Hierarchical Inheritance
- Hybrd Inheritance

**Encapsulation:** is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

A real life example of encapsulation, in a company there are different sections like the accounts section, finance section, sales section etc. The finance section handles all the financial transactions and keep records of all the data related to finance. 

Similarly the sales section handles all the sales related activities and keep records of all the sales. Now there may arise a situation when for some reason an official from finance section needs all the data about sales in a particular month. In this case, he is not allowed to directly access the data of sales section. 

He will first have to contact some other officer in the sales section and then request him to give the particular data. This is what encapsulation is. Here the data of sales section and the employees that can manipulate them are wrapped under a single name “sales section”. 

We can not access any function from class directly. We need an object to access that function which is using the member the variable of that class.

The function which we are making inside the class ,it must use the all member variable then only it is called encapsulation.

If we  don’t  make function inside the class which is using the member  variable of the class then we don’t call it encapsulation.  

Encapsulation also lead to data abstraction or hiding. As using encapsulation also hides the data.

**Abstraction:** is a way of hiding the implementation details and showing only the functionality to the users. In other words, it ignores the irrelevant details and shows only the required one.

**NOTE:** We cannot create an instance of Abstract Class, It reduces the duplication of code.

## 2. Why Java is Platform Independent?
Java languages was developed in such a way that it does not depend on any hardware or software due to the fact that the compiler compiles the code and then converts it to platform independent byte code which can be run on multiple systems.

The only condition to run that byte code is for the machine to have a runtime environment (JRE) installed in it.

## 3. Why do we need to install JVM?
The Java Virtual Machine is a program whose purpose is to execute other programs. 

The JVM has two primary functions: to allow Java programs to run on any device or operating system (known as the "Write once, run anywhere" principle), and to manage and optimize program memory. 

## 4. How does Java enable high performance?
Java enables high performance by introducing JIT- Just In Time compiler, JIT helps the compiler to compile the code On demand basis i.e which ever method is called only that method block will get compiled making compilation fast n time-efficient. This makes the java delivering high performance.

## 5. What do you mean by Constructor?
Constructor is a special method that is invoked automatically at the time of object creation. It is used to initialize the data members of new objects generally. 

The constructor in C++ has the same name as the class or structure. Constructor is invoked at the time of object creation. 

It constructs the values i.e. provides data for the object which is why it is known as constructors.

Constructor does not have a return value, hence they do not have a return type.

**Types of Constructors:**
- Default Constructor
- Parameterized Constructor
- Copy Constructor

## 6. What are the different types of variables in Java?
There are three different types of variables a class can have in Java are local variables, instance variables, and class/static variables.

- **Local Variable:** in Java can be declared locally in methods, code blocks, and constructors. When the program control enters the methods, code blocks, and constructors then the local variables are created and when the program control leaves the methods, code blocks, and constructors then the local variables are destroyed. A local variable must be initialized with some value.

*Example:*
```java:
public class LocalVariableTest {
   public void show() {
      int num = 100; // local variable
      System.out.println("The number is : " + num);
   }
   public static void main(String args[]) {
      LocalVariableTest test = new LocalVariableTest();
      test.show();
   }
}
```

- **Instance Variable:** in Java can be declared outside a block, method or constructor but inside a class. These variables are created when the class object is created and destroyed when the class object is destroyed.

```java:
public class InstanceVariableTest {
   int num; // instance variable
   InstanceVariableTest(int n) {
      num = n;
   }
   public void show() {
      System.out.println("The number is: " + num);
   }
   public static void main(String args[]) {
      InstanceVariableTest test = new InstanceVariableTest(75);
      test.show();
   }
}
```

- **Static Variable:** can be defined using the static keyword. These variables are declared inside a class but outside a method and code block. A class/static variable can be created at the start of the program and destroyed at the end of the program.

*Example:*
```java:
public class StaticVaribleTest {
   int num;
   static int count; // static variable
   StaticVaribleTest(int n) {
      num = n;
      count ++;
   }
   public void show() {
      System.out.println("The number is: " + num);
   }
   public static void main(String args[]) {
      StaticVaribleTest test1 = new StaticVaribleTest(75);
      test1.show();
      StaticVaribleTest test2 = new StaticVaribleTest(90);
      test2.show();
      System.out.println("The total objects of a class created are: " + count);
   }
}
```

## 7. What is a Class?
Collection of objects is called Class. It is a logical entity.

**Difference between Class and Structure** <br/>
| Class | Structure |
| ----- | --------- |
| Members of a class are private by default | Members of a class are private by default |
| Base classes/structures of a class are private by default | Base classes/structures of a structure are public by default |
| It is declared using the class keyword | It is declared using the struct keyword |
| It is reference type | It is a value type |
| It is used for Data abstraction and further inheritance | It is used for grouping of data |
| It can have NULL values | It cannot have NULL values |
| It may have all the types of constructors and destructors | It may have only parameterized constructor |

## 8. Difference between Overloading and Overriding
| Overloading | Overriding |
| ----------- | ---------- |
| It is a compile-time polymorphism | It is a run-time polymorphism. |
| It helps to increase the readability of the program. | It is used to grant the specific implementation of the method which is already provided by its parent class or superclass. |
| It occurs within the class. | It is performed in two classes with inheritance relationships. |
| In method overloading, methods must have the same name and different signatures. | In method overriding, methods must have the same name and same signature. |

## 09. What is meant by Interface?
An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a class. A Java interface contains static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not the method body. It is used to achieve abstraction and multiple inheritance in Java.

Java Interface also represents the **IS-A relationship.**

Uses of Interface:
- It is used to achieve total abstraction.
- Since java does not support multiple inheritances in the case of class, by using an interface it can achieve multiple inheritances.
- It is also used to achieve loose coupling.
- Interfaces are used to implement abstraction

**Why use interfaces when we have abstract classes?** <br/>
The reason is, abstract classes may contain non-final variables, whereas variables in the interface are final, public and static.

## 10. What do you mean by public static void main(String[] args)?
## 11. What is meant by Abstract Class?
Abstract Class is a class which contains the abstract keyword in its declaration is known as an abstract class.
- Abstract classes may or may not contain abstract methods, i.e., methods without a body ( public void get(); )
- But, if a class has at least one abstract method, then the class must be declared abstract.
- If a class is declared abstract, it cannot be instantiated.
- To use an abstract class, you have to inherit it from another class, provide implementations for the abstract methods in it.
- If we want to inherit an abstract class, you have to provide implementations to all the abstract methods in it.

## 12. What do you mean by Constructor Overloading?
We can have more than one constructor in a class with same name, as long as each has a different list of arguments.This concept is known as Constructor Overloading.

- Overloaded constructors essentially have the same name (exact name of the class) and differ by number and type of arguments.
- A constructor is called depending upon the number and type of arguments passed.
- While creating the object, arguments must be passed to let compiler know, which constructor needs to be called. 

```java:
#include<bits/stdc++.h>
using namespace std;

class Construct{ 
    public:
        float area;
        // Constructor with no parameters
        Construct(){
            area = 0;
        }
        
        // Constructor with two parameters
        Construct(int a, int b){
            area = a * b;
        }
        
        void disp(){
            cout<< area<< endl;
        }
};
 
int main(){
    // Constructor Overloading
    // with two different constructors
    // of class name
    construct o;
    construct o2( 10, 20);
     
    o.disp();
    o2.disp();
    return 1;
}
```

## 13. What are the different types of Inheritance?
**Single Inheritance:** In single inheritance, a class is allowed to inherit from only one class. i.e. one subclass is inherited by one base class only.

*Syntax*
```c++:
class subclass_name : access_mode base_class {
    //body of subclass
};

OR 

class A{
    .......
};

class B: public A{
    .......
};
```

**Multiple Inheritance:** In multiple inhertitance a class can inherit from more than one class. i.e one subclass is inherited from more than one base class.

*Syntax:*
```java:
class subclass_name : access_mode base_class1, access_mode base_class2, ....
{
  // body of subclass
};

OR

class B{ 
... .. ... 
};

class C{
... .. ...
};

class A: public B, public C{
... ... ...
};
```

**Multilevel Inheritance:** In this type of inheritance, a derived class is created from another derived class.

*Syntax:*
```java:
class C{ 
... .. ... 
};

class B:public C{
... .. ...
};

class A: public B{
... ... ...
};
```

**Hierarchical Inheritance:** In this type of inheritance, more than one subclass is inherited from a single base class. i.e. more than one derived class is created from a single base class.

*Syntax:*
```c++:
class A  {  
    // body of the class A.  
}    
class B : public A   {  
    // body of class B.  
}  
class C : public A  {  
    // body of class C.  
}   
class D : public A  {  
    // body of class D.  
}   
```

### Hybrid (Virtual) Inheritance
Hybrid Inheritance is implemented by combining more than one type of inheritance. For example: Combining Hierarchical inheritance and Multiple Inheritance. 

## 14. Difference between final, finally and finalize?
| S. No. | Key | final | finally | finalize |
| ------ | --- | ----- | ------- | -------- |
| 01. | Definition | final is the keyword and access modifier which is used to apply restrictions on a class, method or variable. | finally is the block in Java Exception Handling to execute the important code whether the exception occurs or not. | finalize is the method in Java which is used to perform clean up processing just before object is garbage collected. |
| 02. | Applicable to | Final keyword is used with the classes, methods and variables. | Finally block is always related to the try and catch block in exception handling. | finalize() method is used with the objects. |
| 03. | Functionality | (1) Once declared, final variable becomes constant and cannot be modified.
(2) final method cannot be overridden by sub class.
(3) final class cannot be inherited. | (1) finally block runs the important code even if exception occurs or not.
(2) finally block cleans up all the resources used in try block | finalize method performs the cleaning activities with respect to the object before its destruction. |
| 04. | Execution | Final method is executed only when we call it. | Finally block is executed as soon as the try-catch block is executed.
It's execution is not dependant on the exception. | finalize method is executed just before the object is destroyed. |

## 15. Difference between Abstract Class and Interface
| Abstract Class | Interface |
| -------------- | --------- |
| Abstract class can have abstract and non-abstract methods. | Interface can have only abstract methods. |
| Abstract class doesn't support multiple inheritance. | Interface supports multiple inheritance. |
| Abstract class can provide the implementation of interface. | Interface can't provide the implementation of abstract class. |
| The abstract keyword is used to declare abstract class. | The interface keyword is used to declare interface. |

## 16. Difference between Array and ArrayList
| Basis | Array | ArrayList |
| ----- | ----- | --------- |
| Dimensionality | It can be single-dimensional or multidimensional | It can only be single-dimensional  |
| Traversing Elements | For and for each generally is used for iterating over arrays  | Here iterator is used to traverse ArrayList |
| Length | length keyword can give the total size of the array. | size() method is used to compute the size of ArrayList. |
| Size | It is static and of fixed length | It is dynamic and can be increased or decreased in size when required. |
| Speed | It is faster as above we see it of fixed size | It is relatively slower because of its dynamic nature |
| Adding Elements | Assignment operator only serves the purpose | Here a special method is used known as add() method |

## 18. Difference between String, String Builder and String Buffer.
## 19. Define Mutable and Immutable String
## 20. What are the different access specifiers?
Access Modifiers or Access Specifiers in a class are used to assign the accessibility to the class members, i.e., they set some restrictions on the class members so that they can’t be directly accessed by the outside functions. <br/>

There are 3 types of access modifiers available in C++: 
- **Public:** All the class members declared under the public specifier will be available to everyone. 

The data members and member functions declared as public can be accessed by other classes and functions too. 

The public members of a class can be accessed from anywhere in the program using the direct member access operator (.) with the object of that class.

- **Private:** The class members declared as private can be accessed only by the member functions inside the class. 

They are not allowed to be accessed directly by any object or function outside the class. Only the member functions or the friend functions are allowed to access the private data members of the class. 

- **Protected:** The protected access modifier is similar to the private access modifier in the sense that it can’t be accessed outside of its class unless with the help of a friend class. 

The difference is that the class members declared as Protected can be accessed by any subclass (derived class) of that class as well. 

**NOTE:** This access through inheritance can alter the access modifier of the elements of base class in derived class depending on the mode of Inheritance.

- **Default:** The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.

**NOTE** Default access specifier is present ONLY in Java.

## 21. Difference between the access specifiers
| Access Modifier | Within Class | Withing Package | Outside Package by Subclass Only | Outside Package |
| ----------- | ----------- | ----------- | ------------- | ------------------ |
| Private | Yes | No | No | No |
| Default | Yes | Yes | No | No |
| Protected | Yes | Yes | Yes | No |
| Public | Yes | Yes | Yes | Yes |

## 22. Difference between HashMap and HashTable
| HashMap | HashTable |
| ------- | --------- |
| No method is synchronized. | Every method is synchronized. |
| Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe. | At a time only one thread is allowed to operate the Hashtable’s object. Hence it is thread-safe. |
| Threads are not required to wait and hence relatively performance is high. | It increases the waiting time of the thread and hence performance is low. |
| Null is allowed for both key and value. | Null is not allowed for both key and value. Otherwise, we will get a null pointer exception. |

## 23. Difference between HashSet and TreeSet
| S. No. | Key | HashSet | TreeSet |
| 01. | Implementation | Hashset is implemented using HashTable | The tree set is implemented using a tree structure. |
| 02. | HashSet allows a null object | The tree set does not allow the null object. It throws the null pointer exception. |
| 03. | Methods | Hash set use equals method to compare two objects |  Tree set use compare method for comparing two objects. |
| 04. Heterogeneous object | Hash set doesn't now allow a heterogeneous object | Tree set allows a heterogeneous object |
| 05. Ordering | HashSet does not maintain any order | TreeSet maintains an object in sorted order |

## 24. What is meant by Collections in Java?
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

**What is Collection in Java?** <br/>
A Collection represents a single unit of objects, i.e., a group

**What is Framework in Java?**
- It provides readymade architecture
- It represents a set of classes and interfaces
- It is optional

## 25. Explain the Collection Framework of Java
## 26. What is Join? What are the different types of Joins in SQL?
## 27. What is Identity in SQL
The IDENTITY keyword is a property in SQL Server. When a table column is defined with an identity property, its value will be auto-generated incremental value. This value is created by the server automatically. Therefore, we can't manually enter a value into an identity column as a user. Hence, if we mark a column as identity, SQL Server will populate it in an auto-increment manner.

## 28. What is View in SQL? How to create views in SQL?
In SQL, a view is a virtual table based on the result-set of an SQL statement.

A view contains rows and columns, just like a real table. The fields in a view are fields from one or more real tables in the database.

You can add SQL statements and functions to a view and present the data as if the data were coming from one single table.

A view is created with the CREATE VIEW statement. 

*CREATE VIEW Syntax* <br/>
CREATE VIEW view_name AS
SELECT column1, column2, ...
FROM table_name
WHERE condition;

## 29. What are the uses of View?
Views are generally used to focus, simplify, and customize the perception each user has of the database. Views can be used as security mechanisms by letting users access data through the view, without granting the users permissions to directly access the underlying base tables of the view.

## 30. What is Trigger in SQL?
A trigger defines a set of actions that are performed in response to an insert, update, or delete operation on a specified table. When such an SQL operation is executed, the trigger is said to have been activated. Triggers are optional and are defined using the CREATE TRIGGER statement.


