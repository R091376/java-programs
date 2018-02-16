import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ObjectSorting {
	
	public static void main(String args[]) {
		List<Student> students = Arrays.asList(
				new Student(9,"Dudekula",24),
				new Student(2,"Bangaru",29),
				new Student(5,"Ugadi",23),
				new Student(4,"Dude",23)
			);
		
		Collections.sort(students);
		System.out.println("Sort by roll no");
		System.out.println(students);
		
		System.out.println("Sort by age");
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getAge()-o2.getAge();
			}
		});
		
		System.out.println("PRint through the loop ");
		for(Student stu : students) {
			System.out.println(stu);
		}
		
		System.out.println("PRint through the iterator ");
		Iterator<Student> itr = students.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
}

