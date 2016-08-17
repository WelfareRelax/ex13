package com.company;

public class Main {

    public static void main(String[] args) {
	    Tire tire1 = new Tire(1321);
        Tire tire2 = new Tire(152);
        Tire[] tires = new Tire[2];
        tires[0] = tire1;
        tires[1] = tire2;
        Door door1 = new Door(41564);
        Door door2 = new Door(414);
        Door[] doors = new Door[2];
        doors[0] = door1;
        doors[1] = door2;

        Car car1 = new Car(845,tires, doors );
        System.out.println(car1.GetWeight());
        System.out.println("Hello world git");

    }
}
