package aop.service.impl;

import aop.annotation.SecureValid;
import aop.service.PersonServer;
import org.springframework.stereotype.Service;

/**
 * Created by eason on 2017/4/27.
 */
@Service("PersonServiceImpl")
class PersonServiceImpl implements PersonServer {

    @Override
    @SecureValid
    public void save(String name) {

        System.out.println("我是save方法");
        //  throw new RuntimeException();
    }

    @Override
    @SecureValid
    public void update(String name, Integer id) {

        System.out.println("我是update()方法");
    }

    @Override
    public String getPersonName(Integer id) {

        System.out.println("我是getPersonName()方法");
        return "xxx";
    }

}
