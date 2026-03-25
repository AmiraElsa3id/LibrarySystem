# Library System

This is a Java project that demonstrates the implementation of a library management system, focusing on various design patterns and adhering to SOLID principles. The following instructions will guide you on how to run the project locally on your console.

## Requirements
- JDK 11 or higher
- Terminal or command prompt

## Running the Project Locally

1. **Clone the repository**:
   ```bash
   git clone https://github.com/AmiraElsa3id/LibrarySystem.git
   cd LibrarySystem
   ```

2. **Compile the Java files**:
   Assuming all your Java files are in the `src` directory:
   ```bash
   javac src/*.java
   ```

3. **Run the Main Class**:
   After compilation, run the main class. Adjust the command according to your main class name:
   ```bash
   java -cp src MainClassName
   ```

Replace `MainClassName` with the actual name of your main class that contains the `main` method.

## Design Patterns Used
This project utilizes several design patterns to promote code reusability and modularity. Some of the key patterns include:
- Singleton Pattern - For managing a single point of access to the library database.
- Factory Pattern - For creating different types of library items.
- Observer Pattern - For notifying users about book availability.

## SOLID Principles
The implementation follows the SOLID principles for object-oriented design:
- **Single Responsibility Principle**: Each class has a single responsibility.
- **Open/Closed Principle**: Classes can be extended without modifying their original code.
- **Liskov Substitution Principle**: Subclasses can replace their parent classes without affecting the functionality.
- **Interface Segregation Principle**: No client should be forced to depend on methods it does not use.
- **Dependency Inversion Principle**: High-level modules do not depend on low-level modules; both depend on abstractions.

Following these principles ensures that the library system is easy to maintain, extend, and understand.

## Conclusion
This guide provides a basic overview of how to run the Library Management System locally. Feel free to explore and modify the code as per your requirement!