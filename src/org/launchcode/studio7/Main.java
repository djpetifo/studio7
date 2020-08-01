package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        OpticalDisc cd = new CD("The Carter II", "Lil Wayne Studio Album", "Music");
        OpticalDisc dvd = new DVD("Lion King", "Disney feature film", "Movie");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        cd.writeData();
        cd.spinDisc();
        cd.readData();

        dvd.writeData();
        dvd.spinDisc();
        dvd.readData();


    }
}
