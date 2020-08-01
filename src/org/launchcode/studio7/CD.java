package org.launchcode.studio7;

public class CD extends AbstractDisc implements OpticalDisc {

    public CD(String name, String contents, String discType) {
        super(name, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data tp CD.");
    }

    @Override
    public void readData(){
        System.out.println("Reading data from CD.");
    }

}
