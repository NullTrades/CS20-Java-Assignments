package Demos20;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        // Declaration 				//  Initialization
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> ages = new ArrayList<Integer>();

        names.add("Gandalf");
        names.add("Goku");
        names.add("Kirby");
        names.add("Dumbledore");
        names.add("Yoda");

        ages.add(24000);
        ages.add(24);
        ages.add(31);
        ages.add(116);
        ages.add(900);

//		System.out.println(names.get(3) + " is " + ages.get(3) + " years old.");
//		int i = 0;
//		while(i < ages.size()) {
//			System.out.println(names.get(i) + " " + ages.get(i));
//			i++;
//		}
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " " + ages.get(i));
        }
        //cheat print for testing // only works with ArrayList not Array
        System.out.println("\n" + names);
        //don't use collections with parallel data structures
    }

}
