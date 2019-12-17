package contactmanagementsoftware;

import contactmanagementsoftware.composit.DirectoryComponent;

import java.io.Serializable;

public class ContactManagementSoftware implements Serializable {

    private static DirectoryComponent contactsMainDirectory = new DirectoryComponent();

    public static void main(String[] args) {
        contactsMainDirectory.add(new DirectoryComponent());
        contactsMainDirectory.add(new DirectoryComponent());
        contactsMainDirectory.add(new DirectoryComponent());
        contactsMainDirectory.add(new DirectoryComponent());

        MUI mui = MUI.getInstance();

        mui.setMainDirectory(contactsMainDirectory);

        mui.setVisible(true);
    }
}
