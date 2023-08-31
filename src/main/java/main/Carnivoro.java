package main;

public class Carnivoro implements Alimentable {
    @Override
    public void comer() {
        System.out.println("Comiendo carne");
    }

    public Carnivoro() {
    }
}