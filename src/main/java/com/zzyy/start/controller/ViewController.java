package com.zzyy.start.controller;

import com.zzyy.start.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "View控制器")
@Controller
@RequestMapping("/view")
public class ViewController {


    @ApiOperation("index")
    @GetMapping("/index")
    public String index(Model model) {
        List<User> list = new ArrayList<User>();
        list.add(new User("KangKang", "康康"));
        list.add(new User("Mike", "麦克"));
        list.add(new User("Jane", "简"));
        list.add(new User("Maria", "玛利亚"));
        model.addAttribute("accountList", list);
        return "user";
    }

}
