public class Ram {
    private int volume;
    private String manufacturer;

    public Ram(int volume, String manufacturer) {
        this.volume = volume;
        this.manufacturer = manufacturer;

    }

    @Override
    public String toString() {
        return "Ram{" +
                "volume=" + volume +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
