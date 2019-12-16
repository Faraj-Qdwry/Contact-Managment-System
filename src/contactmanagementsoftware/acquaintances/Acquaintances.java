package contactmanagementsoftware.acquaintances;

import contactmanagementsoftware.strategies.descriptrion_stratigies.AcquaintancesDescriptionBehaviour;

import java.io.Serializable;
import java.util.Scanner;

public class Acquaintances implements Serializable {
    public static int number = 0;
    private String Name;
    private String MobileNo;
    private String Email;
    private AcquaintancesDescriptionBehaviour descriptionBehaviour;

    Acquaintances(AcquaintancesDescriptionBehaviour descriptionBehaviour) {
        this.descriptionBehaviour = descriptionBehaviour;
        number++;
    }

    public AcquaintancesDescriptionBehaviour getDescriptionBehaviour() {
        return descriptionBehaviour;
    }

    public boolean MobileNoChecker(String str) {
        int x;
        for (int j = 0; j < str.length(); j++) {
            x = (int) str.charAt(j);
            if (x < 48 || x > 57)
                return false;
        }
        return true;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Scanner reader = new Scanner(System.in);
        if (!name.isEmpty())
            this.Name = name;
        else {
            System.out.println("Enter at least one character");
            setName(reader.nextLine());
        }
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String MobileNo) {
        Scanner reader = new Scanner(System.in);
        if (MobileNoChecker(MobileNo) && MobileNo.length() >= 6 && MobileNo.length() <= 15)
            this.MobileNo = MobileNo;
        else {
            System.out.print("Enter a valid Mobile No of length between 6 and 15 (inclusive): ");
            setMobileNo(reader.next());
        }
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        Scanner reader = new Scanner(System.in);
        if (Email.contains("@"))
            this.Email = Email;
        else {
            System.out.print("Enter a valid Email: ");
            this.setEmail(reader.next());
        }
    }
}
