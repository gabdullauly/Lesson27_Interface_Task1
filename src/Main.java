/*
1) Create Interface Animal with methods:
void speak();
String getData();

Create Class Cat
-String name
-int age;

Constructors
Get/set

Implement Animal and its methods

Create Class Dog
-String class;
-String name
-int age;


Constructors
Get/set

Implement Animal and its methods

In main class create objects of Dog and Cat. Add them to Array of Animal and launch all methods
*/

public class Main {
    public static void main (String[] args){
        Cat cat1 = new Cat("Milka", 3);
        Cat cat2 = new Cat("Kiska", 5);
        Cat cat3 = new Cat("Lolka", 7);

        Dog dog1 = new Dog("Alabai", "Shera", 3);
        Dog dog2 = new Dog("Ovcharka", "Max", 4);
        Dog dog3 = new Dog("Haski", "Gala", 8);

        Animal[] animals = {dog3, cat2, cat1, dog1, dog2, cat3};

//        for (int i=0; i< animals.length; i++){
//            animals[i].speak();
//            System.out.println(animals[i].getData());
//        }


    }
}
