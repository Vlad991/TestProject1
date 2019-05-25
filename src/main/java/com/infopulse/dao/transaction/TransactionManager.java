package com.infopulse.dao.transaction;

import javax.sql.DataSource;
import java.sql.Connection;

public class TransactionManager {
    private ThreadLocal<Connection> connections = new ThreadLocal<>();

    private TransactionManager() {}

    private static DataSource dataSource;  //стандартный пул, мы пигем свой!!!!!
    
}
