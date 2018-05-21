package com.Hepsiburada2;

import  org.junit.Test;

public class SepetTest extends Islemler {
    @Test
    public void girisyap() {

        new Sepet(driver).girisyap("gulseminrisvan@gmail.com", "12345g");


    }
}