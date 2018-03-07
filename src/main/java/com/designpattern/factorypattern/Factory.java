package com.designpattern.factorypattern;

public class Factory {
    public OS getInstant(String str){
        if(str.equals("android"))
            return new Android();
        else if(str.equals("ios"))
            return new IOS();
        else
            return new Window();
    }
    public static void main(String[] args) {

        Factory factory = new Factory();
        OS objOS = factory.getInstant("android");
        objOS.spec();

        objOS = factory.getInstant("ios");
        objOS.spec();

        objOS = factory.getInstant("");
        objOS.spec();
    }

}
