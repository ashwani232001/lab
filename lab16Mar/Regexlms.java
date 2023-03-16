package Assignment;

import java.util.Scanner;

public class Regexlms {
	 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
        String IP = in.next();
        boolean isMatch = IP.matches(new MyRegex().pattern);
        System.out.println(isMatch);
    }
    in.close();
  }
}
