package selectCourse;
import java.util.Scanner;     //主要功能是简化文本扫描、获取控制台输入
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student me = new Student(2019310200, "李涛", "MAN");
        System.out.println("学生信息");
        System.out.println(me);
        Teacher b = new Teacher(01, "周义明", "MAN", "模电");
        System.out.println("教师信息");
        System.out.println(b);
        Course c = new Course("模电", 01, "207", 90f);
        System.out.println("课程信息");
        System.out.println(c); 
        me.tuike();
        me.delete();
   
}
}   