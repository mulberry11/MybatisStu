import dao.SmbmsProviderDao;
import entity.QueryVo;
import entity.SmbmsProvider;
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
    @Before
    public void init()  {
        try {
            in = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            session = factory.openSession();
            smbmsProviderDao= session.getMapper(SmbmsProviderDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @After
    public void close(){
        session.commit();
        session.close();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testFindAll() throws Exception{
        List<SmbmsProvider> all = smbmsProviderDao.findAll();
        for (SmbmsProvider smbms :
                all) {
            System.out.println(smbms);
        }
    }
    @Test
    public void testVo(){
        QueryVo vo = new QueryVo();
        SmbmsProvider smbmsProvider = new SmbmsProvider();
        smbmsProvider.setProname("%市%");
        vo.setProvider(smbmsProvider);
        List<SmbmsProvider> userByVo = smbmsProviderDao.findUserByVo(vo);
        for (SmbmsProvider smbms:userByVo) {
            System.out.println(smbms);
        }
    }
}
