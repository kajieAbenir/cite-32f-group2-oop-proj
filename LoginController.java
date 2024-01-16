package oop.project;

import oop.project.*;

public class LoginController {
    
    // BRENT KUMINT
    // SIGE TAG HIMO ANI TANAN NIYA WA DIAY TAY MAIN ;-;
    public LoginController(){
        new LoginView();
    }

	LoginModel loginModel = new LoginModel();

	//pass information to loginModel to check.

    //returns boolean para if-else statement nalang sa LoginView
    //like if e.get source == some component, tas laing if-else statement para aning method, ana pa mabalhin chuchu basta.
    
    public boolean checkIfValidAndExisting(String emailString, String passwordString){
        if(loginModel.isValidInput(emailString, passwordString) && loginModel.accountExisting(emailString, passwordString)) {
            return true;
        }

        return false;
    }
}