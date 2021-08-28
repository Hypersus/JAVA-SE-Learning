---
title: Day5
---

## Scanner:

### Standard Template:

```java
//Create a scanner instance to receive the system input
Scanner scanner = new Scanner(System.in);

//Do NOT forget to close the IO stream
scanner.close();
```

### Further Exploration:

```java
Scanner scanner = new Scanner(System.in);
System.out.println("Input:");
if (scanner.hasNext()){
    System.out.println(scanner.next());
}
if (scanner.hasNext()){
    System.out.println(scanner.nextLine());
}
if (scanner.hasNextLine()){
    System.out.println(scanner.nextLine());
}
if (scanner.hasNextLine()){
    System.out.println(scanner.next());
}
scanner.close();
```

Now begin to debug, place a breakpoint on the sentence *System.out.println("Input:");*

- When the *hasNext()* method is called, it would only send the input to the buffer after it detect a valid *String+\n* input. For instance when we input two '\n', the method is still waiting, then we input "a \n", then the method progresses to send buffer the input stream "\n\n a \n" and return *true*
- When the *next()* method is called, it would select "a" out of the buffer and *leave out* all the ' ' and '\n'
- When the *hasNextLine()* method is called, it would sent all the input before the *First* '\n' it met to the buffer. For instance we input " a \n"  and the buffer has the input " a \n".
- When the *nextLine()* method is called, it would select " a " that is it would select all the char before '\n'

