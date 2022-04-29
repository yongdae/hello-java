package example.step1;

class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }
}

public class Main {

  public static void main(String[] args) {
    Person person1 = new Person("홍길동");
    Person person2 = new Person("아무개");

    System.out.println(person1);
    System.out.println(person2);
  }
}
