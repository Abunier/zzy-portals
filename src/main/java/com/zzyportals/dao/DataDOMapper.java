package com.zzyportals.dao;

import com.zzyportals.dataobject.DataDO;
import com.zzyportals.dataobject.DataDOKey;

public interface DataDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_data
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int deleteByPrimaryKey(DataDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_data
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insert(DataDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_data
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insertSelective(DataDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_data
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    DataDO selectByPrimaryKey(DataDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_data
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKeySelective(DataDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_data
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(DataDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_data
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKey(DataDO record);
}