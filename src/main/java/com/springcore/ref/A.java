package com.springcore.ref;

public class A {
    private int x;
    private B ob;
    public A(){
        super();
    }
    public void setOb(B ob){
        this.ob=ob;
    }
    public B getOb(){
        return this.ob;
    }
    public A(int val){
        super();
        this.x=val;
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x=x;
    }

}
