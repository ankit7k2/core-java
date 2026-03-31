import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Collectionn {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(6);
        nums.add(2);
        nums.add(8);
        nums.add(5);
        nums.add(6);
        System.out.println(nums);
        for (Integer o : nums) {
            System.out.println(o);
        }
        // System.out.println(nums.get(2)); // Sets don't support indexing
        // Iterator
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Map<String, Integer> students = new HashMap<>();
        students.put("Ankit", 85);
        students.put("Rahul", 90);
        students.put("Priya", 78);
        students.put("Harsh", 88);
        // This will overwrite the previous value for "Ankit"

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (String key : students.keySet()) {
            System.out.println(key + ": " + students.get(key));
        }

        // sorting
        List<Student> numList = new ArrayList<>();
        // numList.sort(null); // Sort in natural order
        numList.add(new Student("Alice", 85));
        numList.add(new Student("Bob", 90));
        numList.add(new Student("Charlie", 78));
        numList.add(new Student("David", 88));

        System.out.println(numList);
        // Comparator <Integer> com=new Comparator<Integer>() {
        // @Override
        // public int compare(Integer o1, Integer o2) {
        // if(o1 % 10 > o2 % 10) {
        // return 1;
        // } else if(o1 % 10 < o2 % 10) {
        // return -1;
        // } else {
        // return 0;
        // }
        // }
        // };
        // numList.sort(com);
        // System.out.println(numList);
        //

        // Collections.sort(numList); // Sort using natural ordering (by marks)
        // System.out.println(numList);

        //sorting using comparator with lamda expression
        numList.sort((s1, s2) -> s1.marks>s2.marks ? 1 : (s1.marks < s2.marks ? -1 : 0));
        System.out.println(numList);
    }
}

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student[name='" + name + "', marks=" + marks + "]";
    }

    @Override
    public int compareTo(Student o) {
        // Compare by marks for natural ordering
        return Integer.compare(this.marks, o.marks);
    }
}