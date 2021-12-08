package classesAndObjects;

public class TrainTicketRunner {
    public static void main(String[] args) {
      TrainTicket ticket = new TrainTicket();
      ticket.bookTicket("Karan", "Ayodhya", "Delhi", "Shatabdi", 50, 20);
      ticket.showTicket();
    }
}
