package classesAndObjects;

public class Distance {

    int inch;
    int feet;

    Distance(int inch, int feet) {
        this.inch = inch;
        this.feet = feet;
    }

    Distance addDistance(Distance distance) {
        int inchSum = this.inch + distance.inch;
        int feetSum = this.feet + distance.feet;

        int extraFeet = inchSum / 12;
        int remainderInch = inchSum % 12;

        Distance result = new Distance(remainderInch, feetSum + extraFeet);

        return result;
    }


    Distance subtractDistance(Distance distance) {
        int inchSum = this.inch + distance.inch;
        int feetSum = this.feet + distance.feet;

        int extraFeet = inchSum / 12;
        int remainderInch = inchSum % 12;

        Distance result = new Distance(remainderInch, feetSum + extraFeet);

        return result;
    }


}
