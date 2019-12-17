package contactmanagementsoftware.composit;

import contactmanagementsoftware.strategies.descriptrion_stratigies.ContactDescriptionBehaviour;

public abstract class ContactManagementComponent {

    public static int number = 0;
    protected String Name;
    protected String MobileNo;
    protected String Email;

    public void add(ContactManagementComponent child) {
        throw new UnsupportedOperationException();
    }

    public ContactManagementComponent get(int index) {
        throw new UnsupportedOperationException();
    }

    public void remove(int index) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public void setName(String name) {
        throw new UnsupportedOperationException();
    }

    public String getMobileNo() {
        throw new UnsupportedOperationException();
    }

    public void setMobileNo(String MobileNo) {
        throw new UnsupportedOperationException();
    }

    public String getEmail() {
        throw new UnsupportedOperationException();
    }

    public void setEmail(String Email) {
        throw new UnsupportedOperationException();
    }

    public boolean MobileNoChecker(String mobileNo) {
        throw new UnsupportedOperationException();
    }

    public ContactDescriptionBehaviour getDescriptionBehaviour() {
        throw new UnsupportedOperationException();
    }
}
