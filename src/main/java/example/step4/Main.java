package example.step4;

class Person {

  private String name;

  private String job;

  public Person(String name, String job) {
    this.name = name;
    this.job = job;
  }

  @Override
  public String toString() {
    return "내 이름은 " + name + "이고, 직업은 " + job + "입니다.";
  }
}

public class Main {

  public static void main(String[] args) {
    Person person = new Person("홍길동", "의적");

    System.out.println(person);
  }
}
