package classesAndObjects2;

public class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    public void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    public void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}

class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();

        d.playSnare();
        d.snare = false;

        if (d.snare == true) {
            d.playSnare();
        }

        d.playTopHat();
    }
}
