class Animal{
    String name;
    String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;

        }
    public  String makeSound() {
        return "No sound";
    }
}
class Dog extends Animal{
        public Dog(String name, String color)
        {
            super(name, color);
        }
        @Override
    public String makeSound()
        {
            return "Woof! My name is " + name + " and my color is " + color;
        }
}
class Cat extends Animal{
    public Cat(String name, String color)
    {
        super(name, color);
    }
    @Override
    public String makeSound()
    {
        return "Meow! My name is "+ name + " and my color is "+ color;
    }

}

public class Zad1 {
    public static void main(String[] args) {
        Dog dog = new Dog("wolny", "black");
        Cat cat = new Cat("dupcia", "white");

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}