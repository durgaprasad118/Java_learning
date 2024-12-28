
## Primitive DataTypes
- the data types that can't be broken down further.
```java
 int rNo = 64;
float marks = 67.8f;
double largeDecimalValues = 45749238.45;
long largeIntegerValues = 74980370444L;
char character = 'a';
boolean isEven = true;
```
- here `rNo` is identifier and `64` is literal
- in `float` why do we add f
  - by default all decimal types are of `double` if we want to store in `float` we need `45.54f`
  - to get accurate results we use `double`
- in `long` why do we use L
  - By default the integer data types is `int`
  - we can store larger values of integers
- Wrapper Classes
    ```java
    Integer n = 45;
    
    ```
- n. we get so many properties and methods are available

 ### Casting and conversion
- the two types should be compatible like (int and float)
- Destination type should be greater than the source
  - `float num = in.nextFloat();` if i give int it converts into float
- **Narrowing conversion || type casting**: converting float to int
  - `int num = (int)34.5` //num is 34
- **Automatic type promotion**: if the conversion exceeds limits then it gives remainder of givenvalue and the maivlaue
  - if one of the things is long everything goes to long
  - integer * float => float
    ```java
    int a = 257;
    byte b = (byte)a;
    //byte stores only 256 max
    //now it exceeds range of byte so it gives remainder of a and max of b = 1
     ```
-  Whenever you do `byte` evalutaions it is directly converted to `int`
- Characters give `ASCII` values when converted to int
  - 'A' - 65, 'Z'- 90
  - 'a' - 97, 'z' - 122
- java follows `UNICODE` values
- 