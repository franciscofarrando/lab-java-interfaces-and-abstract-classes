package org.example;

import CarInventorySystem.Car;
import CarInventorySystem.Sedan;
import CarInventorySystem.Truck;
import CarInventorySystem.UtilityVehicle;

import VideoStreamingService.Movie;
import VideoStreamingService.TvSeries;
import VideoStreamingService.Video;


public class Main {
    public static void main(String[] args) {

        //CarInventorySystem
        Car car1 = new Sedan("4JH324343432KJB432", "VW", "Polo", 10000);
        Car car2 = new UtilityVehicle("2J324KJ324KJ324DA", "FIAT", "Toro", 203232, false);
        Car car3 = new Truck("23BKJ324KN12NK", "TOYOTA", "Hilux", 0, 4.5);


        System.out.println(car1.getInfo());
        System.out.println(car2.getInfo());
        System.out.println(car3.getInfo());


        System.out.println("-------------------");

        //Video Streaming Service
        Video video1 = new TvSeries("Lost", 90, 40);
        Video video2 = new Movie("Casablanca", 130, 4.5);


        System.out.println(video1.getInfo());
        System.out.println(video2.getInfo());

        System.out.println("-------------------");
    }
}