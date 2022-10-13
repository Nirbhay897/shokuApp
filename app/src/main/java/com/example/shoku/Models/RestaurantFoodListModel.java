package com.example.shoku.Models;

public class RestaurantFoodListModel {

    int foodItem;
    String foodName;
    String reviewCount;
    String foodDescription;
    String price;


    public RestaurantFoodListModel(int foodItem, String foodName, String reviewCount, String foodDescription, String price) {
        this.foodItem = foodItem;
        this.foodName = foodName;
        this.reviewCount = reviewCount;
        this.foodDescription = foodDescription;
        this.price = price;
    }

    public int getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(int foodItem) {
        this.foodItem = foodItem;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(String reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
