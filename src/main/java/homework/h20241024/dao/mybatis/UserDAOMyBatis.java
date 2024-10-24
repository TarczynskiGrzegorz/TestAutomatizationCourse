package homework.h20241024.dao.mybatis;
import homework.h20241024.MyBatisConf;
import homework.h20241024.dao.IUserDAO;
import homework.h20241024.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDAOMyBatis implements IUserDAO {
    static SqlSessionFactory sqlSessionFactory
            = MyBatisConf.buildqlSessionFactory();

    @Override
    public User getEntityById(int index) {
        try(SqlSession session = sqlSessionFactory.openSession()) {
            User user = session.selectOne("homework.h20241024.dao.getEntityById", index);
            return user;
        }
    }

    @Override
    public List<User> getEntities() {
        return null;
    }
}
