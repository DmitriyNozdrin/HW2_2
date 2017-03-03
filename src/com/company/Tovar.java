package com.company;

/**
 * Created by We on 03.03.2017.
 */
public class Tovar {
    public   String name;
    public double price;

    public Tovar(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Tovar() {

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Tovar setName(String name) {
        this.name = name;
        return this;
    }

    public Tovar setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (Double.compare(tovar.price, price) != 0) return false;
        return name != null ? name.equals(tovar.name) : tovar.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
