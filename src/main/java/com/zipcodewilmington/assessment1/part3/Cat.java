package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        this.setPetName(name);
        this.setPetAge(age);
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.setPetAge(age);
        this.setPetName("Cat name");
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name)
    {
        this.setPetName(name);
        this.setPetAge(0);
        System.out.println("name in class Cat is -->"+name);

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        this.setPetName("Cat name");
        this.setPetAge(0);

    }

    /**
     * @return meow as a string
     */
    public String speak()
    {


        return "Meow";
    }
}
