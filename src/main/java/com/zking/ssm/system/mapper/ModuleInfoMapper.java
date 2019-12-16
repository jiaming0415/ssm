package com.zking.ssm.system.mapper;

import com.zking.ssm.book.model.Book;
import com.zking.ssm.system.model.ModuleInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(ModuleInfo record);

    int insertSelective(ModuleInfo record);

    ModuleInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ModuleInfo record);

    int updateByPrimaryKey(ModuleInfo record);

    List<ModuleInfo> queryModuleInfoByPid(String pid);
}