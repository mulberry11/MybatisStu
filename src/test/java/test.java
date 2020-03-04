import dao.*;
import entity.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 十一
 * @date 2020-03-02 10:00
 */
public class test {
    private SqlSession session;
    private InputStream in;
    private SmbmsProviderDao smbmsProviderDao;
    private SmbmsAddressDao addressDao;
    private SmbmsBillDao billDao;
    private SmbmsRoleDao roleDao;
    private SmbmsUserDao userDao;
    @Before
    public void init()  {
        try {
            in = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            session = factory.openSession(true);
            smbmsProviderDao= session.getMapper(SmbmsProviderDao.class);
            addressDao= session.getMapper(SmbmsAddressDao.class);
            billDao= session.getMapper(SmbmsBillDao.class);
            roleDao= session.getMapper(SmbmsRoleDao.class);
            userDao= session.getMapper(SmbmsUserDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @After
    public void close(){
        session.close();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test() throws Exception{
        SmbmsUser smbmsUser = userDao.selectByPrimaryKey(1L);
        System.out.println(smbmsUser);
    }
    @Test
    public void billTest(){
        SmbmsBill smbmsBill = new SmbmsBill();
        smbmsBill.setProductname("大");
        List<SmbmsBill> smbmsBills = billDao.OrderList(smbmsBill);
        for (SmbmsBill bill :
                smbmsBills) {
            System.out.println(bill);
        }
    }

}
