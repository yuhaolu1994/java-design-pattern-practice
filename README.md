# Java Design Pattern
## SOLID
### Open/closed Principle
Open for extention, close for implementation
<img src="https://github.com/yuhaolu1994/java-design-pattern-practice/blob/master/src/main/resources/art/open-close.png" width="80%" height="80%"></br>
### Dependency Inversion Principle
Interface oriented coding
<img src="https://github.com/yuhaolu1994/java-design-pattern-practice/blob/master/src/main/resources/art/dependency-inversion.png" width="80%" height="80%"></br>
### Single Responsibility Principle
Class / Interface / Method
<img src="https://github.com/yuhaolu1994/java-design-pattern-practice/blob/master/src/main/resources/art/single-responsibility.png" width="80%" height="80%"></br>
### Interface Segregation Principle
![](https://github.com/yuhaolu1994/java-design-pattern-practice/blob/master/src/main/resources/art/interface-segregation.png)
### Demeter Principle
Member variable, input parameters and return value
![](https://github.com/yuhaolu1994/java-design-pattern-practice/blob/master/src/main/resources/art/demeter.png)
## Design Patterns
### Simple Factory
Use java reflection
![](https://github.com/yuhaolu1994/java-design-pattern-practice/blob/master/src/main/resources/art/simplefactory.png)
### Factory Method
#### Example Logic
<img src="https://github.com/yuhaolu1994/java-design-pattern-practice/blob/master/src/main/resources/art/factorymethod.png" width="80%" height="80%"></br>
### Factory Used In JDK
#### Example 1
1. **Iterator** interface -> **Video** abstract class (abstract product)
2. iterator() in **Collection** interface -> **VideoFactory** abstract class
3. iterator() in **ArrayList** class (implements **Collection**) -> **JavaVideoFactory** class
4. **Itr** class in **ArrayList** implements Iterator -> **JavaVideo** class (actual product)
#### Example 2
1. **URLStreamHandlerFactory** interface -> **VideoFactory**
2. **Factory** in Launcher.class -> **JavaVideoFactory**
3. **URLStreamHandler** abstract class -> **Video**
4. use reflection Class.forName(actual class path) -> **JavaVideo**
### Abstract Factory Method
Product group, not same product grade
<img src="https://github.com/yuhaolu1994/java-design-pattern-practice/blob/master/src/main/resources/art/abstractfactory.png">
