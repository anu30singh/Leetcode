import java.util.ArrayList;
import java.util.List;
public class pascaltri {
public static List<List<Integer>> pascaltriangle(int numRows) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> row , pre=null;
        for (int i=0; i<numRows ; ++i) {
            row = new ArrayList <Integer> ();
            for (int j=0; j<=i ; ++j) {
                  if (j==0|| j==i) {  //hello
                        row.add(1);

                           } else {
                row. add (pre.get(j-1)+ pre.get(j));
                   
}
            }
            pre= row;
                  results.add(row);
        }
        return results;
    }
    public static void main (String [] args ) {
        int n = 5;
        System.out.println(pascaltriangle(n));
    }
}