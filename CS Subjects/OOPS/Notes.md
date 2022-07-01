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
Constructor is a special method that is invoked automatically at the time of object creation. It is used to initialize the data members of new objects generally. 

The constructor in C++ has the same name as the class or structure. Constructor is invoked at the time of object creation. 

It constructs the values i.e. provides data for the object which is why it is known as constructors.

Constructor does not have a return value, hence they do not have a return type.

Constructors can be defined inside or outside the class declaration:-

The syntax for defining the constructor within the class: <br/>
`<class-name> (list-of-paramters) {// constructor defn}`

The syntax for defining the constructor outside the class: <br/>
`<class-name>: :<class-name> (list-of-paramters) {// constructor defn}`

### Example - 1
```java:
// defining the constructor within the class
#include <bits/stdc++.h>
using namespace std;

class Student {
    int roll_no;
    char name[10];
    double fees;
 
public:
    Student(){
        cout << "Enter the RollNo:";
        cin >> rno;
        cout << "Enter the Name:";
        cin >> name;
        cout << "Enter the Fee:";
        cin >> fee;
    }
 
    void display(){
        cout << endl << rno << "\t" << name << "\t" << fees;
    }
};
 
int main(){
    Student s; // constructor gets called automatically when
               // we create the object of the class
    S.display();
    return 0;
}
```
### Example - 2
```java:
// defining the constructor outside the class
#include <bits/stdc++.h>
using namespace std;

class Student {
    int roll_no;
    char name[50];
    double fees;
 
public:
    Student();
    void display();
};
 
Student::Student()
{
    cout << "Enter the RollNo:";
    cin >> roll_no;
 
    cout << "Enter the Name:";
    cin >> name;
 
    cout << "Enter the Fee:";
    cin >> fees;
}
 
void Student::display(){
    cout << endl << roll_no << "\t" << name << "\t" << fees;
}
 
int main(){
    Student s;
    s.display();
    return 0;
}
```

### Characteristics of the constructor:
- The name of the constructor is the same as its class name.
- Constructors are mostly declared in the public section of the class though it can be declared in the private section of the class.
- Constructors do not return values; hence they do not have a return type.
- A constructor gets called automatically when we create the object of the class.
- Constructors can be overloaded.
- Constructor can not be declared virtual.

### Types of Constructors:
- **Default Constructor:** is the constructor which doesn’t take any argument. It has no parameters. It is also called a zero-argument constructor.

**NOTE:** Even if we do not define any constructor explicitly, the compiler will automatically provide a default constructor implicitly.

```java:
#include<bits/stdc++.h>
using namespace std;

class Student{
    int roll_no;
    char name[50];
    double fees;
    
    public:
    Student(){
    //  Explicit Default constructor
        cout<<"Enter the RollNo:";
        cin>>rno;
        cout<<"Enter the Name:";
        cin>>name;
        cout<<"Enter the Fee:";   
        cin>>fees;
    }   
     
    void display(){
        cout<<endl<<rno<<"\t"<<name<<"\t"<<fees;
    }
};
 
int main(){
    Student S;
    S.display();
    return 0;
}
```
- **Parameterized Constructor:** It is possible to pass arguments to constructors. Typically, these arguments help initialize an object when it is created. 

To create a parameterized constructor, simply add parameters to it the way you would to any other function. 

When we define the constructor’s body, we the parameters to initialize the object. 

**NOTE:** when the parameterized constructor is defined and no default constructor is defined explicitly, the compiler will not implicitly call the default constructor and hence creating a simple object

When an object is declared in a parameterized constructor, the initial values have to be passed as arguments to the constructor function. The normal way of object declaration may not work. The constructors can be called explicitly or implicitly.

```
Example e = Example(0, 50); // Explicit call
Example e(0, 50);   // Implicit call
```

### Uses of Parameterized Constructor
- It is used to initialize the various data elements of different objects with different values when they are created.
- It is used to overload constructors.

```java:
#include<bits/stdc++.h>
using namespace std;

class Point{
    private:
        int x, y;
 
    public:
        // Parameterized Constructor
        Point(int x1, int y1){
            x = x1;
            y = y1;
        }
    
        int getX() { return x; }
        int getY() { return y; }
};
 
int main(){
    // Constructor called
    Point p1(10, 15);
    // Access values assigned by constructor
    cout << "p1.x = " << p1.getX() << ", p1.y = " << p1.getY();
    return 0;
}
```

- **Copy Constructor:** is a member function that initializes an object using another object of the same class. 
- The process of initializing members of an object through a copy constructor is known as copy initialization.

- Copy constructor is used to initialize the members of a newly created object by copying the members of an already existing object.

A copy constructor has the following general function prototype: <br/>
`class-name (const class-name &old_obj);`

