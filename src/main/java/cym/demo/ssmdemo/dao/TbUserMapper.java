package cym.demo.ssmdemo.dao;

import cym.demo.ssmdemo.bean.TbUser;
import cym.demo.ssmdemo.bean.TbUserExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER
     *
     * @mbggenerated
     */
    int countByExample(TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER
     *
     * @mbggenerated
     */
    int deleteByExample(TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER
     *
     * @mbggenerated
     */
    int insert(TbUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER
     *
     * @mbggenerated
     */
    int insertSelective(TbUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER
     *
     * @mbggenerated
     */
    List<TbUser> selectByExample(TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER
     *
     * @mbggenerated
     */
    TbUser selectByPrimaryKey(BigDecimal userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbUser record);
}