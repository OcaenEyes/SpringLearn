package com.gzy.spring_transaction_test.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

    /**
     * 根据用户名减少金额
     * @param outer 汇款人
     * @param money 汇款金额
     */
    @Override
    public void out(String outer, int money) {
        String sql = "UPDATE account SET money = money -? WHERE username = ?";
        this.getJdbcTemplate().update(sql,money,outer);
    }

    /**
     * 根据用户名增加金额
     * @param inner 收款人
     * @param money 收款金额
     */
    @Override
    public void in(String inner, int money) {
        String sql = "UPDATE account SET money = money + ? WHERE username = ?";
        this.getJdbcTemplate().update(sql,money,inner);
    }
}
