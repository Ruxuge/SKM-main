package pl.edu.pjwstk.client.models.passenger.status;

public class Status {
    private boolean inTrain;
    private boolean inRoad;
    private boolean targetOvercome;

    public Status(boolean inTrain, boolean inRoad, boolean targetOvercome) {
        this.inTrain = inTrain;
        this.inRoad = inRoad;
        this.targetOvercome = targetOvercome;
    }

    public boolean isInTrain() {
        return inTrain;
    }

    public void setInTrain(boolean inTrain) {
        this.inTrain = inTrain;
    }

    public boolean isInRoad() {
        return inRoad;
    }

    public void setInRoad(boolean inRoad) {
        this.inRoad = inRoad;
    }

    public boolean isTargetOvercome() {
        return targetOvercome;
    }

    public void setTargetOvercome(boolean targetOvercome) {
        this.targetOvercome = targetOvercome;
    }
}
