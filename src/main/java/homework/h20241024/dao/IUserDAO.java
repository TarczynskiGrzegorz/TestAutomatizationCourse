package homework.h20241024.dao;

import homework.h20241024.model.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDAO extends IBaseDAO<User> {
    @Select(
            "select * from mydb.user where id = #{index}")
    @Results(value = {
            @Result(property="id", column = "id"),
            @Result(property="name", column = "name"),
            @Result(property="surname", column = "surname"),
            @Result(property="email", column = "email")
    })
    @Override
    User getEntityById(int index);

    @Override
    List<User> getEntities();
}
