package com.wiley.beginningspring.ch4;

import java.sql.SQLException;
import java.util.Date;
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

        System.out.println("*********************************************");
        // find all accounts whose owner is john doe
        List<Account> lst = accountDao.find("john doe");
        for (Account account1 : lst) {
            System.out.println(account1.getId());
            System.out.println(account1.getOwnerName());
            System.out.println(account1.getBalance());
            System.out.println(account1.getAccessTime());
            System.out.println(account1.isLocked());
        }

        System.out.println("*********************************************");
        // find all accounts with locked = false
        List<Account> lstLocked = accountDao.find(false);
        for (Account account1 : lstLocked) {
            System.out.println(account1.getId());
            System.out.println(account1.getOwnerName());
            System.out.println(account1.getBalance());
            System.out.println(account1.getAccessTime());
            System.out.println(account1.isLocked());
        }

        // inserts one account
        Account account1 = new Account();
        account1.setOwnerName("Marko Markov");
        account1.setBalance(20.0);
        account1.setAccessTime(new Date());
        account1.setLocked(false);

        accountDao.insert(account1);

        // update account1 balance, set it to 25.0
        account1.setBalance(25.0);
        accountDao.update(account1);

        // check in database to see whether account is updated


    }
}