package contactmanagementsoftware.composit;

import java.util.Scanner;

public class ContactComponent extends ContactManagementComponent {

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
