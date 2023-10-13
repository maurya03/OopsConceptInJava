# OopsConceptInJava
Object-Oriented Concept using java programming language.

Introduction to Oops:

Programming paradigms
1. Procedural - C, Sql
2. Declarative - HTML
3. Object-Oriented Programming - Java, C++, C#, Python, JavaScript
4. Functional - Haskell, JavaScript, Scala

Procedural Language in C
1. Program is composed of procedures or functions
2. These procedures call each others.
3. Wash starts at main procedure.

Cons of using Procedural language:
1. Humans think in active voice, and we focus on nouns. Verbs are activities done by nouns.
    For Ex. 
   Main()
    {
        string st = "new data";
        System.out.println(st);  // print(Verbs) the student(noun)
    }
    While in Oops we do st.print();
2. Lack of modularity
   Divisible in independent small modules.
   Making a system by assembling small independent system.
    Modular:
   1. Easy to divide the task within the team.
   2. More readable/Maintainable/Extensible
    Like a book with 400 pages without any Chapters, or a book with 400 pages and 10 chapters.

      3. Biggest problem with procedural language is, they have poor support for modularity. The modules created
   are not independent of each other.
   For Ex: There are three files 
      1. f1(d1,d2,d3, fun1(), fun2(), fun3())  - M1
      2. f1(d4,d5,d6, fun4(), fun5(), fun6())  - M2
      3. f1(d7,d8,d9, fun7(), fun8(), fun9())  - M3
      All the data-members can be tweaked by all the functions.
      Modules f1 f2 and f3 files are not truly independent they can change each other's date.

How Oops Solves above problems
1. Natural way of expressing logic : Active voice 
2. Proper Modularity - Division of work & Readability.

Oops Pillars:
1. Encapsulation  - Modularity
2. Abstraction    - Modularity
3. Inheritance
4. Polymorphism

