package cn.lookroot.loop.web.mapper;

import cn.lookroot.loop.web.pojo.WebUsers;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity cn.lookroot.loop.web.pojo.WebUsers
 */
@Mapper
public interface WebUsersMapper {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated
     */
    int insert(WebUsers record);

    /**
     * @mbg.generated
     */
    int insertSelective(WebUsers record);

    /**
     * @mbg.generated
     */
    WebUsers selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(WebUsers record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(WebUsers record);
}