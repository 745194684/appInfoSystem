package cn.appsys.controller.developer;

import cn.appsys.controller.BaseController;
import cn.appsys.pojo.DevUser;
import cn.appsys.service.developer.DevUserService;
import cn.appsys.tools.Constants;
import cn.appsys.tools.EmptyUtil;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author ：suPengCheng
 * @date ：Created in 19-6-27 15:01
 */

@RequestMapping("/dev")
@Controller
public class DevLoginController extends BaseController {

    private Logger logger = Logger.getLogger(DevLoginController.class);

    @Autowired
    private DevUserService service;

    // 到登录页面
    @RequestMapping("/toLogin")
    public String toLogin() {
        logger.info("welcome dev/toLogin");
        return "devLogin";
    }

    // 登录
    @RequestMapping("/doLogin")
    public String doLogin(String devCode, String devPassword) {
        DevUser user = service.login(devCode, devPassword);
        if (EmptyUtil.isEmpty(user)){
            request.setAttribute("error","用户名不存在");
            return "devLogin";
        }else{
            if (devPassword.equals(user.getDevPassword())){
                session.setAttribute(Constants.USER_SESSION,user);
                return "developer/main";
            }else {
                request.setAttribute("error","用户名或者密码不正确");
                return "devLogin";
            }
        }
    }

    //注销
    @RequestMapping(value = "/logOut")
    public String logOut(){
        session.removeAttribute(Constants.USER_SESSION);
        return "devLogin";
    }


}
