package contactmanagementsoftware.composit;

import java.util.ArrayList;

public class DirectoryComponent extends ContactManagementComponent {

    protected ArrayList<ContactManagementComponent> subComponents = new ArrayList<>();

    @Override
    public void add(ContactManagementComponent child) {
        subComponents.add(child);
    }

    @Override
    public ContactManagementComponent get(int index) {
        return subComponents.get(index);
    }

    @Override
    public void remove(int index) {
        subComponents.remove(index);
    }

    @Override
    public int size() {
        return subComponents.size();
    }
}
