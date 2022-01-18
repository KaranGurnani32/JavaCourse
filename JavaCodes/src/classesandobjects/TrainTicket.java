package classesandobjects;

public class TrainTicket {

    private String passengerName;
    private String departureStation;
    private String arrivalStation;
    private String trainName;
    private int passengerCount;
    private int Cost;

    private static int totalTicket;

    public TrainTicket() {
        totalTicket++;
    }

    public void bookTicket(String passengerName, String departureStation, String arrivalStation, String trainName, int passengerCount, int cost) {
        this.passengerName = passengerName;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.trainName = trainName;
        this.passengerCount = passengerCount;
        this.Cost = cost;
    }

    private static void showTotalTicket() {
        System.out.println("Total tickets booked : " + totalTicket);
    }

    public void showTicket(){
        System.out.println("Passenger Name :" + this.passengerName );
        System.out.println("Departure station :" + this.departureStation);
        System.out.println("Arrival Station :" + this.arrivalStation);
        System.out.println("Train Name" + this.trainName);
        System.out.println("Passenger Count" + this.passengerCount);
        System.out.println("Cost" + this.Cost);
    }
}
