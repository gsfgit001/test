package com.baidu.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author： CatalpaFlat
 * @Descrition:
 * @Date: Create in 10:08 2017/11/8
 * @Modified BY：
 */
@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class Text {

    @Autowired
    private RedisTemplate redisTemplate;

    /*private static final Logger log  = Logger.getLogger(Text.class.getName());*/

    @Test
    public void test(){
        redisTemplate.opsForValue().set("chen", "陈梓平");
      /*  log.info("value："+redisTemplate.opsForValue().get("chen"));*/
        System.out.println(redisTemplate.opsForValue().get("chen"));
    }
}