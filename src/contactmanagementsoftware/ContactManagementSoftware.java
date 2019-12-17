package contactmanagementsoftware;

import contactmanagementsoftware.composit.DirectoryComponent;

import java.io.Serializable;

public class ContactManagementSoftware implements Serializable {

    //todo composit + stratigy pattern
    // in each composit we'll have an iterator
    private static DirectoryComponent contactsMainDirectory = new DirectoryComponent();

    public static void main(String[] args) {
        //factory.getMG(params);

        contactsMainDirectory.add(new DirectoryComponent());
        contactsMainDirectory.add(new DirectoryComponent());
        contactsMainDirectory.add(new DirectoryComponent());
        contactsMainDirectory.add(new DirectoryComponent());

        MUI mui = MUI.getInstance();

        mui.setMainDirectory(contactsMainDirectory);

        mui.setVisible(true);
    }
}
