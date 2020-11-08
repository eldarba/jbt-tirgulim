package coupons.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ConnectionPool {

	private Set<Connection> set = new HashSet<>();

	private String url = "";

	public ConnectionPool() throws Exception {
		for (int i = 0; i < 10; i++) {
			try {
				set.add(DriverManager.getConnection(url));
			} catch (SQLException e) {
				throw new Exception("ConnectionPool int failed", e);
			}
		}
	}

	public synchronized void restoreConnection(Connection con) {
		set.add(con);
		notify();
	}

}
