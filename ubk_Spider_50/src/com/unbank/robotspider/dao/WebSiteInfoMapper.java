package com.unbank.robotspider.dao;

import com.unbank.robotspider.entity.WebSiteInfo;
import com.unbank.robotspider.entity.WebSiteInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebSiteInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int countByExample(WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int deleteByExample(WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int deleteByPrimaryKey(Integer websiteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int insert(WebSiteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int insertSelective(WebSiteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    List<WebSiteInfo> selectByExample(WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    WebSiteInfo selectByPrimaryKey(Integer websiteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int updateByExampleSelective(@Param("record") WebSiteInfo record, @Param("example") WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int updateByExample(@Param("record") WebSiteInfo record, @Param("example") WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int updateByPrimaryKeySelective(WebSiteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int updateByPrimaryKey(WebSiteInfo record);
}