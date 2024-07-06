import java.util.ArrayList;
import java.util.Collections;
public class String_SortList {
	public static void main(String[] args) {
	ArrayList<String> l1=new ArrayList<>();
	l1.add("Welcome");
	l1.add("To");
	l1.add("Physics");
	l1.add("Wallah");
	System.out.println("Before Sort : "+l1);
	Collections.sort(l1);       //Predefined collection function
	System.out.println("After Sort : "+l1);
	}
}

