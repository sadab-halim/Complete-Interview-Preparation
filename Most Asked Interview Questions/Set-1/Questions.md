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

## 15. Difference between final, finally and finalize?
## 16. Difference between Abstract Class and Interface
| Abstract Class | Interface |
| -------------- | --------- |
| Abstract class can have abstract and non-abstract methods. | Interface can have only abstract methods. |
| Abstract class doesn't support multiple inheritance. | Interface supports multiple inheritance. |
| Abstract class can provide the implementation of interface. | Interface can't provide the implementation of abstract class. |
| The abstract keyword is used to declare abstract class. | The interface keyword is used to declare interface. |

## 17. Difference between Array and ArrayLise
## 18. Difference between String, String Builder and String Buffer.
## 19. Define Mutable and Immutable String
## 20. What are the different access specifiers?
## 21. Difference between the access specifiers
## 22. Difference between HashMap and HashTable
## 23. Difference between HashSet and TreeSet
## 24. What is meant by Collections in Java?
## 25. Explain the Collection Framework of Java
## 26. What is Join? What are the different types of Joins in SQL?
## 27. What is Identity in SQL
## 28. What is View in SQL? How to create views in SQL?
## 29. What are the uses of View?
## 30. What is Trigger in SQL?