package Domain;

public class Bottle extends Product {
    private float volume;

    public Bottle(double price, int place, String name, float volume) {
        super(price, place, name);
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public String toString(){
        return super.toString() + "volume" + volume;
    }
}
