package cn.xuetang.service.user;

import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

import cn.xuetang.modules.user.bean.User_conn_wx;
import cn.xuetang.service.BaseService;

@IocBean(fields = { "dao" })
public class UserConnWXService extends BaseService<User_conn_wx> {

	public UserConnWXService(){
	}
	
	public UserConnWXService(Dao dao){
		super(dao);
	}
}
