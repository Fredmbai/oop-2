
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RealEstateManagementApp extends JFrame {
    private ArrayList<MaintenanceRecord> maintenanceRecords = new ArrayList<>();
    private JTextArea maintenanceTextArea;

    public RealEstateManagementApp() {
        super("Real Estate Management Application");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JButton viewRecordsButton = new JButton("View All Maintenance Records");
        viewRecordsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayAllMaintenanceRecords();
            }
        });
        mainPanel.add(viewRecordsButton, BorderLayout.NORTH);

        maintenanceTextArea = new JTextArea();
        mainPanel.add(new JScrollPane(maintenanceTextArea), BorderLayout.CENTER);

        getContentPane().add(mainPanel);
    }

    public void addMaintenanceRecord(MaintenanceRecord record) {
        maintenanceRecords.add(record);
    }

    private void displayAllMaintenanceRecords() {
        StringBuilder records = new StringBuilder();
        if (maintenanceRecords.isEmpty()) {
            records.append("No maintenance records found.");
        } else {
            for (MaintenanceRecord record : maintenanceRecords) {
                records.append(record.toString()).append("\n-------------------------------\n");
            }
        }
        maintenanceTextArea.setText(records.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                RealEstateManagementApp app = new RealEstateManagementApp();
                app.setVisible(true);

                // Add some sample maintenance records for testing
                app.addMaintenanceRecord(new MaintenanceRecord("123 Main St", "Plumbing", "Fixed leaking faucet", "2024-04-01"));
                app.addMaintenanceRecord(new MaintenanceRecord("456 Elm St", "Electrical", "Replaced light fixtures", "2024-04-02"));
            }
        });
    }
}
