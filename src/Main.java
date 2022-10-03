import Animales.*;
import Animales.Animal;


import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animales = new LinkedList<>();

        animales.add(new Aguila());
        animales.add(new Condor());
        animales.add(new Gorrion());
        animales.add(new Condor());
        animales.add(new Raton());
        animales.add(new Gato());
        animales.add(new Perro());
        animales.add(new Sardina());
        animales.add(new Salmon());
        animales.add(new Tilapia());
        animales.add(new Trucha());
        animales.add(new Halcon());
        animales.add(new Pato());
        animales.add(new Tortuga());
        animales.add(new Sardina());


        for(Animal animal : animales){
            System.out.println(animal.toString());
        }
    }
}