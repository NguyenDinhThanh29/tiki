import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {

    public static void main(String[] args) {
        List<Integer> firstFivePrimaNumbers = new ArrayList<>();
        firstFivePrimaNumbers.add(2);
        firstFivePrimaNumbers.add(3);
        firstFivePrimaNumbers.add(5);
        firstFivePrimaNumbers.add(7);
        firstFivePrimaNumbers.add(11);

        // Create an ArrayList from another collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimaNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        // Adding an entire collection to an ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);
    }
}
