package oop.project;

import javax.swing.*;
import java.io.*;
import java.nio.file.*;

import oop.project.*;

class LoginModel {

    private static final String FILE_PATH = "users.dat";

    //FOR TESTING PURPOSES.
    public LoginModel(){
        System.out.println("Object created.");
    }

    //BRENT KUMINT
    //literal. kung empty, 'false' ang boolean value.
    boolean isValidInput(String emailAddress, String password) {
        return !emailAddress.isEmpty() && !emailAddress.contains(" ") && !password.isEmpty() && !password.contains(" ");
    }

    //BRENT KUMINT
    //dapat walay duplicate, or else magkaboang ang system [worst case scenario]
    boolean accountExisting(String emailAddress, String password){

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");

                if (parts[1].equals(emailAddress) && parts[2].equals(password)) {
                    br.close();
                    return true;
                }
            }
            
            br.close();
            return false;
        }

        catch (IOException e) {
            showError();
        }
        
        return false;
    }

    //BRENT KUMINT
    //show error kung dili mugana. via window ang pag-show para di nalang ma-tagam ang developer sa pag-specify [like the user would care (except kung si sir loki ang user ah ANG OA NALANG ANG OA ANG OA ANG OA ANG OA SIR MAY OA DITO)].
    private void showError(){
        JOptionPane.showMessageDialog(Components.mainFrame, "An error has occured.");
    }
}
