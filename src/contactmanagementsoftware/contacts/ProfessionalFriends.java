package contactmanagementsoftware.contacts;

import contactmanagementsoftware.strategies.descriptrion_stratigies.ProfessionalFriendsDescriptionBehaviour;

import java.io.Serializable;
import java.util.Scanner;

public class ProfessionalFriends extends Contact implements Serializable {

    public static int numberProF = 0;
    private String CommonInterests;

    public ProfessionalFriends(ProfessionalFriendsDescriptionBehaviour descriptionBehaviour) {
        super(descriptionBehaviour);
        numberProF++;
    }

    public String getCommonInterests() {
        return CommonInterests;
    }

    public void setCommonInterests(String CommonInterests) {
        Scanner reader = new Scanner(System.in);
        if (!CommonInterests.isEmpty())
            this.CommonInterests = CommonInterests;
        else {
            System.out.println("Enter at least one character");
            setCommonInterests(reader.nextLine());
        }
    }
}
