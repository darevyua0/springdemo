import aop.service.PersonServer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by eason on 2017/4/27.
 */
public class SpringAOPTest {
    @Test
    public void inteceptorTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
        PersonServer bean = (PersonServer)ctx.getBean("PersonServiceImpl");
        bean.save("ceshi");
        bean.update("sa",1);
    }

    @Test
    public void deadLock(){

    }
   @Test
 public void tesst() {
/*        List<Student> students = buildStudents();*/
/*
        // id升序
        Comparator<Student> byIdASC = Comparator.comparing(Student::getId);

        // named不分区大小写降序
        Comparator<Student> byNameDESC = Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER).reversed();

        // 联合排序
        Comparator<Student> finalComparator = byIdASC.thenComparing(byNameDESC);

        List<Student> result = students.stream().sorted(finalComparator).collect(Collectors.toList());
        System.out.println(result);
    }

    private  List<Student> buildStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10, 20, "w"));
        students.add(new Student(1, 22, "z"));
        students.add(new Student(1, 26, "a"));
        students.add(new Student(5, 23, "c"));
        return students;
    }*/
   }

}

 /*class Student {

    private int id;

    private int age;

    private String name;

*/

/*    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Student [id=" + id + ", age=" + age + ", name=" + name;
    }

}*/
