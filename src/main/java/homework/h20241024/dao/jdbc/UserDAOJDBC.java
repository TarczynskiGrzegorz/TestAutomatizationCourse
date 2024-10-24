package homework.h20241024.dao.jdbc;

import homework.h20241024.dao.ConnectionPool;
import homework.h20241024.dao.IStudentDAO;
import homework.h20241024.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDAOJDBC implements IStudentDAO {
    private static final String READ_USER_QUERY = "SELECT * FROM mydb.user where id = ?";


    @Override
    public User getEntityById(int index) {
        User user = new User();

        try(Connection connection = ConnectionPool.getConnection();){
            PreparedStatement preparedStatement = connection.prepareStatement(READ_USER_QUERY);
            preparedStatement.setInt(1,index);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setSurname(resultSet.getString("surname"));
                user.setEmail(resultSet.getString("email"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            return user;
        }

    }

    @Override
    public List<User> getEntities() {
        return null;
    }
}
