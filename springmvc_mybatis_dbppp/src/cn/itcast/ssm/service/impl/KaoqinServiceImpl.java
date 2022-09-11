package cn.itcast.ssm.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.custom.CustomKaoQinMapper;
import cn.itcast.ssm.mapper.original.TUserMapper;
import cn.itcast.ssm.po.original.Kaoqin;
import cn.itcast.ssm.service.KaoQinService;

/**
 *
 * <p>Title: ItemsServiceImpl</p>
 * <p>Description: 商品管理</p>
 * <p>Company: www.itcast.com</p>
 * @author	传智.燕青
 * @date	2015-4-13下午3:49:54
 * @version 1.0
 */
public class KaoqinServiceImpl implements KaoQinService {

    @Autowired
    private TUserMapper tUserMapper;

    @Autowired
    private CustomKaoQinMapper customKaoQinMapper;

    
    
	@Override
	public List<Kaoqin> findkaoqinitemlist(@Param("username")String username, @Param("yue")String yue) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return customKaoQinMapper.getKaoqinMapLst(username,yue);
	}

//    @Override
//    public TUser findkaoqinitemlist(String username ,String yue) throws Exception {
//        return tUserMapper.selectByPrimaryKey(name);
//    }

   
}
