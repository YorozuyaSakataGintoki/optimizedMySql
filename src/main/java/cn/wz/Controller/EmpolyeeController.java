package cn.wz.Controller;

import cn.wz.pojo.Empolyee;
import cn.wz.service.impl.EmpolyeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class EmpolyeeController {
    @Autowired
    EmpolyeeServiceImpl service;
    @RequestMapping("/t")
    @ResponseBody
    public List<Empolyee> queryAll(){
        return service.queryAll();
    }
}
