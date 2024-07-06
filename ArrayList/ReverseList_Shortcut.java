package demo;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseList_Shortcut {
	public static void main(String[] args) {
	ArrayList<Integer> l1=new ArrayList<>();
	l1.add(3);
	l1.add(4);
	l1.add(5);
	l1.add(8);
	l1.add(9);
	System.out.println(l1);
	Collections.reverse(l1);       //Predefined collection function
	System.out.println(l1);
	}
}

