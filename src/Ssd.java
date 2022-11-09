public class Ssd {
    private int memory;
    private int disk;

    public Ssd(int memory, int disk) {
        this.memory = memory;
        this.disk = disk;

    }

    @Override
    public String toString() {
        return "Ssd{" +
                "memory=" + memory +
                ", disk=" + disk +
                '}';
    }
}
