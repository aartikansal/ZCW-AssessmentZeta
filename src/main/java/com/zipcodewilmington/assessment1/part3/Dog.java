package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age  age of this dog
     */
    public Dog(String name, Integer age) {
        this.setPetName(name);
        this.setPetAge(age);
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.setPetAge(age);
        this.setPetName("Dog name");
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        this.setPetName(name);
        this.setPetAge(0);
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        this.setPetName("Dog name");
        this.setPetAge(0);

    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
