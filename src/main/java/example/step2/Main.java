package example.step2;

class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

public class Main {

  public static void main(String[] args) {
    Person person1 = new Person("홍길동");
    Person person2 = new Person("홍길동");

    System.out.println(person1);
    System.out.println(person1.getName());

    System.out.println(person2);
    System.out.println(person2.getName());
  }
}
