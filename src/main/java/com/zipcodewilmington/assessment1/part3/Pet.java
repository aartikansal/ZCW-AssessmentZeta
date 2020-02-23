package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */

    private String petName;
    private Integer petAge;
    private PetOwner petOwner;

    public Pet() {

    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this.petName=name;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        this.petAge=age;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        this.petName=name;
        this.petAge=age;
    }

    /**
     * @set name of this pet
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }

    /**
     * @return name of this pet
     */
    public String getName()
    {
        return this.petName;
    }

    /**
     * @set age of this pet
     */
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }
    /**
     * @return age of this pet
     */
    public Integer getAge() {

        return this.petAge;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner)
    {
        this.petOwner=newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner()
    {
        return this.petOwner;
    }
}
