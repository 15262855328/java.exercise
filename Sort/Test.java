package Sort;
import java.util.*;

public class Test {
    public static void main(String[] args){
        List<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student("1001","jack",21));
        stuList.add(new Student("1002","tom",20));
        stuList.add(new Student("1003","rose",18));
        stuList.add(new Student("1004","alice",20));
        System.out.println("排序前:");
        System.out.println(stuList);
        stuList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getScore()==o2.getScore()){
                    return o1.getName().length()-o2.getName().length();
                }
                return o1.getScore()-o2.getScore();
            }
        });
        System.out.println("排序后:");
        System.out.println(stuList);
    }
}
