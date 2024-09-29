class Person{
    String firstName;
    String lastName;
    int age;
    String gender;
    String nationality;

    public Person(String firstName, String lastName, int age, String gender, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }
        @Override
    public String toString(){
        return "Person: [ First name: "+ firstName + ", Last Name: " + lastName + ", Age: " +
                age + ", Gender: " + gender + ", Nationality: " + nationality + " ]";
        }
}

public class Zad3 {
    public static void main(String[] args){
        Person person = new Person("Lukasz", "Wolny", 18, "Cipka", "Polska");
        System.out.println(person.toString());
    }
}
