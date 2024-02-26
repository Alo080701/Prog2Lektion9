package opgave01;

import opgave01.models.IntegerVault;
import opgave01.models.Vault;

public class Opgave01 {
    public static void main(String[] args) {
        Vault<Integer> Vault = new Vault<Integer>(42, "My password");
        Integer secret = Vault.getSecret("My Password");

        Vault<String> anotherVault = new Vault<String>("42","My password");
        String anotherSecret = anotherVault.getSecret("My password");

    }
}
