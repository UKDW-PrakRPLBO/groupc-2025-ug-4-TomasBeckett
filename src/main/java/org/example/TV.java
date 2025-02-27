package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public TV(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }

    public void connect(Colokan colokan){
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " +  colokan.getMerk());
    }

    public int getResolution() {
        double bw = colokan.getRealBandwidth();
        int maxresolusi = 0;
        if(bw > 10 && bw < 35){
            maxresolusi = 480;
        }
        else if(bw > 35 && bw < 100){
            maxresolusi = 720;
        }
        else {
            maxresolusi = 1080;
        }
        return Math.min(maxresolusi, this.maxResolusi);
    }
}
