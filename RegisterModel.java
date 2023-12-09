package oop.project;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.*;

class RegisterModel {

  private static final String FILE_PATH = "users.dat";
  private JTextArea outputTextArea;

  public RegisterModel(JTextArea outputTextArea) {
    this.outputTextArea = outputTextArea;
  }

  public boolean registerUser(String fullName, String emailAddress, String password) {
    if (isValidInput(fullName, emailAddress, password)) {
      appendUserDataToTextArea("Registered User:");
      appendUserDataToTextArea("Full Name: " + fullName);
      appendUserDataToTextArea("Email Address: " + emailAddress);

      // Save the user data to a file
      saveUserDataToFile(fullName, emailAddress, password);

      return true;
    } else {
      return false;
    }
  }

  // Update isValidInput method
  private boolean isValidInput(String fullName, String emailAddress, String password) {
    return !fullName.isEmpty() && !emailAddress.isEmpty() && !password.isEmpty();
  }

  // Update appendUserDataToTextArea method
  private void appendUserDataToTextArea(String text) {
    outputTextArea.append(text + "\n");
  }

  // Update saveUserDataToFile method
  private void saveUserDataToFile(String fullName, String emailAddress, String password) {
    try {
        Path filePath = Paths.get(FILE_PATH);

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        String userData = "Full Name: " + fullName + "\n" +
                "Email Address: " + emailAddress + "\n" +
                "Password: " + password + "\n\n";

        // Append the user data to the file
        Files.write(filePath, userData.getBytes(), StandardOpenOption.APPEND);
    } catch (IOException e) {
        e.printStackTrace();
        
    }
}

}
