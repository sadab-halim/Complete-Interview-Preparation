# Recursion Notes

When a function calls itself until a specified condition is met is known as **recursion.**

A recursive method solves a problem by calling a copy of itself to work on a smaller problem.

## Working of Recursion
- **Base Case:** A recursive function must have a terminating condition at which
the process will stop calling itself. Such a case is known as the base case. In
the absence of a base case, it will keep calling itself and get stuck in an
infinite loop. Soon, the recursion depth* will be exceeded and it will throw
an error.

- **Recursive Call:** The recursive function will invoke itself on a smaller version of the main problem

**NOTE:** Recursion uses an in-built stack that stores recursive calls. Hence, the number of recursive calls must be as small as possible to avoid memory-overflow. If the
number of recursion calls exceeded the maximum permissible amount, the recursion depth* will be exceeded. This condition is called stack overflow

- There are two types of cases in recursion i.e. recursive case and a base case.
- The base case is used to terminate the recursive function when the case turns out to be true.
- Each recursive call makes a new copy of that method in the stack memory.
- Infinite recursion may lead to running out of stack memory.

## How are recursive functions stored in memory? <br/>
Recursion uses more memory, because the recursive function adds to the stack with each recursive call, and keeps the values there until the call is finished. The recursive function uses LIFO (LAST FILL FIRST OUT) Structure just like the stack data structure.

