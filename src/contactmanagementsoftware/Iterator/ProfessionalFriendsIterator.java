package contactmanagementsoftware.Iterator;
import contactmanagementsoftware.acquaintances.Acquaintances;
import contactmanagementsoftware.acquaintances.ProfessionalFriends;
import java.util.ArrayList;

public class ProfessionalFriendsIterator extends AcquaintancesIterator {

	public ProfessionalFriendsIterator(ArrayList<Acquaintances> items) {
		super(items);
	}

	public ProfessionalFriends next() {
		return (ProfessionalFriends) super.next();
	}

	public boolean hasNext() {
		return super.hasNext();
	}
}