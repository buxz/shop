package com.bxz.shop.mapper;

import com.bxz.shop.entity.Manager;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagerMapper {

    Manager findByManager(String manager);

}
