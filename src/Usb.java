public class Usb {
    private double port;
    private String id;

    public Usb(double port, String id) {
        this.port = port;
        this.id = id;

    }

    @Override
    public String toString() {
        return "Usb{" +
                "port=" + port +
                ", id='" + id + '\'' +
                '}';
    }
}
