import java.util.*;

public class _reverse_ArrayList {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());
        reverseArrayList(list);
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }

    // Takes an arraylist as a parameter and returns 
    // a reversed arraylist 
    static void reverseArrayList(ArrayList<Integer> list) {
        // Write your code here
        Integer num;
        int len = list.size();

        
        for(int pos = 0; pos< len/2 ;pos++){
            num = list.get(pos);
            list.set(pos,list.get(len - pos - 1));
            list.set(len-pos - 1,num);
        }
       
    }
}