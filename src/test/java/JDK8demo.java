import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by eason on 2017/7/24.
 */
public class JDK8demo {
    public static void main(String[] args) {
        Arrays.asList( "a", "b", "d" ).forEach(e -> System.out.println( e ) );
        Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );
        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );

    }

}

 class Student {

    /** 学号 */
    private long id;

    private String name;

    private int age;

    /** 年级 */
    private int grade;

    /** 专业 */
    private String major;

    /** 学校 */
    private String school;

    // 省略getter和setter
}
