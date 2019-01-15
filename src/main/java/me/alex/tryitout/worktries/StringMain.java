package me.alex.tryitout.worktries;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMain {
  private static final Pattern FIRST_ALPHABETIC_CHARACTER = Pattern.compile("\\p{L}");
  private static final Pattern AUTO_SPLIT = Pattern.compile("((?<version>(\\d+)(\\.\\d+)*)(?<modifier>(.*)))");

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

    String versionModifierRegEx = "(?<version>(\\d+\\.?)*)(?<modifier>(.*))";
    Pattern versionPattern = Pattern.compile(versionModifierRegEx);
    Matcher matcher = versionPattern.matcher("");
    if (matcher.matches()) {
      System.out.println(matcher.group("modifier") == null);
      System.out.println(matcher.group("modifier"));
      System.out.println(matcher.group("version"));
    }

    final String[] versionParts = "1.2.3.".split("\\.");

    for (String versionPart : versionParts) {
      System.out.println("versionPart: " + versionPart);
      try {
        System.out.println("part " + Integer.decode(versionPart));
      } catch (NumberFormatException e) {
        System.out.println(-1);
      }
    }

    System.out.println("This = " + "-".substring(1));

    System.out.println(Integer.signum(0));
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
