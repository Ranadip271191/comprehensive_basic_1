package org;

public class RoadToll {
    String TypeOfVehicle;
    double NumberOfTires;

    RoadToll(String TypeOfVehicle, double NumberOfTires){
        this.NumberOfTires = NumberOfTires;
        this.TypeOfVehicle = TypeOfVehicle;
    }
    double calculateRoadToll(){
        double TollAount = 0.00;
        if(NumberOfTires == 2){
            TollAount = 0.00;
        }else if(NumberOfTires  == 4){
            TollAount =  50.00;
        }else if(NumberOfTires > 4){
            TollAount = 100.00;
        }
        return TollAount;
    }

    public static void main(String[] args) {
        RoadToll roadTollMotorBike = new RoadToll("MotorBike",2);
        double tollAmount = roadTollMotorBike.calculateRoadToll();
        System.out.println("MotorBike road toll amount ->"+tollAmount);
        RoadToll roadTollCar = new RoadToll("Car",4);
        System.out.println("Car road toll amount ->"+roadTollCar.calculateRoadToll());
        RoadToll roadTollTruck = new RoadToll("Car",10);
        System.out.println("Truck road toll amount ->"+roadTollTruck.calculateRoadToll());
    }
}
