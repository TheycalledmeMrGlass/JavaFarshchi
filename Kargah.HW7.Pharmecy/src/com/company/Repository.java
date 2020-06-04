package com.company;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mypeople","myjava123");
        connection.setAutoCommit(false);
    }
    public void insert(Entity entity)throws Exception{
        preparedStatement=connection.prepareStatement("insert into drugs(id,name,price,category)values (?,?,?,?)");
        preparedStatement.setInt(1,entity.getId());
        preparedStatement.setString(2,entity.getName());
        preparedStatement.setString(3,entity.getPrice());
        preparedStatement.setString(4,entity.getCategory());
        preparedStatement.executeUpdate();
    }
    public void update(Entity entity)throws Exception{
        preparedStatement=connection.prepareStatement("update drugs set name=?, price=?, category=?, where id=?");
        preparedStatement.setString(1,entity.getName());
        preparedStatement.setString(2,entity.getPrice());
        preparedStatement.setString(3,entity.getCategory());
        preparedStatement.setInt(4,entity.getId());
        preparedStatement.executeUpdate();
    }
    public void delete(int id)throws Exception{
        preparedStatement=connection.prepareStatement("delete from drugs where id=?");
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();
    }
    public List<Entity> select()throws Exception{
        preparedStatement=connection.prepareStatement("select * from drugs");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<Entity>entityList=new ArrayList<>();
        while (resultSet.next()){
            Entity entity=new Entity();
            entity.setId(resultSet.getInt("id"));
            entity.setName(resultSet.getString("name"));
            entity.setPrice(resultSet.getString("price"));
            entity.setCategory(resultSet.getString("category"));
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
    @Override
    public void close()throws Exception{
        preparedStatement.close();
        connection.close();
    }
}

