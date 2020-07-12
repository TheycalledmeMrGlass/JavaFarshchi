package com.company;
import java.util.*;
import java.sql.*;
public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Driving","myjava123");
        connection.setAutoCommit(false);

    }
    public void insert(Entity entity)throws Exception{

        preparedStatement = connection.prepareStatement("insert into Violation (id, model, pelak, takhalof) values (?,?,?,?)");
        preparedStatement.setInt(1, entity.getId());
        preparedStatement.setString(2, entity.getModel());
        preparedStatement.setString(3, entity.getPelak());
        preparedStatement.setString(4, entity.getTakhalof());
        preparedStatement.executeUpdate();
    }
    public void edit(Entity entity)throws Exception{
preparedStatement=connection.prepareStatement("update Violation set model=?, pelak=?, takhalof=?, where id=?");
preparedStatement.setInt(1,entity.getId());
preparedStatement.setString(2,entity.getModel());
preparedStatement.setString(3,entity.getPelak());
preparedStatement.setString(4,entity.getTakhalof());
preparedStatement.executeUpdate();
    }
    public void delete(int id)throws Exception{
        preparedStatement=connection.prepareStatement("DELETE FROM Violation where id=?");
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();
    }
    public void commit() throws Exception {
        connection.commit ();
    }
    public void rollback() throws Exception {
        connection.rollback ();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
