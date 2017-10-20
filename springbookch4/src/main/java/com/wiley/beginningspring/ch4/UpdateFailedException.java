package com.wiley.beginningspring.ch4;

import org.springframework.dao.DataAccessException;

/**
 * Created by Win10 on 10/20/2017.
 */
public class UpdateFailedException extends DataAccessException {
    public UpdateFailedException(String msg) {
        super(msg);
    }
}
