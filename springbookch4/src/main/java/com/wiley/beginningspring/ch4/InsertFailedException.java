package com.wiley.beginningspring.ch4;

/**
 * Created by Win10 on 10/20/2017.
 */
import org.springframework.dao.DataAccessException;

public class InsertFailedException extends DataAccessException{
    public InsertFailedException(String msg) {
        super(msg);
    }
}
