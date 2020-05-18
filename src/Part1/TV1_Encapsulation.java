package Part1;


class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no Args- constructer");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public int getChannel() {
        return channel;
    }

    public String getBrand() {
        return brand;
    }

    public void setVolumeLevel(int vol) {
        if (vol <= 7 && vol >= 1 && on) {
            volumeLevel = vol;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void setChannel(int ch) {
        if (ch <= 120 && on) {
            channel = ch;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel.");
        }
    }

    public void setBrand(String br) {
        brand = br;
    }

    public void volumeUp() {
        setVolumeLevel(volumeLevel + 1);
    }

    public void volumeDown() {
        setVolumeLevel(volumeLevel - 1);
    }

    public void channelUp() {
        setChannel(channel + 1);
    }

    public void channelDown() {
        setChannel(channel - 1);
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }
}

public class TV1_Encapsulation {

}
