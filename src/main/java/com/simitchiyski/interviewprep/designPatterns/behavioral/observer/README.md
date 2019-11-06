### Observer Pattern

An Observer Pattern says that "just define a one-to-one dependency so that when one object changes state, all its dependents are notified and updated automatically".

This pattern is also known as Dependents or Publish-Subscribe.

##### Benefits:

 - It describes the coupling between the objects and the observer.
 - It provides the support for broadcast-type communication.
 
##### Usage:
 - When the change of a state in one object must be reflected in another object without keeping the objects tight coupled.
 - When the framework we writes and needs to be enhanced in future with new observers with minimal chamges.