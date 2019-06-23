# Adapter Pattern

This pattern is easy to understand as the real world is full of adapters. 

For example consider a USB to Ethernet adapter. We need this when we have an Ethernet interface on one end and USB on the other. Since they are incompatible with each other. We use an adapter that converts one to other. This example is pretty analogous to Object Oriented Adapters. 

In design, adapters are used when we have a class (Client) expecting some type of object and we have an object (Adaptee) offering the same features but exposing a different interface. 

To use an adapter: 

1. The client makes a request to the adapter by calling a method on it using the target interface. 
2. The adapter translates that request on the adaptee using the adaptee interface. 
3. Client receive the results of the call and is unaware of adapter's presence. 

### Definition

> The adapter pattern covert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces. 

### Class Diagram

![class-diagram](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/classDiagram.jpg)

The client sees only the target interface and not the adatper. The adapter implements the target interface. Adapter delegates all requests to Adaptee. 

### Example

* Bird

### Reference

* https://www.geeksforgeeks.org/adapter-pattern/