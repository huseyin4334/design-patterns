# Singleton Design Pattern

- A component which is instantiated only once

>> More: https://refactoring.guru/design-patterns/singleton


- We have to aware what happening in JVM. Because if we write this object to a file And read it later, JVM doesn't care that constructor is private.
- JVM create a new instance. That's not ok for us.
- We have to use Serializable interface and readResolve function for fix this.
- JVM calls this method when we read the file and transfer to object.