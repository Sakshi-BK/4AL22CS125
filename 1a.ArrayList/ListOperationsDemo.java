/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows*/
package Arraylist;
import java.util.*;
public class ListOperationsDemo {
	public static void main(String[] args) {
        // 1. Creating ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("=== ArrayList Operations ===");
        performOperations(arrayList);

        System.out.println("\n=== LinkedList Operations ===");
        performOperations(linkedList);
    }

    public static void performOperations(List<String> list) {
        // 1. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding elements: " + list);

        // 2. Adding element at specific index
        list.add(1, "Grapes");
        System.out.println("After adding at index 1: " + list);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Pineapple", "Mango");
        list.addAll(moreFruits);
        System.out.println("After adding multiple elements: " + list);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + list.get(2));

        // 5. Updating elements
        list.set(2, "Strawberry");
        System.out.println("After updating index 2: " + list);

        // 6. Removing elements
        list.remove("Banana");
        list.remove(0);  // Removing first element
        System.out.println("After removing elements: " + list);

        // 7. Searching elements
        boolean containsMango = list.contains("Mango");
        System.out.println("Contains 'Mango': " + containsMango);

        // 8. List size
        System.out.println("List size: " + list.size());

        // 9. Iterating over list (for-each loop)
        System.out.print("Iterating using for-each: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("Iterating using Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        // 12. Sublist
        if (list.size() >= 2) {
            List<String> subList = list.subList(0, 2);
            System.out.println("Sublist (0 to 2): " + subList);
        }

        // 13. Clearing the list
        list.clear();
        System.out.println("After clearing: " + list);
    }
}

