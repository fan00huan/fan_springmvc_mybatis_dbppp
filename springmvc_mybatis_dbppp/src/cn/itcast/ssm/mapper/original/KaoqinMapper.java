package cn.itcast.ssm.mapper.original;

import cn.itcast.ssm.po.original.Kaoqin;
import cn.itcast.ssm.po.original.KaoqinKey;

public interface KaoqinMapper {
    int deleteByPrimaryKey(KaoqinKey key);

    int insert(Kaoqin record);

    int insertSelective(Kaoqin record);

    Kaoqin selectByPrimaryKey(KaoqinKey key);

    int updateByPrimaryKeySelective(Kaoqin record);

    int updateByPrimaryKey(Kaoqin record);
}