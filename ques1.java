import java.util.Scanner;
import java.util.Vector;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector v = new Vector(n);
        int cap = v.capacity();
        String s = sc.nextLine();
        v.add(s);
        while(v.size() <= cap) {
            s = sc.nextLine();
            if(s == "") {
                break; //to break the loop when user wants
            }
            v.add(s);
        }
        if(v.size() != 0) {
            v.remove(0); //to remove the first null element
        }
        System.out.println(v.toString());
    }
}
