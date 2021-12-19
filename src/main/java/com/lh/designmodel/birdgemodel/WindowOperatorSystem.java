package com.lh.designmodel.birdgemodel;

public class WindowOperatorSystem extends OperatorSystem{

    public WindowOperatorSystem(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(VideoFile videoFile) {
        videoFile.decode("OOOOO");
    }
}
