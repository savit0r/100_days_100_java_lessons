### **Assignment 5: Object-Oriented Programming (OOP) Concepts**

**Objective:** Implement basic OOP principles: Classes, Objects, Inheritance, Polymorphism, Encapsulation, and Abstraction.

**Tasks:**

1. **Create a Class and Object:**
    - Define a `Person` class with attributes `name` and `age`.
    - Create an object of `Person` and display its details.
2. **Inheritance:**
    - Create a subclass `Student` that inherits from `Person` and adds an attribute `studentId`.
    - Instantiate a `Student` object and display all attributes.
3. **Encapsulation:**
    - Modify the `Person` class to make `name` and `age` private.
    - Provide public getter and setter methods for these attributes.
4. **Polymorphism:**
    - Demonstrate method overriding by creating a method `displayInfo` in both `Person` and `Student` classes.
5. **Abstraction:**
    - Create an abstract class `Animal` with an abstract method `makeSound`.
    - Implement subclasses `Dog` and `Cat` that provide concrete implementations of `makeSound`.



    **Explanation:**

1. **Class and Object:**
    - **`Person` Class:** Defines attributes `name` and `age` with a `display` method.
    - **Object Creation:** An instance of `Person` is created, and its details are displayed.
2. **Inheritance:**
    - **`Student` Class:** Inherits from `Person` and adds `studentId`.
    - **Method Overriding:** The `display` method in `Student` overrides the one in `Person` to include `studentId`.
3. **Encapsulation:**
    - **`EncapsulatedPerson` Class:** Attributes are private, and public getters and setters are provided to access and modify them safely.
    - **Data Validation:** Setter for `age` includes a simple validation to ensure age is positive.
4. **Polymorphism:**
    - Demonstrated by creating a `Person` reference pointing to a `Student` object. The overridden `display` method in `Student` is called, showcasing runtime polymorphism.
5. **Abstraction:**
    - **`Animal` Abstract Class:** Contains an abstract method `makeSound`.
    - **`Dog` and `Cat` Classes:** Provide concrete implementations of `makeSound`, illustrating abstraction where the base class defines a contract without specifying the exact behavior.