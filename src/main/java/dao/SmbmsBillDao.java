package dao;

import entity.SmbmsBill;

public interface SmbmsBillDao {
    int deleteByPrimaryKey(Long id);

    int insert(SmbmsBill record);

    int insertSelective(SmbmsBill record);

    SmbmsBill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmbmsBill record);

    int updateByPrimaryKey(SmbmsBill record);
}