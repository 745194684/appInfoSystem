package cn.appsys.service.developer;

import cn.appsys.dao.devuser.DevUserMapper;
import cn.appsys.pojo.DevUser;
import cn.appsys.tools.EmptyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：suPengCheng
 * @date ：Created in 19-6-27 15:15
 */
@Service
public class DevUserServiceImpl implements DevUserService {

    @Autowired
    private DevUserMapper mapper;


    @Override
    public DevUser login(String devCode, String devPassword) {
        if (EmptyUtil.isEmpty(devCode)) {
            return null;
        }
        return mapper.getLoginUser(devCode);
    }
}
