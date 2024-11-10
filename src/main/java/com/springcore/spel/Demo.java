package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{22+11}")
    private int x;
    @Value("#{1+11}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(36)}")
    private int z;


    @Value("#{T(java.lang.Math).E}")
    private double k;
    @Value("#{new java.lang.String('Anupam ')}")
    private String name;



    @Value("#{8>3}")
    private boolean isActive;

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", k=" + k +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }


    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }



    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
