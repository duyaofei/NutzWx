package cn.xuetang.modules;

import org.nutz.mvc.annotation.By;
import org.nutz.mvc.annotation.Encoding;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Filters;
import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Localization;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.SetupBy;
import org.nutz.mvc.annotation.Views;
import org.nutz.mvc.ioc.provider.ComboIocProvider;
import org.nutz.weixin.mvc.WxViewMaker;

import cn.xuetang.common.filter.ShiroActionFilter;
import cn.xuetang.mvc.JPEGViewMaker;
import cn.xuetang.mvc.VelocityViewMaker;

/**
 * 类描述： 创建人：Wizzer 联系方式：www.wizzer.cn 创建时间：2013-11-26 下午2:08:37
 * 
 * @version
 */

@Modules(scanPackage = true)
@Ok("raw")
@Fail("http:500")
@IocBy(type = ComboIocProvider.class, args = { "*org.nutz.ioc.loader.json.JsonLoader", "config", "*org.nutz.ioc.loader.annotation.AnnotationIocLoader", "cn.xuetang" })
@SetupBy(value = StartSetup.class)
@Localization("msg")
@Filters(@By(type = ShiroActionFilter.class, args = { "ioc:shiroActionFilter" }))
@Encoding(input = "UTF-8", output = "UTF-8")
// @UrlMappingBy(value=UrlMappingSet.class)
@Views({ VelocityViewMaker.class, JPEGViewMaker.class, WxViewMaker.class })
public class MainModule {
}
