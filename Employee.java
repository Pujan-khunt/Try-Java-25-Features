class Person {
  final int age;

  Person(int age) {
    this.age = age;
  }
}

// Pre Java 25 child classes had to call the super() or this() in the first line of the constructor.
public class Employee extends Person {
  final String name;

  Employee(String name, int age) {
    if (age < 18) throw new IllegalArgumentException("Not an adult.");
    super(age); // super() is no longer required as the first statement in Java 25
    this.name = name;
  }

  public static void main(String[] args) {
    Employee emp = new Employee("Alice", 35);
    System.out.println("Person age set: " + emp.age);
  }
}
