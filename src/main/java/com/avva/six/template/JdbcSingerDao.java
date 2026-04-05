package com.avva.six.template;

import com.avva.six.QueryConstants;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcSingerDao implements SingerDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public String findNameById(Long id) {
        return jdbcTemplate.queryForObject(QueryConstants.PARAMETRIZED_FIND_NAME, String.class, id);
    }
}
