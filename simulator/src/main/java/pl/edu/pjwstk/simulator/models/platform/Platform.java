package pl.edu.pjwstk.simulator.models.platform;

public class Platform {
    private int platformId;
    private String platformName;

    public Platform(int platformId, String platformName ) {
        this.platformId = platformId;
        this.platformName = platformName;
    }

    public int getPlatformId() {
        return platformId;
    }

    public void setPlatformId(int platformId) {
        this.platformId = platformId;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

}
