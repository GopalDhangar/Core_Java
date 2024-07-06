import java.util.ArrayList;
public class ArrayList_Basic {
	public static void main(String[] args) {
	ArrayList<Integer> l1=new ArrayList<>();
	//ArrayList<Boolean> l2=new ArrayList<>();
	l1.add(3);
	l1.add(4);
	l1.add(5);
	System.out.print("Loop Array :");
	for(int i=0;i<l1.size();i++) {
		System.out.print(l1.get(i)+" ");
	}
	System.out.println();
	System.out.print("Without loop array : ");
	l1.add(2,100);
	System.out.println(l1);
	l1.set(1,100);
	System.out.println(l1);
	l1.remove(1);
	System.out.println(l1);
	l1.remove(Integer.valueOf(19));
	System.out.println(l1);
	boolean ans=l1.contains(Integer.valueOf(89));
	System.out.println(ans);
	}
}

