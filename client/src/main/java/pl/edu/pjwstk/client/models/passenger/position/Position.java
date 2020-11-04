package pl.edu.pjwstk.client.models.passenger.position;

public class Position {
    private int train;
    private int compartment;
    private int platform;
    private int distanceToOvercome;

    public Position(int train, int compartment, int platform, int distanceToOvercome) {
        this.train = train;
        this.compartment = compartment;
        this.platform = platform;
        this.distanceToOvercome = distanceToOvercome;
    }

    public int getTrain() {
        return train;
    }

    public void setTrain(int train) {
        this.train = train;
    }

    public int getCompartment() {
        return compartment;
    }

    public void setCompartment(int compartment) {
        this.compartment = compartment;
    }

    public int getPlatform() {
        return platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public int getDistanceToOvercome() {
        return distanceToOvercome;
    }

    public void setDistanceToOvercome(int distanceToOvercome) {
        this.distanceToOvercome = distanceToOvercome;
    }
}
