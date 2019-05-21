# Flyweight Pattern

The Flyweight pattern is used to reduce the number of objects created and to decrease memory footprint and increase performance. This type of design pattern is a structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.

The Flyweight pattern tries to reuse already existing similar kind objects by storing them. It creates a new object only when no matching object is found. 

In this exercise we want to demonstrate this pattern by drawing a lot of circles in different locations by only creating five different circle objects. Only five colors are available (`Color.RED, Color.GREEN, Color.BLUE, Color.CYAN, Color.YELLOW`) so the color property is used to check already existing circle objects.

@startuml

skinparam linetype polyline
skinparam linetype ortho


class Client {
- WIDTH: int
- HEIGTH: int
- {static} randomCoordinateX (): int
- {static} randomCoordinateY (): int
- {static} randomRadius (): int
- {static} randomColor (): java.awt.Color
+ Client (width: int, heigth: int)
+ {static} main (args: String[]): void
}

class ShapeFactory{
+ {static} getCircle(color: java.awt.Color): Circle
}

interface Shape{
+ draw(g: java.awt.Graphics): void
}

class Circle {
- color: java.awt.Color
- x: int
- y: int
- radius: int
+ Circle(color: java.awt.Color)
+ setX (x: int): void
+ setY (y: int): void
+ setRadius (radius: int): void
+ getColor(): java.awt.Color
+ draw(g: java.awt.Graphics): void
}

Client .up.> ShapeFactory
Client ..right..> Circle
ShapeFactory "1" *--right-- "*" Shape : - CircleMap
Circle -up-|> Shape


@enduml

To apply the Flyweight pattern, we need to divide an object property into intrinsic and extrinsic properties. 
Intrinsic properties make the Object unique (in our case the color of the circle) whereas extrinsic properties 
are set by client code and used to perform different operations. Our circle object has extrinsic properties such 
as the center coordinates and the radius. 

*You have the following tasks:**

1. ✅[Implement a Shape interface (our Flyweight)](testClass[Shape])

2. ✅[Implement a Circle class (our Flyweight implementation)](testClass[Circle])

3. ✅[Implement a ShapeFactory (our Flyweight factory)](testClass[ShapeFactory]): The color is the instrinsic property. 
Only create a new circle if a circle of the respective color does not already exist. 
ShapeFactory has a HashMap of Circle with the color of the Circle object as the key. Whenever a request comes to create 
a circle of particular color to ShapeFactory, it checks the circle objects in its HashMap. If the object of Circle is found, 
that object is returned. Otherwise a new object is created, stored in the HashMap for future use, and returned to the client.

Remove the comments (`/*...*/`) in the class `Client.java` and run the program. Enjoy the colored circles.