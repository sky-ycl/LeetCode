package study.demo1;

public class Teacher {
    public Person get(){
        return new Student();
    }

    public static void main(String[] args) {
        Person person = new Teacher().get();
        System.out.println(person.getClass().getName());
    }
}
