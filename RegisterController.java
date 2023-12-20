package oop.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import oop.project.*;

class RegisterController implements ActionListener {

    RegisterModel registerModel = new RegisterModel();

    //pass infomration to registerModel for checking, then saving.
    public RegisterController(String fullNameString, String emailString, String passwordString) {
        
        if(registerModel.isValidInput(String fullNameString, String emailString, String passwordString) && registerModel.noDuplicateCheck(String fullNameString, String emailString, String passwordString)){
            registerModel.saveUserDataToFile(String fullNameString, String emailString, String passwordString);
        }
    }
}
