package array_project;

import java.util.HashMap;
import java.util.Map;

public class Arrayproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Mrinal Mishra";

		Map<Character, Integer> hm = new HashMap<>();

		for (char c : str.toCharArray()) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> e : hm.entrySet()) {

			if (e.getValue() == 2) {
				System.out.println(e);
			}

		}

	}

}