package com.zzyportals.dao;

import com.zzyportals.dataobject.IndustrialDevelopTopicDO;
import com.zzyportals.dataobject.IndustrialDevelopTopicDOKey;

public interface IndustrialDevelopTopicDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_topic
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int deleteByPrimaryKey(IndustrialDevelopTopicDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_topic
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insert(IndustrialDevelopTopicDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_topic
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insertSelective(IndustrialDevelopTopicDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_topic
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    IndustrialDevelopTopicDO selectByPrimaryKey(IndustrialDevelopTopicDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_topic
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKeySelective(IndustrialDevelopTopicDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_topic
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKey(IndustrialDevelopTopicDO record);
}