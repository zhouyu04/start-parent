package com.zzyy.start;

import com.alibaba.fastjson.JSON;
import com.zzyy.start.entity.User;
import com.zzyy.start.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StartParentApplication.class)
class StartParentApplicationTests {


    @Autowired
    UserMapper userMapper;


    @Test
    public void test() throws Exception {
        User user = userMapper.queryByName("zy");
        System.out.println("第一次查询:" + JSON.toJSONString(user));

        User user2 = userMapper.queryByName("zy");
        System.out.println("第二次查询:" + JSON.toJSONString(user2));
    }


    @Test
    void contextLoads() {
    }

}
