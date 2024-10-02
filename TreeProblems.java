/*
 * *** YOUR NAME GOES HERE / YOUR SECTION NUMBER ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
   public Set<Integer> different(Set<Integer> set1, Set<Integer> set2) {
    Set<Integer> result = new TreeSet<>(set1);
    result.removeAll(set2); // Remove elements present in both sets
    Set<Integer> temp = new TreeSet<>(set2);
    temp.removeAll(set1); // Remove elements present in both sets
    result.addAll(temp); // Combine the differences from both sets
    return result;
}



  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

   public void removeEven(Map<Integer, String> map) {
    Iterator<Integer> iterator = map.keySet().iterator();
    while (iterator.hasNext()) {
        int key = iterator.next();
        if (key % 2 == 0) {
            iterator.remove(); // Remove entry if the key is even
        }
    }
}


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

   public boolean treesEqual(Map<Integer, String> map1, Map<Integer, String> map2) {
    if (map1.size() != map2.size()) {
        return false; // Maps are not equal if their sizes differ
    }
    for (Map.Entry<Integer, String> entry : map1.entrySet()) {
        if (!entry.getValue().equals(map2.get(entry.getKey()))) {
            return false; // Maps are not equal if any key-value pair differs
        }
    }
    return true; // Maps are equal
}


} // end treeProblems class
