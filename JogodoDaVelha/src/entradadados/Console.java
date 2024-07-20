package entradadados;

import java.util.Scanner;

public class Console {
    private Scanner sc;

    public Console() {
        sc = new Scanner(System.in);
    }

    public String ReceberEntrada() {
        return sc.nextLine();
    }
}