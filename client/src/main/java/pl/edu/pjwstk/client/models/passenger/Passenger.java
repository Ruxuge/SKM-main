package pl.edu.pjwstk.client.models.passenger;

public class Passenger {
    private String name;
    private String surname;
    private boolean alive;
    private boolean direction;

    public Passenger(String name, String surname, boolean alive, boolean direction) {
        this.name = name;
        this.surname = surname;
        this.alive = alive;
        this.direction = direction;
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

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }
}
