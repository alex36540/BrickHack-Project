package com.company;
import java.util.ArrayList;
public class Login_Database {
    public ArrayList<String> userUsernames;
    public ArrayList<String> userPasswords;
    public ArrayList<String> managerUsernames;
    public ArrayList<String> managerPasswords;

    public Login_Database()
    {
        userUsernames = new ArrayList<>();
        userPasswords = new ArrayList<>();
        managerUsernames = new ArrayList<>();
        managerPasswords = new ArrayList<>();
    }

    // check for login validity
    public boolean userLoginCheck(String name, String password)
    {
        System.out.println(userUsernames.get(0));
        System.out.println(userPasswords.get(0));
        int nameLoc = -1;
        for(int i=0; i<userUsernames.size(); i++)
        {
            if(userUsernames.get(i).equals(name))
            {
                nameLoc = i;
                break;
            }
        }
        if(nameLoc != -1)
        {
            String truepassword = userPasswords.get(nameLoc);
            return truepassword.equals(password);
        }
        return false;
    }

    public boolean managerLoginCheck(String name, String password)
    {
        int nameLoc = -1;
        for(int i=0; i<managerUsernames.size(); i++)
        {
            if(managerUsernames.get(i).equals(name))
            {
                nameLoc = i;
                break;
            }
        }
        if(nameLoc != -1)
        {
            String truepassword = managerPasswords.get(nameLoc);
            return truepassword.equals(password);
        }
        return false;
    }

    public void updateUserLogins(String username, String password)
    {
        userUsernames.add(username);
        userPasswords.add(password);
    }
    public void updateManagerLogins(String username, String password)
    {
        managerUsernames.add(username);
        managerPasswords.add(password);
    }
}
