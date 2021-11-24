package com.lh.designmodel.basicmethod;

public class ZhuoMianInput {
    private AbstractSkin abstractSkin;

    public void seeSkin(AbstractSkin abstractSkin){
        this.abstractSkin = abstractSkin;
    }

    public void display(){
        abstractSkin.display();
    }
}
