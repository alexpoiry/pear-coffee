package me.alex.tryitout.worktries;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMain {
  private static final Pattern FIRST_ALPHABETIC_CHARACTER = Pattern.compile("\\p{L}");

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

    String[] versionsAndModifier = "Alpha".split("(?=\\p{L}|-)",2);

    System.out.println("**************************");
    System.out.println(versionsAndModifier.length);

    for (int i = 0; i < versionsAndModifier.length; i++) {
      System.out.println(versionsAndModifier[i]);
    }

    System.out.println(findModifierIndex("1.2.Gamma"));

    System.out.println("1.2-Alpha".replaceFirst("^-", ""));
  }

  private static int findModifierIndex(String version) {
    final int dashIndex = version.indexOf('-');
    final Matcher matcher = FIRST_ALPHABETIC_CHARACTER.matcher(version);
    final boolean match = matcher.find();

    if (dashIndex < 0 && match) {
      return matcher.start();
    } else if (dashIndex > 0 && match) {
      final int firstAlpha = matcher.start() == 0 ? 0 : matcher.start() - 1;
      return Math.min(dashIndex, firstAlpha);
    } else {
      return dashIndex;
    }
  }
}
