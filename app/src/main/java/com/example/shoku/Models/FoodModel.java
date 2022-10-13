package com.example.shoku.Models;

public class FoodModel {

    int foodImage;
    String restaurantName, restaurantPlace, price, time, minute, distance, km, rating;

    public FoodModel(int foodImage, String restaurantName, String restaurantPlace, String price, String time, String minute, String distance, String km, String rating) {
        this.foodImage = foodImage;
        this.restaurantName = restaurantName;
        this.restaurantPlace = restaurantPlace;
        this.price = price;
        this.time = time;
        this.minute = minute;
        this.distance = distance;
        this.km = km;
        this.rating = rating;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantPlace() {
        return restaurantPlace;
    }

    public void setRestaurantPlace(String restaurantPlace) {
        this.restaurantPlace = restaurantPlace;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
