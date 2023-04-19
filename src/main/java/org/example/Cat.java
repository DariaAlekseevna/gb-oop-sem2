package org.example;

public class Cat extends Animal {

    private String color;
    private Integer age;


    public Cat(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        if (age < 0) {
            System.out.println("данные введены некоректно");
        } else {
            this.age = age;
        }
    }

    public Cat() {
        this.name = "Kotik"; // предзадали значение, чтобы избежать NPE (ошибка связана с null)
    }

    public void catMethod(){
        System.out.println(" свернулся в клубок");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        // валидация
        if (age < 0) {
            System.out.println("данные введены некоректно");
        } else {
            this.age = age;
        }

    }

    @Override
    public void voice() {
        System.out.println(name + " meooow!!");
    }
}
