package contactmanagementsoftware.acquaintances;

import contactmanagementsoftware.strategies.descriptrion_stratigies.RelativesDescriptionBehaviour;

import java.io.Serializable;
import java.util.Scanner;

public class Relatives extends Acquaintances implements Serializable {
    public static int numberRel = 0;
    private static Scanner reader = new Scanner(System.in);
    private String BDate;
    private String LDate;

    public Relatives(RelativesDescriptionBehaviour descriptionBehaviour) {
        super(descriptionBehaviour);
        numberRel++;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String Name) {
        super.setName(Name);
    }

    @Override
    public String getMobileNo() {
        return super.getMobileNo();
    }

    @Override
    public void setMobileNo(String MobileNo) {
        super.setMobileNo(MobileNo);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String Email) {
        super.setEmail(Email);
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
