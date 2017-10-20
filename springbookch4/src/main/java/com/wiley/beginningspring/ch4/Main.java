package com.wiley.beginningspring.ch4;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Ch4Configuration.class);

        AccountDao accountDao = applicationContext.getBean(AccountDao.class);

        Account account= accountDao.find(100L);
        System.out.println(account.getId());
        System.out.println(account.getOwnerName());
        System.out.println(account.getBalance());
        System.out.println(account.getAccessTime());
        System.out.println(account.isLocked());

/*
        account = accountDao.find("john doe").get(0); // first from list
        System.out.println(account.getId());
        System.out.println(account.getOwnerName());
        System.out.println(account.getBalance());
        System.out.println(account.getAccessTime());
        System.out.println(account.isLocked());
*/

        List<Account> lst = accountDao.find("john doe");
        for (Account account1 : lst) {
            System.out.println(account1.getId());
            System.out.println(account1.getOwnerName());
            System.out.println(account1.getBalance());
            System.out.println(account1.getAccessTime());
            System.out.println(account1.isLocked());
        }

    }
}