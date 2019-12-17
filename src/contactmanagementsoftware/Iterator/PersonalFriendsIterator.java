package contactmanagementsoftware.Iterator;

import contactmanagementsoftware.acquaintances.PersonalFriends;
import contactmanagementsoftware.strategies.descriptrion_stratigies.PersonalFriendsDescriptionBehaviour;

import java.util.Scanner;
import java.io.Serializable;
import java.util.Iterator;
import java.util.ArrayList;

public class PersonalFriendsIterator implements Iterator{
	ArrayList<PersonalFriends> items;
	int position = 0;
 
	public PersonalFriendsIterator(ArrayList<PersonalFriends> items) {
		this.items = items;
	}
 
	public PersonalFriends next() {
		PersonalFriends item = items.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}
