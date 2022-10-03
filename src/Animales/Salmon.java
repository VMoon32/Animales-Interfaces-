package Animales;

public class Salmon extends Animal implements AnimalQueNada{
    @Override
    public String toString(){
        return "Salmon";
    }

    @Override
    public void nadar(){

    }
}