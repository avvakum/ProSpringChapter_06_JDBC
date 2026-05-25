package com.avva.six.config;

import org.jspecify.annotations.Nullable;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DeadlockLoserDataAccessException;
import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;

import java.sql.SQLException;

public class MariaDBErrorCodesTranslator extends SQLErrorCodeSQLExceptionTranslator {

    @Override
    public DataAccessException customTranslate(String task, String sql, SQLException sqlex) {
        if(sqlex.getErrorCode() == -12345) {
            return new DeadlockLoserDataAccessException(task, sqlex);
        }
        return null;
    }
}
