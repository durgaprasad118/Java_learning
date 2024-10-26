- Objects are stored in `heap memory`
- primitives are stored in `stack memory`


### Memory allocation `new` Keyword
- stored in heap memory
- the one and two refer to same object
- Any change made via `one` will make a change with `two`
```java
    Student one = new Student("dp");
    Student two = one;
    two.name = "kunal";
        System.out.println(one.name);
// this prints "Kunal"
```

- Everything is `pass by value` in java



## final
- We can make like constant.
- IT should be declared `In capital letters`
- `final int INCREMENT = 2;`
- final variables must be intialised while declaring it since it can't be changed.
-  this can't be changed if primitives , but the value of the object can change.
- but we can't reassign it
```java
   final A kunal = new A("dp");
        kunal.name = "Durga Prasad";
        // but we cant do some thing like  kunal = new A("xyz") no reassigning

        System.out.println(kunal.name);


class A {
    final int num = 3;
    String name ;

    public A(String name){
        this.name = name;
    }
}
  ```


### Garbage Collection
- `java finlize` method is called when java is doing garbage collection.
- Right before the obj is freed from the memory java is going to call the garbage collector and finalize method.