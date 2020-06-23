package com.company;
import java.util.*;
import java.sql.*;
public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","newFarzad","myjava123");
        connection.setAutoCommit(false);
    }
    public void insert(Entity entity)throws Exception{
preparedStatement=connection.prepareStatement("insert into products(id,name,price,category)values (?,?,?,?)");
preparedStatement.setInt(1,entity.getId());
preparedStatement.setString(2,entity.getName());
preparedStatement.setString(3,entity.getPrice());
preparedStatement.setString(4,entity.getCategory());
preparedStatement.executeUpdate();
    }
    public List<Entity> select()throws Exception{
        preparedStatement=connection.prepareStatement("select * from products");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<Entity>entityList=new ArrayList<>();
        while(resultSet.next()){
            Entity entity=new Entity();
            entity.setId(resultSet.getInt("id"));
            entity.setName(resultSet.getString("name"));
            entity.setPrice(resultSet.getString("Price"));
            entity.setCategory(resultSet.getString("Category"));
            entityList.add(entity);
        }
        return entityList;
    }
    public void commit()throws Exception{
        connection.commit();
    }
    public void rollback()throws Exception{
        connection.rollback();
    }
    public void close()throws Exception{
        preparedStatement.close();
        connection.close();
    }

}
