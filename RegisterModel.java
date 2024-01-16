package oop.project;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import oop.project.*;

class RegisterModel {

    private static final String FILE_PATH = "users.dat";

    //FOR TESTING PURPOSES.
    public RegisterModel(){
        System.out.println("Object created.");
    }

    //BRENT KUMINT
    //literal. kung empty, 'false' ang boolean value.
    boolean isValidInput(String fullName, String emailAddress, String password) {
        return !fullName.isEmpty() && !emailAddress.isEmpty() && !emailAddress.contains(" ") && !password.isEmpty() && !password.contains(" ");
    }

    //BRENT KUMINT
    //dapat walay duplicate, or else magkaboang ang system [worst case scenario]
    boolean noDuplicateCheck(String fullName, String emailAddress, String password){

        try {
            String[] parts = databaseReader();
            while(!databaseReader().equals(null)){
                if (parts[0].equals(fullName) && parts[1].equals(emailAddress) && parts[2].equals(password)) {
                    return false;
                }
            }

            return true;
        } catch(IOError e){
            e.printStackTrace();
            showError();
        }

        return true;
    }

    private String[] databaseReader(){
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                return parts;
            }
        } catch (IOException e) {
            showError();
        }

        return null;
    }

    //BRENT KUMINT
    //if all test above has passed, i-save na dayon niya sa file.
    void saveUserDataToFile(String fullName, String emailAddress, String password) {
        boolean saved = false;
        int ID = getIDNum(emailAddress,password);

        try {
            String userData = fullName + "\t" + emailAddress + "\t" + password + "\n";

            FileWriter fileWriter = new FileWriter(FILE_PATH);
            fileWriter.write(userData);
            fileWriter.close();
            saved = true;

        } catch (IOException e) {
            showError();
        }

        //BRENT KUMINT
        //checks saved boolean, kung na-save, oke na.
        if(saved){
            JOptionPane.showMessageDialog(Components.mainFrame, "REGISTERED SUCCESSFULLY");
        } else {
            JOptionPane.showMessageDialog(Components.mainFrame, "An error has occured.");
        }
    }

    private int getIDNum(String emailAddress, String password){
        try {
            String[] parts = databaseReader();
            while(!databaseReader().equals(null)){
                if (parts[1].equals(emailAddress) && parts[2].equals(password)) {
                    int ID = Integer.valueOf(parts[4]);
                    return ID + 1;
                }
            }
        } catch(IOError e){
            e.printStackTrace();
            showError();
        }

        return -1;
    }

    //BRENT KUMINT
    //show error kung dili mugana. via window ang pag-show para di nalang ma-tagam ang developer sa pag-specify [like the user would care (except kung si sir ang user ah ANG OA NALANG ANG OA ANG OA ANG OA ANG OA MAY OA DITO)].
    
    private void showError(){
        JOptionPane.showMessageDialog(Components.mainFrame, "An error has occured.");
    }
}
