package cn.appsys.dao.devUser;

import cn.appsys.pojo.DevUser;
import org.springframework.stereotype.Repository;

/**
 * @author ：suPengCheng
 * @date ：Created in 19-6-27 15:16
 */
@Repository
public interface DevUserMapper {

    /**
     * 通过devCode获取User
     */
    DevUser getLoginUser(String devCode);
}
