import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.x.domain.User;
import org.x.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class Demo {
    // 可以直接使用userMapper
    //@Autowired
    //private UserMapper userMapper;

    @Autowired
    private UserService userService;


    @Test
    public void test() {
        //User user = userMapper.findUserById(16);
        User user = userService.findUserById(10);
        System.out.println(user.getUsername());
    }

    @Test
    public void testMyBatisAnnotation() {
        int count = userService.countAll();
        System.out.println(count);
    }
}
