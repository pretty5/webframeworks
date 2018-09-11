import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisDemo {
    static   String resource = "mybatis-config.xml";
    //创建一个sqlsessionFactory对象  用来获取sqlsession
    static InputStream inputStream;

    static {
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static SqlSessionFactory sqlSessionFactory =
            new SqlSessionFactoryBuilder().build(inputStream);
    static SqlSession session = sqlSessionFactory.openSession();

    public static void main(String[] args) {
           RoleById();
        //PermissionById();
    }
    public static  void RoleById(){
        RoleDao roleDao=session.getMapper(RoleDao.class);
        Role role = roleDao.findById(1);
        System.out.println(role);
    }
    public static  void PermissionById(){
        PermissionDao permissionDao=session.getMapper(PermissionDao.class);
       Permission permission= permissionDao.findById(2);
        System.out.println(permission);
    }
}
