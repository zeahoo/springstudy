package org.sonny.utils;

public class CommonUtil {
  public static void output(Object obj) {
    System.out.println(obj.getClass().getName() + ":");
    System.out.println(obj);
    System.out.println();
  }
}
