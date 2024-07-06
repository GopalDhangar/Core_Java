import java.util.ArrayList;
public class Reverse_List {

		static void reverseList(ArrayList<Integer> list) {
			int i=0,j=list.size()-1;
			while(i<j) {
				Integer temp=Integer.valueOf(list.get(i));
				list.set(i, list.get(j));
				list.set(j, temp);
				i++;
				j--;
			    }
		   }
		
		
	public static void main(String[] args) {
	ArrayList<Integer> l1=new ArrayList<>();
	l1.add(3);
	l1.add(4);
	l1.add(5);
	l1.add(8);
	l1.add(9);
	System.out.println(l1);
	reverseList(l1);
	System.out.println(l1);
	}
}

