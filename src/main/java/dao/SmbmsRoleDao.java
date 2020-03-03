package dao;

import entity.SmbmsRole;

public interface SmbmsRoleDao {
    int deleteByPrimaryKey(Long id);

    int insert(SmbmsRole record);

    int insertSelective(SmbmsRole record);

    SmbmsRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmbmsRole record);

    int updateByPrimaryKey(SmbmsRole record);
}