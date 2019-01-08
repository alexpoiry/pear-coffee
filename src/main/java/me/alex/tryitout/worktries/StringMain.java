package me.alex.tryitout.worktries;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMain {
  public static void main(String... args) {
    System.out.println("value".indexOf('-'));
    System.out.println("-value".substring(0, 0));

    String line = "1.2.3";
    Pattern p = Pattern.compile("\\p{L}");
    Matcher m = p.matcher(line);
    if (m.find()) {
      System.out.println(m.group());
      System.out.println("At: " + m.start());
    }

    System.out.println("a".compareTo("z"));
    System.out.println("a".compareTo(""));
    System.out.println("".compareTo("z"));
  }
}
