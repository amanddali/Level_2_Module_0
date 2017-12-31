package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> pets = new ArrayList();
		// 2. Add five Strings to your list
		pets.add("dog");
		pets.add("cat");
		pets.add("fish");
		pets.add("bird");
		pets.add("hamster");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < pets.size(); i++) {
			System.out.println(pets.get(i));
		}
		// 4. Print all the Strings using a for-each loop
		for (String string : pets) {
			System.out.println(string);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < pets.size(); i += 2) {
			System.out.println(pets.get(i));
		}
		// 6. Print all the Strings in reverse order.
		for (int i = pets.size() - 1; i >= 0; i--) {
			System.out.println(pets.get(i));
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (String string : pets) {
			if (string.contains("e")) {
				System.out.println(string);
			}
		}
	}
}
