package Sort;
import java.util.*;

public class Test1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> stuList= new ArrayList<Student>();
        System.out.println("请输入学生人数:");
        int n = input.nextInt();
        Student[] students = new Student[n];
        for(int i=0;i<students.length;i++){
            System.out.println("请输入第"+(i+1)+"学生的学号");
            String stuID = input.next();

            System.out.println("请输入第"+(i+1)+"学生的姓名");
            String name = input.next();

            System.out.println("请输入第"+(i+1)+"学生的成绩");
            int score = input.nextInt();

            students[i] = new Student(stuID,name,score);
            stuList.add(students[i]);
        }
        System.out.println("排序前:");
        System.out.println(stuList);
        stuList.sort( new Comparator<Student>() {
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
