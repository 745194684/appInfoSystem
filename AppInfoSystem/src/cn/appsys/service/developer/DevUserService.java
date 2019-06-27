package cn.appsys.service.developer;

import cn.appsys.pojo.DevUser;

/**
 * @author ：suPengCheng
 * @date ：Created in 19-6-27 15:15
 */
public interface DevUserService {

    DevUser login(String devCode, String devPassword);

}
