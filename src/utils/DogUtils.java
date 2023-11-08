package utils;

public class DogUtils {

    public static void main(String[] args) {
        Dog myDog = new Dog("Marco", 30,25.0);
        Dog myDog1 = new Dog();
        Dog daisy = myDog1;
        myDog1.setName("Pluto");
        System.out.println(daisy.getName());

        System.out.println("Name: " + myDog.getName());
        System.out.println("Coursera.Age: " + myDog.getAge());
        System.out.println("Skills: " + myDog.getSkills());
    }
}
