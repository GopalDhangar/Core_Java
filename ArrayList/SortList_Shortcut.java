import java.util.ArrayList;
import java.util.Collections;
public class SortList_Shortcut {
	public static void main(String[] args) {
	ArrayList<Integer> l1=new ArrayList<>();
	l1.add(19);
	l1.add(4);
	l1.add(45);
	l1.add(8);
	l1.add(19);
	System.out.println(l1);
	Collections.sort(l1);       //Predefined collection function
	System.out.println(l1);
	}
}

