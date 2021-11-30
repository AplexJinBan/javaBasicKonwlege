package com.lh.designmodel.buildermodel.highbuilder;

import com.lh.designmodel.buildermodel.Builder;

public class Phone {

    private String phoneName;

    private String phoneSize;

    private String phoneColor;

    private String phoneLogo;

    public String getPhoneName() {
        return phoneName;
    }

    public String getPhoneSize() {
        return phoneSize;
    }

    public String getPhoneColor() {
        return phoneColor;
    }

    public String getPhoneLogo() {
        return phoneLogo;
    }

    public  Phone(BuilderPhone builderPhone){
        this.phoneColor = builderPhone.phoneColor;
        this.phoneLogo = builderPhone.phoneLogo;
        this.phoneName = builderPhone.phoneName;
        this.phoneSize = builderPhone.phoneSize;
    }

    public static final class BuilderPhone {

        private String phoneName;

        private String phoneSize;

        private String phoneColor;

        private String phoneLogo;

        public BuilderPhone builderPhoneColor(String phoneColor){
            this.phoneColor = phoneColor;
            return this;
        }
        public BuilderPhone builderPhoneSize(String phoneSize){
            this.phoneSize = phoneSize;
            return this;
        }
        public BuilderPhone builderPhoneName(String phoneName){
            this.phoneName = phoneName;
            return this;
        }
        public BuilderPhone builderPhoneLogo(String phoneLogo){
            this.phoneLogo = phoneLogo;
            return this;
        }
        //使用构建者创建对象
        public Phone builderCreatePhone(){
            return new Phone(this);
        }



    }

}
