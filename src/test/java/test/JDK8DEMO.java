package test;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by crj on 2017/7/25.
 */
public class JDK8DEMO {
    public static void main(String[] args) {
        List<Student> list =new ArrayList<>();
       Student student1 = new Student();
       student1.setAge("12");
        Student student2 = new Student();
        student2.setAge("13");
        Student student3 = new Student();
        student3.setAge("11");
        Student student4 = new Student();
        student4.setAge("18");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
       List<Demo> demos = new ArrayList<Demo>();
        //原始数据
        System.out.println("原始数据*******************");
        demos = list.stream().map(student-> new Demo(student.getAge(),1)).collect(Collectors.toList());
        demos.forEach(demo -> {
            System.out.println("年龄 "+demo.getAge() +"  性别 " +demo.getSex()+",");
        });
        System.out.println("筛选年龄大于12岁的*************");
        List<Demo> demoFilter =  demos.stream().filter(demo -> Integer.valueOf(demo.getAge()) > 12).collect(Collectors.toList());
        demoFilter.forEach(demo -> {
            System.out.println("年龄 "+demo.getAge() +"  性别 " +demo.getSex()+",");
        });
        System.out.println("排序******************");
        List<Demo> demoSort = demos.stream().sorted((s1, s2) -> s1.getAge().compareTo(s2.getAge())).collect(Collectors.toList());
        demoSort.forEach(demo -> {
            System.out.println("年龄 "+demo.getAge() +"  性别 " +demo.getSex()+",");
        });
        System.out.println("倒序****************");
        ArrayList<Demo> demoArray = (ArrayList<Demo>) demos;
        Comparator<Demo> comparator = (h1, h2) -> h1.getAge().compareTo(h2.getAge());
        demos.sort(comparator.reversed());
        demos.forEach(demo -> {
            System.out.println("年龄 "+demo.getAge() +"  性别 " +demo.getSex()+",");
        });



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