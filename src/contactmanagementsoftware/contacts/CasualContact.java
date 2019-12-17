package contactmanagementsoftware.contacts;

import contactmanagementsoftware.strategies.descriptrion_stratigies.CasualContactDescriptionBehaviour;

import java.io.Serializable;
import java.util.Scanner;

public class CasualContact extends Contact implements Serializable {
    public static int numberCA = 0;
    private String WhenWhere;
    private String Circumstances;
    private String OtherInfo;

    public CasualContact(CasualContactDescriptionBehaviour descriptionBehaviour) {
        super(descriptionBehaviour);
        numberCA++;
    }

    public String getWhenWhere() {
        return WhenWhere;
    }

    public void setWhenWhere(String WhenWhere) {
        Scanner reader = new Scanner(System.in);
        if (!WhenWhere.isEmpty())
            this.WhenWhere = WhenWhere;
        else {
            System.out.println("Enter at least one character");
            setWhenWhere(reader.nextLine());
        }
    }

    public String getCircumstances() {
        return Circumstances;
    }

    public void setCircumstances(String Circumstances) {
        Scanner reader = new Scanner(System.in);
        if (!Circumstances.isEmpty())
            this.Circumstances = Circumstances;
        else {
            System.out.println("Enter at least one character");
            setCircumstances(reader.nextLine());
        }
    }

    public String getOtherInfo() {
        return OtherInfo;
    }

    public void setOtherInfo(String OtherInfo) {
        Scanner reader = new Scanner(System.in);
        if (!OtherInfo.isEmpty())
            this.OtherInfo = OtherInfo;
        else {
            System.out.println("Enter at least one character");
            setOtherInfo(reader.nextLine());
        }
    }
}
