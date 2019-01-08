package me.alex.tryitout.worktries;

public class LoopMain {
  public static void main(String... args) {
    String[] words = {"hello", "world", "oops", "12345"};

    for (String word : words) {
      if (word.length() == 5) {
        System.out.print(word);
      } else {
        break;
      }
      System.out.print(" ");
    }

    System.out.println("!");
  }
}
