package Learning;

import java.util.ArrayList;
import java.util.List;

public class RemoveEverySecondElement {
	public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        
        System.out.println("Original List: " + numbers);

        
        removeEverySecondElement(numbers);

        
        System.out.println("Modified List: " + numbers);
    }

    public static void removeEverySecondElement(List<?> list) {
        
        for (int i = list.size() - 1; i >= 0; i -= 2) {
            list.remove(i);
        }
    }
	

}

//output
//Original List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//Modified List: [1, 3, 5, 7, 9]


