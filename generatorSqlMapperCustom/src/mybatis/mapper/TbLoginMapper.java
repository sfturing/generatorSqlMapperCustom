package mybatis.mapper;

import java.util.List;
import mybatis.pojo.TbLogin;
import mybatis.pojo.TbLoginExample;
import org.apache.ibatis.annotations.Param;

public interface TbLoginMapper {
    int countByExample(TbLoginExample example);

    int deleteByExample(TbLoginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbLogin record);

    int insertSelective(TbLogin record);

    List<TbLogin> selectByExample(TbLoginExample example);

    TbLogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbLogin record, @Param("example") TbLoginExample example);

    int updateByExample(@Param("record") TbLogin record, @Param("example") TbLoginExample example);

    int updateByPrimaryKeySelective(TbLogin record);

    int updateByPrimaryKey(TbLogin record);
}