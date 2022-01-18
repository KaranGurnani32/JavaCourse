package classesandobjects;

public class RefBook_TapeDeck {
    boolean canRecord = false;

    void playTape() {
        System.out.println("tape playing");
    }

    void recordTape() {
        System.out.println("tape recording");
    }
}
class TapeDeckTestDrive {
    public static void main(String [] args) {

        RefBook_TapeDeck t = new RefBook_TapeDeck();

        t.canRecord = true;

        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
