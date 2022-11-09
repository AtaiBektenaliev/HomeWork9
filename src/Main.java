public class Main {
    public static void main(String[] args) {

        Display display = new Display(58.4, "AOC", 16.9);
        Ssd ssd = new Ssd(500, 2);
        Ram ram = new Ram(8, "HIKVISION");
        Usb usb = new Usb(2.0, "Type A");
        Keyboard keyboard = new Keyboard(false, true);
        Computer computer = new Computer("Alta", "black", display, ssd, ram, usb, keyboard);

        System.out.println(computer);
    }
}
