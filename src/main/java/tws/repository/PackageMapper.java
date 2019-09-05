package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.Packagess;

import java.util.List;

@Mapper
public interface PackageMapper {
    List<Packagess> selectAll();
    void insert(@Param("packages") Packagess packages);
}
