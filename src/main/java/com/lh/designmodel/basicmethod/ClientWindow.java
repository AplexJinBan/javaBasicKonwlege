package com.lh.designmodel.basicmethod;

public class ClientWindow {
    public static void main(String[] args) {
        HuMingSkin huMingSkin = new HuMingSkin();

        ZhuoMianInput zhuoMianInput = new ZhuoMianInput();
        zhuoMianInput.seeSkin(huMingSkin);
        zhuoMianInput.display();

    }

}
