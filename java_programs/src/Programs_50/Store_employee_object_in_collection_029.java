package Programs_50;

import java.util.ArrayList;

public class Store_employee_object_in_collection_029 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(101);
	a1.add("Deepa");
	a1.add("8596235695");
	for(Object o:a1) {
		System.out.println(o);
	}
}
}
