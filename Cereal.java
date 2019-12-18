import java.util.*;
import java.io.*;
public class Cereal{
  public static void main(String[] args)throws FileNotFoundException{
    String[] x = getAllShelfs("Cereal.csv");
    for (int i=0;i<x.length;i++){
      System.out.println(x[i]);
    }
  }
  public static String[] getAllShelfs(String filename)throws FileNotFoundException{
    return getAllAttribute(12,filename);
  }
  public static String[] getAllRatings(String filename)throws FileNotFoundException{
    return getAllAttribute(15,filename);
  }
  public static String[] getAllAttribute(int x, String filename)throws FileNotFoundException{

    int e = 0;
    Scanner y = new Scanner(new File(filename));
    String[] s = new String[9999];

    y.useDelimiter(",");
    while (y.hasNext()){
      String o;
      y.nextLine();

          for (int i=1;i<x-1;i++){
          o = y.next();
        }

      o = y.next();
      s[e] = o;
      e++;

    }
    return s;
  }
}
