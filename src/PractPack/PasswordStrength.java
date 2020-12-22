package PractPack;

public class PasswordStrength {

    public static void main(String[] args) {

        String[] passwords = {
                "password",
                "password1a",
                "password01",
                "Password01",
                "P@ssword01",
                "abcd",
                "mypassword",
                "00000000",
                "AlphaRomeo4c",
                "fiatlinea2014",
                "F@rd1co",
                "F@rd1coSports",
                "Suzuki@lpha2016",
                "!vwvento2015",
                "!@#$%^&*Aa1",
                "myDream1@$$",
                "HelloWorld@001!"
        };


        System.out.println("Java check password strength example passwords");

        for (String password : passwords)
            System.out.println(password + ": " + calculatePasswordStrength(password));

    }       //end of main method


    /**
     * <h3>calculatePasswordStrength(String password)</h3>
     * <p>This method calculates the strength of the password the returns the number between 1 and 10</p>
     *
     * @param password the string passed to the method
     * @return returns the strength of the password
     */
    private static int calculatePasswordStrength(String password) {

        //total score of password
        int iPasswordScore = 0;

        if (password.length() < 8)
            return 0;
        else if (password.length() >= 10)
            iPasswordScore += 2;
        else
            iPasswordScore += 1;

        //if it contains one digit, add 2 to total score
        if (password.matches("(?=.*[0-9]).*"))
            iPasswordScore += 2;

        //if it contains one lower case letter, add 2 to total score
        if (password.matches("(?=.*[a-z]).*"))
            iPasswordScore += 2;

        //if it contains one upper case letter, add 2 to total score
        if (password.matches("(?=.*[A-Z]).*"))
            iPasswordScore += 2;

        //if it contains one special character, add 2 to total score
        if (password.matches("(?=.*[~!@#$%^&*()_-|?/<>,.:;']).*"))
            iPasswordScore += 2;

        return iPasswordScore;

    }

}
