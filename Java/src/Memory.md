- Stack vs heap memory
- a = 10
  - a is reference variable (stack memory)
  - 10 is object (heap memory).
  - a is  pointing to the object in heap memory.
- More than one reference varibales can point to same object.
- if any of the above reference variables change the object the original object is changed.


## Garbage collection
- The object with no reference variable, they will be removed when garbage collection is hit automatically.
- when `finalize` method is called

```java
int a = 10;
a= 37;
// no one is pointing  to 10 now so garbage collection removes it.
```