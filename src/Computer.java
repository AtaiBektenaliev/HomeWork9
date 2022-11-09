public class Computer {
    private String marka;
    private String color;
    private Display display;
    private Ssd ssd;
    private Ram ram;
    private Usb usb;
    private Keyboard keyboard;


    public Computer(String marka, String color, Display display, Ssd ssd, Ram ram, Usb usb, Keyboard keyboard) {
        this.marka = marka;
        this.color = color;
        this.display = display;
        this.ssd = ssd;
        this.ram = ram;
        this.usb = usb;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer" +
                "\n marka = '" + marka + '\'' +
                ",\n color = '" + color + '\'' +
                ",\n display = " + display +
                ",\n ssd = " + ssd +
                ",\n ram = " + ram +
                ",\n usb = " + usb +
                ",\n keyboard = " + keyboard ;
    }
}
