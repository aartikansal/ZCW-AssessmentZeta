package com.zipcodewilmington.assessment1.part3;

import com.zipcodewilmington.assessment1.part1.IntegerArrayUtils;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

    private String name = "";
    private ArrayList<Pet> pets= new ArrayList<>();;


    //PetOwner owner
    public PetOwner(String name, Pet... pets) {

            this.name = name;
            if(pets != null){
                for(Pet element: pets){
                    this.pets.add(element);
                    element.setOwner(this);
                }
            }
}
    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
      this.pets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        return this.pets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungestPetAge() {
        Integer min = Integer.MAX_VALUE;
        Integer age;
        for(Pet pet :this.pets){
            age= pet.getAge();
            if(age<min)
                min = age;
        }
        return min;
    }
    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer max=0;
        Integer age;
        for(Pet pet : this.pets){
            age= pet.getAge();
            if(age>max)
                max = age;
        }
       return max;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer[] ages= new Integer[this.pets.size()];
        for(int i=0; i<this.pets.size(); i++){
            ages[i] = this.pets.get(i).getAge();
        }
        return IntegerArrayUtils.getAverage(ages).floatValue();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
       // return null;
        return this.pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets()
    {
        Pet[] answer = new Pet[pets.size()];

        if(pets.size() == 0){
            Pet[] noPet = new Pet[1];
            noPet[0] = null;
            return noPet;
        }
        for(int x = 0; x < pets.size(); x++){
            answer[x] = pets.get(x);
        }
        return answer;
    }
}
