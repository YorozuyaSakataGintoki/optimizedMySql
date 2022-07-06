package cn.wz.mapper;

import cn.wz.pojo.Empolyee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Mapper
public interface EmpolyeeMapper {
    List<Empolyee> queryAll();
}
