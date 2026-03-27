//encapsulation
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Seema");
        p.setAge(25);

        System.out.println(p.getName() + " is " + p.getAge());
    }
}