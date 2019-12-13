import java.util.*;
import java.io.*;
public class Cereal{
  public static void main(String[] args)throws FileNotFoundException{
    System.out.println(getAllShelfs("Cereal.csv"));
  }
  public static String[] getAllShelfs(String filename)throws FileNotFoundException{
    return getAllAttribute(12,filename);
  }
  public static String[] getAllRatings(String filename)throws FileNotFoundException{
    return getAllAttribute(15,filename);
  }
  public static String[] getAllAttribute(int x, String filename)throws FileNotFoundException{
    String[] s = new String[999];
    int e = 0;
    Scanner y = new Scanner(new File(filename));
    while (y.hasNextLine()){

      y.nextLine();
      y.useDelimiter(",");
      if (x < 1){
          for (int i=1;i<x-2;i++){
            y.next();
        }
      }
      String o = y.next();
      s[e] = o;
      e++;
    }
    return s;
  }
}
