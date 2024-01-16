import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardPractice {

    private JFrame mainFrame;
    private JPanel bastaPanel;
    private JPanel morePanel;

    DashboardPractice() {
        initializeDashboard();
    }

    private void initializeDashboard() {
        mainFrame = new JFrame();
        mainFrame.setSize(1200, 800);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bastaPanel = new JPanel();
        Components.addPanel(mainFrame, bastaPanel, 0, 0, 1200, 800, "#F3F3F3");
        bastaPanel.setLayout(null);

        // Load the image
        ImageIcon imageIcon = new ImageIcon("bastalang.png");

        // Adjust the size of the image
        int newWidth = 120; // Set your desired width
        int newHeight = 98; // Set your desired height
        Image image = imageIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
        ImageIcon resizedImageIcon = new ImageIcon(image);

        JLabel imageLabel = new JLabel(resizedImageIcon);
        imageLabel.setBounds(20, 120, newWidth, newHeight);
        Components.addLabel(bastaPanel, imageLabel, 13, 7, newWidth, newHeight);

        JLabel line = new JLabel("___________________________________________________________________________________________________________________________________________________________________");
        Components.addLabel(bastaPanel, line, 20, 90, 1200, 30);

        JLabel cite = new JLabel("CITE CLINIC INC.");
        Components.addLabel(bastaPanel, cite, 150, 0, 1000, 100);
        cite.setFont(new Font("Arial", Font.BOLD, 80));

        JButton moreButton = new JButton("MORE");
        Components.addButton(bastaPanel, moreButton, 1000, 40, 70, 30);
        moreButton.setFocusable(false);
        moreButton.addActionListener(new MoreButtonListener());

        mainFrame.setLocationRelativeTo(null);

        mainFrame.setVisible(true);
    }

    private void toggleMorePanelVisibility() {
        if (morePanel == null) {
            morePanel = new JPanel();
            morePanel.setLayout(new BoxLayout(morePanel, BoxLayout.Y_AXIS));

            JButton homeButton = new JButton("HOME");
            homeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            Components.addButton(morePanel, homeButton, 0, 0, 100, 30);
            homeButton.setFocusable(false);

            JButton medicalRecordButton = new JButton("MEDICAL RECORDS");
            medicalRecordButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            Components.addButton(morePanel, medicalRecordButton, 0, 0, 140, 30);
            medicalRecordButton.setFocusable(false);

            JButton listOfMedicineButton = new JButton("LIST OF MEDICINE");
            listOfMedicineButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            Components.addButton(morePanel, listOfMedicineButton, 0, 0, 140, 30);
            listOfMedicineButton.setFocusable(false);

            bastaPanel.add(morePanel);
        }

        morePanel.setVisible(!morePanel.isVisible());
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    private class MoreButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            toggleMorePanelVisibility();
        }
    }

}
