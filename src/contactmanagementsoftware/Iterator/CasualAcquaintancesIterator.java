package contactmanagementsoftware.Iterator;

import contactmanagementsoftware.acquaintances.Acquaintances;
import contactmanagementsoftware.acquaintances.CasualAcquaintances;

import java.util.ArrayList;

public class CasualAcquaintancesIterator extends AcquaintancesIterator {

    public CasualAcquaintancesIterator(ArrayList<Acquaintances> items) {
        super(items);
    }

    public CasualAcquaintances next() {
        return (CasualAcquaintances) super.next();
    }

    public boolean hasNext() {
        return super.hasNext();
    }
}
