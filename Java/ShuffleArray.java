import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ShuffleArray {
    public static void main(String[] args) {
        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        Integer[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Convert the array to a list
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, originalArray);

        // Shuffle the list
        Collections.shuffle(list);

        // Convert the shuffled list back to an array
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        for (Integer value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}