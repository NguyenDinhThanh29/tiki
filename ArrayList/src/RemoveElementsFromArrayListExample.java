import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programingLanguages = new ArrayList<>();
        programingLanguages.add("C");
        programingLanguages.add("C++");
        programingLanguages.add("Java");
        programingLanguages.add("Kotlin");
        programingLanguages.add("Python");
        programingLanguages.add("Perl");
        programingLanguages.add("Ruby");

        System.out.println("Initial List: " + programingLanguages);

        // Remove the element at index'5'
        programingLanguages.remove(5);
        System.out.println("After remove(5): " + programingLanguages);

        // Remove the first occurrence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in the ArrayList)
        boolean isRemove = programingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programingLanguages);

        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programingLanguages);

        // Remove all the element that satisfy the given predicate
        programingLanguages.removeIf(n -> (n.charAt(0) == 'T'));
        /*
        The above removeIf() call also be written using lambda expression like this -
        programmingLanguages.removeIf(s -> s.startsWith("C"))
         */

        System.out.println("After Removing all element that start with \"C\": " + programingLanguages);

        // Remove all element from the ArrayList
        programingLanguages.clear();
        System.out.println("After clear(): " + programingLanguages);
    }
}
