package com.wiley.beginningspring.ch4;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDaoJdbcImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(Account account) {

    }

    public void update(Account account) {

    }

    public void update(List<Account> accounts) {

    }

    public void delete(long accountId) {

    }

    public Account find(long accountId) {
        return null;
    }

    public List<Account> find(List<Long> accountIds) {
        return null;
    }

    public List<Account> find(String ownerName) {
        return null;
    }

    public List<Account> find(boolean locked) {
        return null;
    }
}
