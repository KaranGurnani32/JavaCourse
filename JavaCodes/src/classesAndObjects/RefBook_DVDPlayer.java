package classesAndObjects;

public class RefBook_DVDPlayer {
    boolean canRecord = false;

    void playDVD() {
        System.out.println("DVD playing");
    }
    void recordDVD() {
        System.out.println("DVD recording");
    }
}
class DVDPlayerTestDrive {
    public static void main(String [] args) {
        RefBook_DVDPlayer d = new RefBook_DVDPlayer();
        d.canRecord = true;
        d.playDVD();
        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}
