package com.amar.webs.dao;

import com.amar.webs.model.SecUser;
import com.amar.webs.model.SecUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    int countByExample(SecUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    int deleteByExample(SecUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    int insert(SecUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    int insertSelective(SecUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    List<SecUser> selectByExample(SecUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    SecUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SecUser record, @Param("example") SecUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SecUser record, @Param("example") SecUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SecUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SecUser record);
}