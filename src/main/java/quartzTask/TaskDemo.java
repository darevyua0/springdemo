package quartzTask;

import org.springframework.stereotype.Component;

/**
 * Created by eason on 2017/6/21.
 */
@Component
public class TaskDemo {

    public void taskTest(){

        System.out.println("taskTest start*************************** 定时任务测试 每五秒一次 time："+System.currentTimeMillis());
    }
}
