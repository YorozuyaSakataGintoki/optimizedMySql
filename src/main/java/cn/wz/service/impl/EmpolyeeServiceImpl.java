package cn.wz.service.impl;

import cn.wz.mapper.EmpolyeeMapper;
import cn.wz.pojo.Empolyee;
import cn.wz.service.EmpolyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpolyeeServiceImpl implements EmpolyeeService {

    @Autowired
    private EmpolyeeMapper empolyeeMapper;
    @Override
    public List<Empolyee> queryAll() {
        return empolyeeMapper.queryAll();
    }
}
