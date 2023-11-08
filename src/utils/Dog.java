package utils;

public class Dog {

    private String name;
    private int age;
    private double skillLevel;

    public Dog() {
        this("Bubbles", 5, 5.0);
    }
    public Dog(String name, int age, double skillLevel) {
        this.name = name;
        this.age = age;
        this.skillLevel = skillLevel;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getSkills() {
        return this.skillLevel;
    }
    public void setName(String name) {
        this.name = name;
    }
}
