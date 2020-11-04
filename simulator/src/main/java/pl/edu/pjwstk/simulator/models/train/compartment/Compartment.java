package pl.edu.pjwstk.simulator.models.train.compartment;


public class Compartment {
    private int compartmentId;
    private int trainId;
    private int passengersInCompartment;
    private int compartmentCapacity;

    public Compartment(int compartmentId, int trainId, int passengersInCompartment, int compartmentCapacity) {
        this.compartmentId = compartmentId;
        this.trainId = trainId;
        this.passengersInCompartment = passengersInCompartment;
        this.compartmentCapacity = compartmentCapacity;
    }

    public int getCompartmentId() {
        return compartmentId;
    }

    public void setCompartmentId(int compartmentId) {
        this.compartmentId = compartmentId;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public int getCompartmentCapacity() {
        return compartmentCapacity;
    }

    public void setCompartmentCapacity(int compartmentCapacity) {
        this.compartmentCapacity = compartmentCapacity;
    }

    public int getPassengersInCompartment() {
        return passengersInCompartment;
    }

    public void setPassengersInCompartment(int passengersInCompartment) {
        this.passengersInCompartment = passengersInCompartment;
    }
}
