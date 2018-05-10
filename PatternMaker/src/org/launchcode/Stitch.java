package org.launchcode;

public class Stitch {
    private char stitch;

    public Stitch() {
    }

    public Stitch(char stitch){
        this.stitch = stitch;
    }

    public char getStitch(){
        return stitch;
    }

    public void setStitch(char stitch){
        this.stitch = stitch;
    }

    public void sew(){
        System.out.print(stitch);
    }
}
