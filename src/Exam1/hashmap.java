package Exam1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class hashmap {
	public static void main(String[] args) {
		HashMap<String, Integer> list = new HashMap<String, Integer>();
		String name = null;
		int phone;
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Name Student: ");
				name = sc.nextLine();
				System.out.print("Phone: ");
				phone = Integer.parseInt(sc.nextLine());
				if (name.equalsIgnoreCase("x") || name.equalsIgnoreCase("X")) {
					break;
				}else {
					list.put(name, phone);
				}
				
			}
			sc.close();
			System.out.println("List Student: ");
			for (Map.Entry<String, Integer> m : list.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}