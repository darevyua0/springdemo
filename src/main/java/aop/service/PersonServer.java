package aop.service;

import aop.annotation.SecureValid;

/**
 * Created by eason on 2017/4/27.
 */

public interface PersonServer {

    public void save(String name);
    public void update(String name, Integer id);
    public String getPersonName(Integer id);

}