package com.lh.designmodel.buildermodel.highbuilder;

public class PhoneClient {

    public static void main(String[] args) {
        Phone phone = new Phone.BuilderPhone().builderPhoneColor("White")
                .builderPhoneLogo("logo")
                .builderPhoneName("star")
                .builderPhoneSize("1990X2000")
                .builderCreatePhone();

        System.out.println(phone.getPhoneColor());
        System.out.println(phone.getPhoneLogo());
        System.out.println(phone.getPhoneName());
        System.out.println(phone.getPhoneSize());
    }
}
