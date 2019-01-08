package me.alex.tryitout.worktries;

import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class MapMain {
  public static void main(String... args) {
    Map<Integer, Integer> left = new HashMap<>();
    Map<Integer, Integer> right = new HashMap<>();

    left.put(1, 1);
    left.put(2, 3);
    left.put(3, 5);

    right.put(1, 1);
    right.put(2, 3);
    right.put(3, 6);

    MapDifference<Integer, Integer> differences = Maps.difference(left, right);

    for (Map.Entry<Integer, MapDifference.ValueDifference<Integer>> entry : differences.entriesDiffering().entrySet()) {
      Integer key = entry.getKey();
      MapDifference.ValueDifference<Integer> value = entry.getValue();
      System.out.println("key = " + key + ", value = " + value);
    }

    int[] a = {1,2,3};
    int[] b = {1,2,3};

    //.allMatch(i -> a[i] > b[i])
    //System.out.println(IntStream.range(0, a.length));
    System.out.println(IntStream.range(0, a.length).allMatch(i -> a[i] == b[i]));

    final Map<Integer, Integer> counts = new HashMap<>();
    counts.merge(1, 1, Integer::compare);
    counts.merge(1, 1, Integer::compare);
    counts.merge(2, 1, Integer::compare);
    counts.merge(2, 1, Integer::compare);
    counts.merge(3, 1, Integer::compare);
    counts.merge(3, 2, Integer::compare);

    for(Integer diff : counts.values()) {
      System.out.println(diff);
    }
  }
}
