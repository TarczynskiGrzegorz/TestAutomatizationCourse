package homework.h20241024;

import homework.h20241024.dao.jdbc.UserDAOJDBC;
import homework.h20241024.model.User;

import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        //jdbc
        UserDAOJDBC userDAOJDBC = new UserDAOJDBC();
        User user = userDAOJDBC.getEntityById(1);
        System.out.println(user.toString());
        //mybatis
    }
}
