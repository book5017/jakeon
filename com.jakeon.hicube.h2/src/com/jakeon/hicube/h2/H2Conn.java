package com.jakeon.hicube.h2;

import java.sql.Connection;
import java.sql.DriverManager;

public class H2Conn {

	public static void main(String[] args) throws Exception{
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:file:./data/sample", "sa", "1212");
        // add application code here
        conn.close();
	}

}
