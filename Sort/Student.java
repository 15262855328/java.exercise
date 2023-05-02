package Sort;

public class Student {
    String stuID;
    String name;
    int score;
    public Student(String stuID,String name,int score){
        this.stuID = stuID;
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String toString(){
        return "Student 学号:"+stuID+",姓名:"+name+",成绩:"+score+"\n";
    }
}
