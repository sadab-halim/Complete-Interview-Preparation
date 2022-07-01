# Object Oriented Programming System Notes

## Overview
### What is Object Oriented Programming?
### How Object Oriented Programming is related to the real world?
### Why to study OOPS?
### Limitations of OOPS

## Pillar of OOPS
## What is Class? <br/>
Collection of objects is called Class. It is a logical entity.

### Difference between Class and Structure <br/>
| Class | Structure |
| ----- | --------- |
| Members of a class are private by default | Members of a class are private by default |
| Base classes/structures of a class are private by default | Base classes/structures of a structure are public by default |
| It is declared using the class keyword | It is declared using the struct keyword |
| It is reference type | It is a value type |
| It is used for Data abstraction and further inheritance | It is used for grouping of data |
| It can have NULL values | It cannot have NULL values |
| It may have all the types of constructors and destructors | It may have only parameterized constructor |


### Similarities between Structure and Class
### Access Modifiers
Access Modifiers or Access Specifiers in a class are used to assign the accessibility to the class members, i.e., they set some restrictions on the class members so that they can’t be directly accessed by the outside functions. <br/>

There are 3 types of access modifiers available in C++: 
- **Public:** All the class members declared under the public specifier will be available to everyone. 

The data members and member functions declared as public can be accessed by other classes and functions too. 

The public members of a class can be accessed from anywhere in the program using the direct member access operator (.) with the object of that class. 

```java:
#include<bits/stdc++.h>
using namespace std;

class Circle {
    public:
        double radius;
        double compute_area() {
            return 3.14*radius*radius;
        }
};

int main(){
    Circle obj;
    obj.radius = 5.5;

    cout<<"Radius is: "<<obj.radius<<"\n";
    cout<<"Area is: "<<obj.compute_area();
    return 0;
}
```

- **Private:** The class members declared as private can be accessed only by the member functions inside the class. 

They are not allowed to be accessed directly by any object or function outside the class. Only the member functions or the friend functions are allowed to access the private data members of the class. 

```java:
#include<bits/stdc++.h>
using namespace std;

class Circle {
    private:
        double radius;
    public:
        double compute_area() {
            // member function can access private
            // data member radius
            radius = r;
            double area = 3.14*radius*radius;
            cout<<"Radius is: "<<radius<<endl;
            cout<<"Area is: "<<area;
        }
};

int main(){
    Circle obj;
    obj.compute_area(1.5);
    return 0;
}
```

- **Protected:** The protected access modifier is similar to the private access modifier in the sense that it can’t be accessed outside of its class unless with the help of a friend class. 

The difference is that the class members declared as Protected can be accessed by any subclass (derived class) of that class as well. 

**NOTE:** This access through inheritance can alter the access modifier of the elements of base class in derived class depending on the mode of Inheritance.

```java:
#include<bits/stdc++.h>
using namespace std;

class Parent {
    protected:
        int id_protected;
};

class Child : public Parent {
    public:
        void setId(int id) {
            // child class is able to access the inheritance
            // protected data members of base class
            id_protected = id;
        }
        void displayId() {
            cout<<"id_protected is: "<<id_protected<<endl;
        }
};

int main(){
    Child obj1;
    obj1.setId(81);
    obj1.displayId();
    return 0;
}
```
### Data Member

### Member Function
- Inside Class Function
- Outside Class Function

### What is Constructor?
- Default Constructor
- Parameterised Constructor
- Copy Constructor
- Virtual Constructor
- Virtual Copy Constructor
- How constructors are different from a normal member function?
- Can we have more than one constructor in a class?
## What is an Object?


### Real world analogy of Class and Object?
### Important Keywords
## Features of OOPS
### Polymorphism
### Inheritance
### Encapsulation
### Abstraction

### Dynamic Binding
### Message Binding

## Object Oriented Design Interview Questions
### Design a HashMap
### Design a LRU Cache
### Design a Call Center
### Design a Parking Lot
### Design an Online Chat

## Miscellaneous
### C vs C++ vs Java
### Difference between Procedural Programming and OOPS
### Why Java is not a purely Object Oriented Language?
### Is an array a primitive type or an object in Java?
### What is early and late binding?
### What is the default access modifier in a class?
### How many instances can be created for an abstract class?
### Define Garbage Collection. How does it work?
### Define Manipulators
### What do you mean by finally block?
### What is a final variable?
### What is meany by an exception?
### Is an error basically the same as an exception?
### What is Exception Handling
### What is the method 'finalize' used for?
### What are the three arguments of a ternary operator?
### Describe the concept of Enum
### Basic understanding of design patterns
### Is it possible for a class to inherit the constructor of its base class?
### When should I use a struct instead of a class?
### Cohesion vs Coupling