
package projectwithgui;

import java.util.ArrayList;


public class Car {
          

    protected String brand;
    protected String model;
    protected String color;
    protected int year;
    protected String Carid;
    protected double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String brand, String model, String color, int year, String Carid, double price, boolean available) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.Carid = Carid;
        this.price = price;
        this.available = available;
    }
    protected boolean available;
    protected static ArrayList<Car> cars = new ArrayList<>();

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    

   public Car(){
       this.available=true;
   }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCarid() {
        return Carid;
    }

    public void setId(String id) {
        this.Carid = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
