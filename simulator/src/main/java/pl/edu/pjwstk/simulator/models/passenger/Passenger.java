package pl.edu.pjwstk.simulator.models.passenger;

public class Passenger {
    // Passengers Body
    private int passengerId;
    private String name;
    private String surname;

    private int destination;


    private boolean inTrain;

    private int passengerPosition;

    private int passengersTrain;
    private int passengersCompartment;

    public Passenger(int passengerId, String name, String surname, int destination, boolean inTrain, int passengerPosition, int passengersTrain, int passengersCompartment) {
        this.passengerId = passengerId;
        this.name = name;
        this.surname = surname;
        this.destination = destination;
        this.inTrain = inTrain;
        this.passengerPosition = passengerPosition;
        this.passengersTrain = passengersTrain;
        this.passengersCompartment = passengersCompartment;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public boolean isInTrain() {
        return inTrain;
    }

    public void setInTrain(boolean inTrain) {
        this.inTrain = inTrain;
    }

    public int getPassengerPosition() {
        return passengerPosition;
    }

    public void setPassengerPosition(int passengerPosition) {
        this.passengerPosition = passengerPosition;
    }

    public int getPassengersTrain() {
        return passengersTrain;
    }

    public void setPassengersTrain(int passengersTrain) {
        this.passengersTrain = passengersTrain;
    }

    public int getPassengersCompartment() {
        return passengersCompartment;
    }

    public void setPassengersCompartment(int passengersCompartment) {
        this.passengersCompartment = passengersCompartment;
    }
}
