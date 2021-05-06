package com.animal;

public class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }

    @Override
    public void greets(){
        System.out.println("Woow");
    }
    @Override
    public void greets(Dog another){
        System.out.println("WooooooooW");
    }

    public void greets(BigDog another){
        System.out.println("WOOOOOOOOOOW");
    }
}
