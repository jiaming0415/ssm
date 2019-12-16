package com.zking.ssm.user.mapper;

import com.zking.ssm.user.model.Userfile;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserfileMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Userfile record);

    int insertSelective(Userfile record);

    Userfile selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userfile record);

    int updateByPrimaryKey(Userfile record);

    List<Userfile> selectOne(Long applierId);

    List<Map> selectAll(Userfile userfile);
}