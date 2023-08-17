package com.sudo.model;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@MappedJdbcTypes(JdbcType.VARCHAR)

public class MyDatepeHandler extends BaseTypeHandler<String> {
@Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
       preparedStatement.setString(i,s);
    }
@Override
    public String getNullableResult(ResultSet resultSet, String s) throws SQLException {
    System.out.println("=====1111122222333");
        return resultSet.getString(s).replace("2","%");
    }
@Override
    public String getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getString(i);
    }
@Override
    public String getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return callableStatement.getString(i);
    }
}
