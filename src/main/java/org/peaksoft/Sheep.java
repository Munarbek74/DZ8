package org.peaksoft;

public class Sheep implements Animal{
    private String breed;
    private String color;
    private String age;
@Override
public void animalPlus() {
    System.out.println("Sheep plus");
}

    @Override
    public void animalMinus() {
        System.out.println("Sheep minus");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
