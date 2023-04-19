package org.example;

//1) Создать класс Cat с полями: имя,цвет,кол-во лет. Поработать с полями напрямую
public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Marzik","asd", 3); // положили значения
        System.out.println("Cat name: " + cat1.getName() + " color: " + cat1.getColor() + " age: " + cat1.getAge());


        cat1.animalinfo();
        cat1.jump();
        cat1.voice();
        Cat cat2 = new Cat("Barsik","black", 5);
        cat2.voice();
        Dog dog = new Dog();
        dog.voice();

        Animal cat3= new Cat("Murka", "grey", 4);
        Animal dog2 = new Dog();
        ((Cat) cat3).catMethod();
        Animal[] catsAndDogs ={
                new Cat("1", "2", 3),
                new Dog()
        };

        for (Animal o:catsAndDogs) {
            o.voice();
        }

        if (cat3 instanceof Cat) {
            System.out.println("кот");
        } else System.out.println(" не кот");



    }
}
