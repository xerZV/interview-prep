### Strategy Pattern

A Strategy Pattern says that "defines a family of functionality, encapsulate each one, and make them interchangeable".

Favor composition over inheritance.

The Strategy Pattern is also known as Policy.

In Strategy pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior pattern.

In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. The strategy object changes the executing algorithm of the context object.

##### Benefits:

 - It provides a substitute to subclassing.
 - It defines each behavior within its own class, eliminating the need for conditional statements.
 - It makes it easier to extend and incorporate new behavior without changing the application.
 
##### Usage:
 - When the multiple classes differ only in their behaviors.e.g. Servlet API.
 - It is used when you need different variations of an algorithm.