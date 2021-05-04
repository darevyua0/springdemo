package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by crj on 2017/7/25.
 */
public class JDK8DEMO {
    public static void main(String[] args) {
        List<Student> list =new ArrayList<>();
       Student student1 = new Student();
       student1.setAge("12");
        Student student2 = new Student();
        student1.setAge("13");
        Student student3 = new Student();
        student1.setAge("11");
        Student student4 = new Student();
        student1.setAge("18");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        List<Demo> demos = list.stream().map(student-> new Demo(student.getAge(),40)).collect(Collectors.toList());
        demos.forEach(demo -> {
            System.out.println(demo.getAge() +" " +demo.getSex());
        });
       // demos.stream().filter(demo -> {demo.getAge() == null});

    }
}

class Demo{
    private String name;
    private  Integer sex;
    private  String age;

    public Demo(String age,Integer sex) {
        this.age =age;
        this.sex =sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}