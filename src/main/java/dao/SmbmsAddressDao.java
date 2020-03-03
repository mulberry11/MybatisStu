package dao;

import entity.SmbmsAddress;

public interface SmbmsAddressDao {
    int deleteByPrimaryKey(Long id);

    int insert(SmbmsAddress record);

    int insertSelective(SmbmsAddress record);

    SmbmsAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmbmsAddress record);

    int updateByPrimaryKey(SmbmsAddress record);
}