import java.util.*;
import java.io.*;
public class merges{
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        System.out.println("enter size of list1");
        int n=a.nextInt();
        int element;
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
             element=a.nextInt();
             list1.add(element);
        }
        System.out.println("LIST 1 IS :");
        System.out.println(list1);
        System.out.println("enter size of list2 ");
        int m=a.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<m;i++){
            element=a.nextInt();
            list2.add(element);
        }
        System.out.println(list2);
        
        List<Integer> mergedlist=new ArrayList<>();
        mergedlist.addAll(list1);
        mergedlist.addAll(list2);
        Collections.sort( mergedlist);
        System.out.println("final result");
        System.out.println(mergedlist);
        
    }
}