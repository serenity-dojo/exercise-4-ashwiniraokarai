package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteFood;
    private Integer age;
    public Boolean isFed;
    private static String DOG_NOISE = "Woof";

    //Parameterized Constructor
    public Dog(String name, String favoriteFood, Integer age){
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getFavoriteFood(){
        return this.favoriteFood;
    }

    public Integer getAge(){
        return this.age;
    }

    //Exercise Task: Add a method called makeNoise() to your Dog class that returns "Woof"
    //Exercise Task: Refactor your makeNoise() method to use a static constant called DOG_NOISE

    public String makeNoise(){
        return Dog.DOG_NOISE;
    }

    //Exercise Task: Add a new method called feed() method that sets the isFed field to true
    public void feed(){
        this.isFed = true;
    }
}