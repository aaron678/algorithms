package com.study.algorithms.count_words;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordsScanner {
      public static void main(String[] args) {
        String line;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine() && !(line = scanner.nextLine()).isEmpty()) {
            Pattern pattern = Pattern.compile("\\w+");
            Matcher matcher = pattern.matcher(line);
            System.out.println("Number of els in line is: " + matcher.results().count());
        }
        System.out.println("done");
    }
}
