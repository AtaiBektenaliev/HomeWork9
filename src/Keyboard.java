public class Keyboard {
    private boolean suspension;
    private boolean rightSideNum;

    public Keyboard(boolean suspension, boolean rightSideNum) {
        this.suspension = suspension;
        this.rightSideNum = rightSideNum;

    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "suspension=" + suspension +
                ", rightSideNum=" + rightSideNum +
                '}';
    }
}
