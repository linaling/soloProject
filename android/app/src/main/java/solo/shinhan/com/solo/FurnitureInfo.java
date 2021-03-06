package solo.shinhan.com.solo;

import android.graphics.Bitmap;

public class FurnitureInfo {
    private int furnitureNo;
    private String category;
    private String brand;
    private String model;
    private int price;
    private String furnitureName;
    private Bitmap furnitureImage;
    private int direction;
    private String furnitureImageString;

    public FurnitureInfo() {
    }

    public FurnitureInfo(int furnitureNo, String category, String brand, String model,int price, String furnitureName, Bitmap furnitureImage, int direction, String furnitureImageString) {
        this.furnitureNo = furnitureNo;
        this.category = category;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.furnitureName = furnitureName;
        this.furnitureImage = furnitureImage;
        this.direction =direction;
        this.furnitureImageString = furnitureImageString;
    }

    public int getFurnitureNo() {
        return furnitureNo;
    }

    public void setFurnitureNo(int furnitureNo) {
        this.furnitureNo = furnitureNo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFurnitureName() {
        return furnitureName;
    }

    public void setFurnitureName(String furnitureName) {
        this.furnitureName = furnitureName;
    }

    public Bitmap getFurnitureImage() {
        return furnitureImage;
    }

    public void setFurnitureImage(Bitmap furnitureImage) {
        this.furnitureImage = furnitureImage;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public String getFurnitureImageString() {
        return furnitureImageString;
    }

    public void setFurnitureImageString(String furnitureImageString) {
        this.furnitureImageString = furnitureImageString;
    }
}
