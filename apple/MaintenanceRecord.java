import javax.swing.*;

class MaintenanceRecord {
    private String houseAddress;
    private String maintenanceType;
    private String description;
    private String date;

    public MaintenanceRecord(String houseAddress, String maintenanceType, String description, String date) {
        this.houseAddress = houseAddress;
        this.maintenanceType = maintenanceType;
        this.description = description;
        this.date = date;
    }

    @Override
    public String toString() {
        return "House Address: " + houseAddress + "\nMaintenance Type: " + maintenanceType +
                "\nDescription: " + description + "\nDate: " + date;
    }
}
