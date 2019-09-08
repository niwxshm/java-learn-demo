package com.lizs.mybatis.typehandler;

import com.lizs.mybatis.Config;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedJdbcTypes(JdbcType.TINYINT)
public class GenderTypeHandler extends BaseTypeHandler<String> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
        Config.Language language = Config.getLanguage();
        switch (language) {
            case EN:
                setEnString(preparedStatement, i, s);
            case ZH:
                setCnString(preparedStatement, i, s);
            default:
                setEnString(preparedStatement, i, s);
        }
    }

    private void setCnString(PreparedStatement preparedStatement, int i, String s) throws SQLException {
        if(s.equals("woman")){
            preparedStatement.setInt(i,2);
        }else{
            preparedStatement.setInt(i,1);
        }
    }

    private void setEnString(PreparedStatement preparedStatement, int i, String s) throws SQLException {
        if(s.equals("女")){
            preparedStatement.setInt(i,2);
        }else{
            preparedStatement.setInt(i,1);
        }
    }

    @Override
    public String getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int gender = resultSet.getInt(s);
        return getString(gender);

    }

    @Override
    public String getNullableResult(ResultSet resultSet, int i) throws SQLException {
        int gender = resultSet.getInt(i);
        return getString(gender);
    }

    @Override
    public String getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        int gender = callableStatement.getInt(i);
        return getString(gender);
    }

    private String getString(int gender) {
        Config.Language language = Config.getLanguage();
        switch (language) {
            case EN:
                return gender == 2 ? "woman" : "man";
            case ZH:
                return gender == 2 ? "女" : "男";
            default:
                return gender == 2 ? "女" : "男";
        }
    }
}
