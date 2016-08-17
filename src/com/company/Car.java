package com.company;

/**
 * Created by Administrator on 2016-08-16.
 */
public class Car {
    private Tire[] wheels;
    private Door[] doors;
    private float weight;

    public Car(float weight, Tire[] wheels, Door[] doors) {
        this.weight = weight;

        this.wheels = wheels;
        this.doors = doors;
    }
    //asdasdasd
    //asdasdasdasdasd
    //asfasasfasf
    public float GetWeight() {
        //Implement logic here to get the total weight of//the car + all the doors and wheelsreturn;}}
        float sum = 0;
        for (int i = 0; i < wheels.length; i++) {
            sum = sum + wheels[i].getWeight();

        }
        for (int i = 0; i < doors.length; i++) {
            sum = sum + doors[i].getWeight();

        }
        return sum+this.weight;
    }
}
