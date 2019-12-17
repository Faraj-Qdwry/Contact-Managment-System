package contactmanagementsoftware.contacts;

import contactmanagementsoftware.strategies.descriptrion_stratigies.RelativesDescriptionBehaviour;

import java.io.Serializable;
import java.util.Scanner;

public class Relatives extends Contact implements Serializable {
    public static int numberRel = 0;
    private static Scanner reader = new Scanner(System.in);
    private String BDate;
    private String LDate;

    public Relatives(RelativesDescriptionBehaviour descriptionBehaviour) {
        super(descriptionBehaviour);
        numberRel++;
    }

    public String getBDate() {
        return BDate;
    }

    public void setBDate(String BDate) {
        this.BDate = BDate;
    }

    public String getLDate() {
        return LDate;
    }

    public void setLDate(String LDate) {
        this.LDate = LDate;
    }
}
