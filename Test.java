package selectCourse;
import java.util.Scanner;     //��Ҫ�����Ǽ��ı�ɨ�衢��ȡ����̨����
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student me = new Student(2019310200, "����", "MAN");
        System.out.println("ѧ����Ϣ");
        System.out.println(me);
        Teacher b = new Teacher(01, "������", "MAN", "ģ��");
        System.out.println("��ʦ��Ϣ");
        System.out.println(b);
        Course c = new Course("ģ��", 01, "207", 90f);
        System.out.println("�γ���Ϣ");
        System.out.println(c); 
        me.tuike();
        me.delete();
   
}
}   