package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth() {
        double rasio = (double) getHarga() / 50000;
        if (rasio < 1) {
            return rasio * getPromisedBandwidth();
        }
        return getPromisedBandwidth();
    }
}
