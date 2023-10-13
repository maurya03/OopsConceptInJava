/*
    Agenda:
        1. Abstractions
        2. Memory Diagram
            2.1 Data Types - ref/value type
            2.2 call a function - call by value/call by reference
        3. this keyword
        4. Constructor
            4.1 Default
            4.2 parameterized
            4.3 Copy Constructor
        5. Basic Access modifier

 Abstraction
    To use a thing we need to know how to use it, not how it internally works.
    To drive a car we need to know how to operate clutch,gear,brakes,steering.
    We don't need to know how an internal combustion engine works.

 How abstraction is applied to Oops...
    Class Student
    {
        -----------
        -----------
    }
    To use this class the internal code is unnecessary to know. Whilst we can directly use in Client class.


Category of Data Types
    1. Value type / Primitive type
        1.1 byte / short / int / long
        1.2 float / double
        1.3 boolean
        1.4 char
     Memory created in the Stack, codes will be stored in permanent generation.
    2. Reference type
        2.1 Everything except primitives is a ref type. E.g, String, Hashmap, Priority Queue, ArrayList,
            Person Class Object
    Memory: Real Object in the heap, addresses on the stack.

Categories of Function calls:
    1. Call by value -- Java Supports
    2. Call by reference --  Java doesn't support due to absence of pointers
                             [ Supported by all the languages who support Pointers like C/C++/etc.]

Note: String is a ref type, but it is made to behave like value type, since String is a class.

this keyword
    1. 'this' is a special kind of keyword in Oops programming languages.
    2. It contains object of current class.

Basic Access Modifier
    1. Access modifiers are applied to data-members and member function of  the class.
    2. They control from where we can access a data-member or a method inside a class.
    3. Default -  Accessible in same pkg / Private / Public / Protected.
Note : Integer and int are two different keyword in Java.

 */
public class Class1 {

    // Call by value...
    int x;
    int y;
    void swap(int xx, int yy)
    {
        int temp = xx;
        xx = yy;
        xx = temp;

        System.out.print(xx + " and " + yy + " ");
    }

    /*
    --- call by reference ---
    void swap(int* xx, int* yy)
    {
        int* temp = *xx;
        *xx = *yy;
        *xx = temp;
    }
     */

    // ref type - call by value
    void fun(Class1 obj)
    {
        int temp = obj.x;
        obj.x = obj.y;
        obj.y = temp;

        System.out.print(obj.x + " and " + obj.y + " ");
    }

    void swap(Class1 c1, Class1 c2)
    {
        Class1 temp = c1;
        c1 = c2;
        c2 = temp;
    }
}
