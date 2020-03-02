package dao;

import entity.QueryVo;
import entity.SmbmsProvider;

import java.util.List;

public interface SmbmsProviderDao {
    int deleteByPrimaryKey(Long id);

    int insert(SmbmsProvider record);

    int insertSelective(SmbmsProvider record);

    List<SmbmsProvider> findAll();

    SmbmsProvider selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmbmsProvider record);

    int updateByPrimaryKey(SmbmsProvider record);

    /**
     * 根据queryVo查询的条件查询
     * @param vo
     * @return
     */
    List<SmbmsProvider>  findUserByVo(QueryVo vo);
}