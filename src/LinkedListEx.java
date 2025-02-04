import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> listy = new LinkedList<>();

        listy.add("Ali");
        listy.add("Alex");
        listy.add("Allison");
        listy.add("Nick");

        System.out.println(listy.contains("Becky"));
        System.out.println(listy.size());
        listy.add("Becky");

//        listy.remove("Ali");
//        for(String item: listy) {
//            System.out.print(item + " -> ");
//        }

        listy.forEach(e -> System.out.print(e + " -> "));
        System.out.println();
        friendList();
    }

    private static void friendList() {
        LinkedList<String> friends = new LinkedList<>();

        friends.add("Toni");
        friends.add("Richelle");
        friends.add("Jeremy");
        friends.add("Andrew");
        friends.add("kale");

        // Initial LinkedList
        System.out.println("Initial LinkedList : " + friends);

        // Adding an element at the specified position in the LinkedList
        friends.add(3, "Lisa");
        System.out.println("After add(3, \"Lisa\") : " + friends);

        // Adding an element at the end of the LinkedList
        friends.addLast("Jennifer");
        System.out.println("After addLast(\"Jennifer\") : " + friends);

        // Adding an element at the beginning of the LinkedList
        friends.addFirst("Steve");
        System.out.println("After addFirst(\"Steve\") : " + friends);

        // Adding all the elements from an existing collection to the end of the LinkedList
        List<String> familyFriends = new ArrayList<>();
        familyFriends.add("Earl");
        familyFriends.add("Tyler");

        friends.addAll(familyFriends);
        System.out.println("After addAll(familyFriends) : " + friends);

        friends.forEach(e -> System.out.print(e + " -> "));
    }
}
