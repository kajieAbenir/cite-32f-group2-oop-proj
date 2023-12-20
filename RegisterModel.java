package oop.project;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class RegisterModel {

    private static final String FILE_PATH = "users.dat";


    //literal. kung empty, 'false' ang boolean value.
    private boolean isValidInput(String fullName, String emailAddress, String password) {
        return !fullName.isEmpty() && !emailAddress.isEmpty() && !password.isEmpty();
    }

    //dapat walay duplicate, or else magkaboang ang system [worst case scenario]
    private boolean noDuplicateCheck(String fullName, String emailAddress, String password){
        String userData = fullName + "\t" + emailAddress + "\t" + password + "\n";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(delimiter);

                if (parts[0].equals(data) && parts[1].equals(data) && parts[2].equals(data)) {
                    return false;
                }
            }
            return true;

        } catch (IOException e) {
            showError();
        }
    }

    //if all test above has passed, i-save na dayon niya sa file.
    private void saveUserDataToFile(String fullName, String emailAddress, String password) {
        int saved = 0;

        try {
            String userData = fullName + "\t" + emailAddress + "\t" + password + "\n";

            FileWriter fileWriter = new FileWriter(FILE_PATH);
            fileWriter.write(userData);
            fileWriter.close();
            saved = 1;

        } catch (IOException e) {
            showError();
        }

        //checks saved integer, kung na-save, oke na.
        if(saved == 1){
            JOptionPane.showMessageDialog(Components.mainFrame, "REGISTERED SUCCESSFULLY");
        } else {
            JOptionPane.showMessageDialog(Components.mainFrame, "Registration Failed! Please check your input.");
        }
    }

    //show error kung dili mugana. via window ang pag-show para di nalang ma-tagam ang developer sa pag-specify [like the user would care (except kung si sir loki ang user ah ANG OA NALANG)].
    private void showError(){
        JOptionPane.showMessageDialog(Components.mainFrame, "An error has occured.");
    }
}
