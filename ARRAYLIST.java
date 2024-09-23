import java.util.*;
public class arraylistex1 {
    public static void main(String[] args){
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        Integer[] s=new Integer[10];
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        for(int a:l){
            a=a*a;
            if(a>30){
                l1.add(a);
                System.out.println(a);
            }
        }
    }
}
