package pl.edu.pjwstk.simulator;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mconf")
public class MainConfiguration {

    private int numberOfTrains;
    private int numberOfCompartments;
    private int compartmentCapacity;

    public int getNumberOfTrains() {
        return numberOfTrains;
    }

    public void setNumberOfTrains(int numberOfTrains) {
        this.numberOfTrains = numberOfTrains;
    }

    public int getNumberOfCompartments() {
        return numberOfCompartments;
    }

    public void setNumberOfCompartments(int numberOfCompartments) {
        this.numberOfCompartments = numberOfCompartments;
    }

    public int getCompartmentCapacity() {
        return compartmentCapacity;
    }

    public void setCompartmentCapacity(int compartmentCapacity) {
        this.compartmentCapacity = compartmentCapacity;
    }
}
