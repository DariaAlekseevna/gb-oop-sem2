package org.example;

public abstract class Animal {
    protected String name;
    public void animalinfo() {
        System.out.println("Информация о животном " + name);
    }

    public abstract void voice();

    public void jump() {
        System.out.println("Животное подпрыгнуло " + name);
    }
}