```java:
#include<bits/stdc++.h>
using namespace std;

class Point {
    private:
        int x, y;
 
    public:
        Point(int x1, int y1){
            x = x1;
            y = y1;
        }
    
        // Copy constructor
        Point(const Point& p1){
            x = p1.x;
            y = p1.y;
        }
    
        int getX() { return x; }
        int getY() { return y; }
};
 
int main(){
    Point p1(10, 15); // Normal constructor is called here
    Point p2 = p1; // Copy constructor is called here
 
    // Let us access values assigned by constructors
    cout << "p1.x = " << p1.getX()
         << ", p1.y = " << p1.getY();
    cout << "\np2.x = " << p2.getX()
         << ", p2.y = " << p2.getY();
    return 0;
}
```

### When is the Copy Constructor called?
- When an object of the class is returned by value.
- When an object of the class is passed (to a function) by value as an argument.
- When an object is constructed based on another object of the same class.
- When the compiler generates a temporary object.

### Shallow Copy and Deep Copy
| Shallow Copy | Deep Copy |
| ------------ | --------- |
| Shallow Copy stores the references of objects to the original memory address | Deep copy stores copies of the object’s value |
| Shallow Copy reflects changes made to the new/copied object in the original object | Deep copy doesn’t reflect changes made to the new/copied object in the original object |
| Shallow Copy stores the copy of the original object and points the references to the objects | Deep copy stores the copy of the original object and recursively copies the objects as well |
| Shallow copy is faster | Deep copy is comparatively slower |

### Copy Constructor vs Assignment Operator
| Copy Constructor | Assignment Operator |
| ---------------- | ------------------- |
| It is called when a new object is created from an existing object, as a copy of the existing object | This operator is called when an already initialized object is assigned a new value from another existing object |
| It creates a separate memory block for the new object | It does not create a separate memory block or new memory space |
| It is an overloaded constructor | It is a bitwise operator |
| C++ compiler implicitly provides a copy constructor, if no copy constructor is defined in the class | A bitwise copy gets created, if the Assignment operator is not overloaded |

## Virtual Constructor in C++

### How constructor is different from a normal function?
- Constructor has same name as the class itself
- Default Constructors don’t have input argument however, Copy and Parameterized Constructors have input arguments
- Constructors don’t have return type
- A constructor is automatically called when an object is created.
- It must be placed in public section of class.
- If we do not specify a constructor, C++ compiler generates a default constructor for object (expects no parameters and has an empty body).

## Constructor Overloading
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

### Destructors 
Destructor is an instance member function which is invoked automatically whenever an object is going to be destroyed.

- Destructor is also a special member function like constructor. Destructor destroys the class objects created by constructor.
- Destructor has the same name as their class name preceded by a tiled (~) symbol.
- It is not possible to define more than one destructor. 
- The destructor is only one way to destroy the object create by constructor. Hence destructor can-not be overloaded.
- Destructor neither requires any argument nor returns any value.
- It is automatically called when object goes out of scope. 
- Destructor release memory space occupied by the objects created by constructor.
- In destructor, objects are destroyed in the reverse of an object creation.

Syntax for defining the destructor within the class: <br/>
`~ <class-name>(){}`

Syntax for defining the destructor outside the class: <br/>
`<class-name>: : ~ <class-name>(){}`

### Properties of Destructor
- Destructor function is automatically invoked when the objects are destroyed.
- It cannot be declared static or const.
- The destructor does not have arguments.
- It has no return type not even void.
- An object of a class with a Destructor cannot become a member of the union.
- A destructor should be declared in the public section of the class.

### When is Destructor called?
A destructor function is called automatically when the object goes out of scope: 
- the function ends
- the program ends
- a block containing local variable ends
- a delete operator is called

### Private Destructors
Destructors with the access modifier as private are known as Private Destructors. Whenever we want to prevent the destruction of an object, we can make the destructor private.

### What is the use of Private Destructor?
Whenever we want to control the destruction of objects of a class, we make the destructor private. For dynamically created objects, it may happen that you pass a pointer to the object to a function and the function deletes the object. 

If the object is referred after the function call, the reference will become dangling.
### How are destructors different from a normal member function?
Destructors have same name as the class preceded by a tilde (~) 
Destructors don’t take any argument and don’t return anything

### Can there be more than one destructor in a class? 
No, there can only one destructor in a class with classname preceded by ~, no parameters and no return type.

### Why do we need to write a user-defined destructor?
If we do not write our own destructor in class, compiler creates a default destructor for us. The default destructor works fine unless we have dynamically allocated memory or pointer in class. 

When a class contains a pointer to memory allocated in class, we should write a destructor to release memory before the class instance is destroyed. This must be done to avoid memory leak.

### Can a destructor be virtual?
Yes, In fact, it is always a good idea to make destructors virtual in base class when we have a virtual function

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