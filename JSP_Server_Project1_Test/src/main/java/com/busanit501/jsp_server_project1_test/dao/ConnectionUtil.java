package com.busanit501.jsp_server_project1_test.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;

@Log4j2
public enum ConnectionUtil {

    INSTANCE;

    private HikariDataSource ds;

    ConnectionUtil() {
        // HikariConfig 클래스를 이용하여 옵션 설정
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.mariadb.jdbc.Driver");
        config.setJdbcUrl("jdbc:mariadb://localhost:3306/webdb");
        config.setUsername("webuser");
        config.setPassword("webuser");

        // PreparedStatement 캐시 설정
        // PreparedStatement의 캐싱 설정 활성화하는 기본 옵션
        config.addDataSourceProperty("cachePrepStmts", "true");
        // 각 Connection당 할 수 있는 PreparedStatement의 최대 갯수
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        // 캐시할 수 있는 SQL문의 최대 길이(문자 수)
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        // HikariDataSource에 위의 설정 클래스 담기
        ds = new HikariDataSource(config);
    }

    public Connection getConnection() throws Exception {
        return ds.getConnection();
    }

    // 닫는 매서드
    public void closePool() {
        if (ds != null && !ds.isClosed()) {
            ds.close();
            log.info("HikariCP 커넥션 풀을 종료함.");
        }
    }
}
