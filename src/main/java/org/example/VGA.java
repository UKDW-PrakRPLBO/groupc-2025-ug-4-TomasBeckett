package org.example;

public class VGA extends Colokan{
    public VGA(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth() {
        double rasio = (double) getHarga() / 30000;
        if (rasio < 1) {
            return rasio * getPromisedBandwidth();
        }
        return getPromisedBandwidth();
    }
}
