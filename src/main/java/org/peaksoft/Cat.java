package org.peaksoft;

public class Cat implements Animal{


    private String breed;
    private String color;
    private String age;


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
    public void animalPlus() {
        System.out.println("Cat plus");
    }

    @Override
    public void animalMinus() {
        System.out.println("Cat minus");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
