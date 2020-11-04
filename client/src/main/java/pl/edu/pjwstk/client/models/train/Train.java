package pl.edu.pjwstk.client.models.train;

public class Train {
    private int trainId;
    private int position;
    private int numberOfCompartments;

    public Train(){}

    public Train(int trainId, int position, int numberOfCompartments) {
        this.trainId = trainId;
        this.position = position;
        this.numberOfCompartments = numberOfCompartments;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getNumberOfCompartments() {
        return numberOfCompartments;
    }

    public void setNumberOfCompartments(int numberOfCompartments) {
        this.numberOfCompartments = numberOfCompartments;
    }
}
