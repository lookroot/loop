package cn.lookroot.loop.web.mapper;

import cn.lookroot.loop.web.pojo.WebUsers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WebUsersMapperTest {
    @Autowired
    private WebUsersMapper webUsersMapper;

    @Test
    public void insert() {
        WebUsers webUsers = new WebUsers();
        webUsers.setUsername("lookroot");
        int result = webUsersMapper.insert(webUsers);
        Assert.assertEquals(1, result);
    }
}