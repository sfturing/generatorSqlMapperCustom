package mybatis.mapper;

import java.util.List;
import mybatis.pojo.Sc;
import mybatis.pojo.ScExample;
import org.apache.ibatis.annotations.Param;

public interface ScMapper {
    int countByExample(ScExample example);

    int deleteByExample(ScExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sc record);

    int insertSelective(Sc record);

    List<Sc> selectByExample(ScExample example);

    Sc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sc record, @Param("example") ScExample example);

    int updateByExample(@Param("record") Sc record, @Param("example") ScExample example);

    int updateByPrimaryKeySelective(Sc record);

    int updateByPrimaryKey(Sc record);
}