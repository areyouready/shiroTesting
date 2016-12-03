package de.are_you_ready;

import org.apache.shiro.authc.credential.PasswordMatcher;

import java.io.Console;

/**
 * Created by sebastianbasner on 13.11.16.
 */
class shiroGen {

    public static void main (String[] args) {
        Console console = System.console();
        final char[] password = console.readPassword("Please insert new password: ");

        PasswordMatcher auth = new PasswordMatcher();
        final String encryptedPW = auth.getPasswordService().encryptPassword(password);
        System.out.println("PW: " + encryptedPW);
    }
}
