package com.company;

/**
 * Created by We on 03.03.2017.
 */
public class Veg extends Tovar{
    public String date;

    public Veg(String name, double price, String date) {
        super(name, price);
        this.date=date;
    }



    public String getDate() {
        return date;
    }

    public Veg setDate(String date) {
        this.date = date;
        return this;
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }




    @Override
    public String toString() {
        return super.toString()+"Veg{" +
                "date='" + date + '\'' +
                '}';
    }
}
