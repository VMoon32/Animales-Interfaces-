package Animales;

public class Pato extends Animal implements AnimalQueNada, AnimalQueVuela, AnimalQueCamina{
    @Override
    public String toString(){
        return "Pato";
    }

    @Override
    public void nadar(){

    }

    @Override
    public void volar() {

    }

    @Override
    public void caminar() {

    }
}
