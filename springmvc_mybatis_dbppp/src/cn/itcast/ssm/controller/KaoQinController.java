package cn.itcast.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.original.Kaoqin;
import cn.itcast.ssm.service.KaoQinService;
import cn.itcast.ssm.vo.VoKaoQin;

@Controller
public class KaoQinController {
	@Autowired
	private KaoQinService kaoqinService;


//	public String kaoqin(String yue,HttpSession session)
//			throws Exception {

        // 调用service查找 数据库，查询商品列表
//		String UserName ;
//        
//        UserName=(String)session.getAttribute("username");
//        List<Kaoqin> userLst = kaoqinService.findkaoqinitemlist(UserName,yue);
//        Kaoqin.userLst(userLst);
//		return "kaoqin/KaoQinBiao";
//	}
	 // 用户检索一览画面的检索按钮
//    @RequestMapping("/kaoqinxiugai")
	// 登陆
	@RequestMapping("/kaoqin")
    public ModelAndView kaoqinjiansuo(@ModelAttribute VoKaoQin vokaoqin,
            HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception {
        // 测试forward后request是否可以共享

//      System.out.println(request.getParameter("id"));

        // 调用service查找 数据库，查询商品列表
//        List<TUser> userLst = kaoqinService.findUserLst(kaoqin.getUsername());
//        kaoqin.setUserLst(userLst);
		String UserName=(String)session.getAttribute("username");
      
	List<Kaoqin> userLst = kaoqinService.findkaoqinitemlist(UserName,"6666");
	vokaoqin.setKaoqinlist(userLst);

        // 返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        
        modelAndView.addObject("vokaoqin", vokaoqin);
        // 相当 于request的setAttribut，在jsp页面中通过itemsList取数据

        // 指定视图
        // 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
        // modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
        // 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
        modelAndView.setViewName("kaoqin/KaoQinBiao");

        return modelAndView;

    }
    
}
