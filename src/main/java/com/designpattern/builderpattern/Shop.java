package com.designpattern.builderpattern;

public class Shop {
    public static void main(String[] args) {
        //Haven't applied Builder Patter
        Phone phone = new Phone("IOS", 168, "QualComm", 5.5, 3100);
        System.out.println(phone.toString());

        //Applied Builder Pattern
        Phone phone1 = new PhoneBuilder().setOs("IOS").setBattery(3100).setRam(16).getPhone();
        System.out.println(phone1.toString());
    }
}
