package cn.edu.hziee.dao;

import org.apache.ibatis.annotations.Mapper;
import cn.edu.hziee.model.Student;

@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}