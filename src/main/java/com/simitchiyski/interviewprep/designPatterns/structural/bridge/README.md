### Bridge Pattern

A Bridge Pattern says that just "decouple the functional abstraction from the implementation so that the two can vary independently".

The Bridge Pattern is also known as Handle or Body.

##### Benefits:

 - It enables the separation of implementation from the interface.
 - It improves the extensibility.
 - It allows the hiding of implementation details from the client.
 
##### Usage:
 - When you don't want a permanent binding between the functional abstraction and its implementation.
 - When both the functional abstraction and its implementation need to extended using sub-classes.
 - It is mostly used in those places where changes are made in the implementation does not affect the clients.