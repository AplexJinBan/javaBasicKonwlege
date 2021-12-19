package com.lh.designmodel.birdgemodel;

public abstract class OperatorSystem {

    private VideoFile videoFile;

    public OperatorSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(VideoFile videoFile );


}
