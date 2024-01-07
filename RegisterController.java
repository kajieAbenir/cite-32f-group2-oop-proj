package oop.project.*;

import oop.project.*;

public class RegisterController {

    RegisterModel registerModel = new RegisterModel();

	// testing purposes.
	public RegisterController(){
		System.out.println("Object created.");
	}

	//pass information to registerModel for checking, then saving.
	//return true IF AND ONLY IF makalusot sa tanang methods. that's how strict this controller method is.

    public boolean registerCheckThenSave(String fullNameString, String emailString, String passwordString) {
        
        //executes checking methods: isValidInput, and noDuplicateCheck. kung oke, then i-register sa saveUserDataToFile.

        //BRENT KUMINT
        //pretty long and a little bit unethical for me, pero i.g. it's the only option ra gyud.

        
        
        if(registerModel.isValidInput(fullNameString, emailString, passwordString) && registerModel.noDuplicateCheck(fullNameString, emailString, passwordString)) {

            registerModel.saveUserDataToFile(fullNameString, emailString, passwordString);
            return true;
        }

        /*
        	summary:

        	returns true kung success na ang operation, false if don't.
        	if you ask what operation, READ THE COMMENTS ABOVE. DON'T BE AN ASSHOLE. READ! READ! READ! PLEASE.
        */

        return false;
    }

    // Sarraga joke: the method above is supposed to be called 'theMethodThatChecksInputForDuplicatesAndValiditySoThatItCanBeRegisteredToTheDatabaseFileNamedUserDotDat'

    // mura man ug mu-backfire nis developer.
}