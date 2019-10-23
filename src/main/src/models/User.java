package models;

//PojoClass
public class User {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private static int counter = 0;

    public User(){

    }

    public User(String name, String lastName, int age) {
        this.id = counter++;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
