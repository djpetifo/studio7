package org.launchcode.studio7;

public class DVD extends AbstractDisc implements OpticalDisc {



    public DVD(String name, String contents, String discType) {
        super(name, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void writeData() {
        System.out.println("Writing image data to DVD.");
    }

    @Override
    public void readData(){
        System.out.println("Playing image data from DVD.");
    }



}
