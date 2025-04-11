package org.collections;

import java.util.Arrays;

public class ComparableIntro {
    public static class Car{
        String carName;
        String carType;

        Car(String name,String type){
            this.carName = name;
            this.carType = type;
        }
    }

    public static void main(String[] args) {
        Car carArray[] = new Car[3];

        carArray[0]= new Car("Tata","Petrol");
        carArray[1]= new Car("audi","Diesel");
        carArray[2]= new Car("Polo","Petrol");

        Arrays.sort(carArray,((Car obj1, Car obj2) ->obj2.carName.compareTo(obj1.carName)));

        for(Car ch : carArray){
            System.out.println(ch.carName + " " + ch.carType);
        }

        // here we are explicitely passing arguments to get user defined sorting
    }
}
