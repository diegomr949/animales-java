package main;

class Herbivoro implements Alimentable {
    @Override
    public void comer() {
        System.out.println("Comiendo hierba");
    }
}
