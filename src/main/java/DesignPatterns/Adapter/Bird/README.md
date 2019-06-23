# Bird

Suppose you have a Bird class with `fly()`, and `makeSound()` methods. Let's assume that you are short on `ToyDuck` objects and you would like to use Bird objects in their place. Birds have some similar functionality but implement a different interface, so we can't use them directly. So we will use adapter pattern. Here our client would be `ToyDuck` and adaptee would be `Bird`. 

### Solution

`Bird` interface

```java
interface Bird {
    // birds implement Bird interface that allows them to fly and make sounds adaptee interface
    public void fly();
    public void makeSound();
}
```

`Bird` concrete class

```java
class Sparrow implements Bird {
    // a concrete implementation of bird
    public void fly() {
        System.out.println("Flying");
    }
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
```

`ToyDuck` interface

```java
interface ToyDuck {
    // target interface
    // toyducks don't fly they just make squeaking sound
    public void squeak();
}
```

`ToyDuck` Concrete Class

```java
class PlastickToyDuck implements ToyDuck {
    public void squeak() {
        System.out.println(Squeak);
    }
}
```

`BirdAdapter` is `Adapter`

```java
class BirdAdapter implements ToyDuck {
    // You need to implement the interface your client expects to use 
    Bird bird;
    public BirdAdapter(Bird bird) {
        // we need reference to the object we are adapting
        this.bird = bird;
    }
    
    public void squeak() {
        // translate the methods appropriately
        bird.makeSound();
    }
}
```

```java
class Main {
    public static void main(String args[]) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
        
        // Wrap a bird in a birdAdapter so that it behaves like toy duck 
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        
        System.out.println("Sparrow..."); 
                sparrow.fly(); 
                sparrow.makeSound(); 
          
                System.out.println("ToyDuck..."); 
                toyDuck.squeak(); 
          
                // toy duck behaving like a bird  
                System.out.println("BirdAdapter..."); 
                birdAdapter.squeak(); 
    }
}
```

Output

```
Sparrow...
Flying
Chirp Chirp
ToyDuck...
Squeak
BirdAdapter...
Chirp Chirp
```