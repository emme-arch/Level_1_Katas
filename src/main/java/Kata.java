import java.util.ArrayList;
import java.util.List;

/**
 * Created by Linkon on 07 Mar, 2020
 */
public class Kata {
    // A function named hello, that take in a string as an argument.
    static String Hello(String name) {
        return "Hello " + name + "!";
    }

    //A function named evenOrOdd. function take an integer and print in the console even or odd.
    static String evenOrOdd(int number) {
        if (number % 2 == 0)
            return "Even";
        else
            return "Odd";
    }

    //A function, name it square. It takes in an integer and then prints out a square using the hash character.
    static String square(int number) {
        StringBuilder square = new StringBuilder();
        int count = number - 1;
        while (number > 0) {
            for (int c = 0; c <= count; c++) {
                square.append("#");
            }
            square.append("\n");
            number--;
        }
        return String.valueOf(square);
    }

    //A function, name it triangle. It takes in an integer and then prints out a right-hand triangle using the hash character.
    static String triangle(int number) {
        StringBuilder triangle = new StringBuilder();
        for (int c = 1; c <= number; c++) {
            triangle.append("\n");
            for (int i = 1; i <= c; i++) {
                triangle.append("#");
            }
        }
        return String.valueOf(triangle);
    }

    //A function, name it isosceles. It takes in an integer and then prints out an isosceles triangle using the hash character.
    static String isosceles(int baseU) {
        StringBuilder isosceles = new StringBuilder();
        for (int i = 1; i <= baseU; i++) {
            for (int j = baseU; j >= i; j--) {
                isosceles.append(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                isosceles.append("#");
            }
            isosceles.append("\n");
        }
        return String.valueOf(isosceles);
    }

    // A function that takes in an array/list of strings and then prints out the longest one
    static String longest(String[] words) {
        StringBuilder word = new StringBuilder();
        int count = 0;
        for (String x : words) {
            if (x.length() >= count) {
                count = x.length();
            }
        }
        for (String w : words) {
            if (w.length() == count) {
                word.append(w).append("\n");
            }
        }
        return word.toString();
    }

    //A function that combines two lists by alternatively taking elements and prints the result
    static List<Integer> combine(Integer[] aList, Integer[] bList) {
        List<Integer> Combo = new ArrayList<>();
        for (int i = 0; i < aList.length; i++) {
            Combo.add(aList[i]);
            Combo.add(bList[i]);
        }
        return Combo;
    }

    //A function that takes a list of strings and prints them, one per line, in a rectangular frame.
    static String frame(String[] words) {
        StringBuilder framedText = new StringBuilder("*");
        int maxsize = 0;
        for (String s : words) {
            if (s.length() > maxsize) {
                maxsize = s.length();
            }
        }
        for (int i = 0; i <= maxsize + 1; i++) {
            framedText.append("*");
        }
        framedText.append("*");
        framedText.append("\n");
        for (String word : words) {
            framedText.append("* ").append(word);
            for (int i = word.length(); i <= maxsize; i++) {
                framedText.append(" ");
            }
            framedText.append("*");
            framedText.append("\n");
        }
        framedText.append("*");
        for (int i = 0; i <= maxsize + 1; i++) {
            framedText.append("*");
        }
        framedText.append("*");
        framedText.append("\n");
        return String.valueOf(framedText);
    }

}
