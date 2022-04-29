package example.step3;

class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "내 이름은 " + name + " 입니다.";
  }
}

public class Main {

  public static void main(String[] args) {
    Person person1 = new Person("홍길동");
    Person person2 = new Person("아무개");

    System.out.println(person1);
    System.out.println(person1.getName());

    System.out.println(person2);
    System.out.println(person2.getName());
  }
}
