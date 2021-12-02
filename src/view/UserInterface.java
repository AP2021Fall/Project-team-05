package view;

import view.Menus.Menu;

public class UserInterface extends Menu {
    boolean welcomed = false;

    public UserInterface(boolean welcomed) {
        welcome();
    }

    public void welcome(){
        if (!welcomed){
            System.out.println("");
            welcomed = true;
        }
    }
    public void createUser(){}
    public void login(){}

    @Override
    public void execute() { }
}
