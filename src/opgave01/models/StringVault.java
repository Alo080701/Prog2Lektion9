package opgave01.models;

public class StringVault {
    private String secret;
    private String password;

    public StringVault(String secret, String password) {
        this.secret = secret;
        this.password = password;
    }


    public String getStreng(String password) {
        if (password.equals(password)) {
            return secret;
        }
        else {
            throw new IllegalArgumentException("Wrong password");
        }
    }

}