package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");

//        Ash: Idk why .getFavoriteToy is here. Don't think it was an ask in the previous exercise or this one.
//        Going to assume the sample code meant to say .getfavoriteFood() instead and make that change accordingly
//        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");

//        Ash: Commenting sample code because compiler cannot decide which one of the assertEquals flavor to call:
//        "java: reference to assertEquals is ambiguous
//        both method assertEquals(java.lang.Object,java.lang.Object) in org.junit.Assert and method assertEquals(long,long) in org.junit.Assert match"
//        Assert.assertEquals(fido.getAge(),5);

//      Using some google search help, manipulated the second arg ("expected value")
//      The result is an Integer object that represents the integer value specified by the string.
        Assert.assertEquals(fido.getAge(), Integer.valueOf("5"));
    }

    @Test
    public void whenADogBarks() {
        Dog fido = new Dog("Fido","Bone", 5);

        String dogSound = "";
        // Done: implement a method in the Dog sound called makeNoise() that returns the sound a dog makes: "Woof", e.g.
         dogSound = fido.makeNoise();

        Assert.assertEquals(dogSound, "Woof");
    }

    @Test
    public void whenADogGetsFed() {
        Dog fido = new Dog("Fido","Bone", 5);

        // Done: implement a method in the Dog sound called feed() that sets the isFed variable to true:
         fido.feed();

         //Ash: isFed is referred to as a variable in the Exercise as well as in the code comments. But it is written as a method call here.
         //So, I am gonna replace isFed() with isFed instead
        Assert.assertTrue(fido.isFed);
    }
}
