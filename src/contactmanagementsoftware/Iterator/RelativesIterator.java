package contactmanagementsoftware.Iterator;

import contactmanagementsoftware.acquaintances.Acquaintances;
import contactmanagementsoftware.acquaintances.Relatives;
import java.util.ArrayList;

public class RelativesIterator extends AcquaintancesIterator {

    public RelativesIterator(ArrayList<Acquaintances> items) {
        super(items);
    }

    public Relatives next() {
        return (Relatives) super.next();
    }

    public boolean hasNext() {
        return super.hasNext();
    }
}