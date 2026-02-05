package jsp_server_project1_test.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class _1_ConnectTests {
    @Test
    public void testHikariCP() throws Exception {
        // HikariConfig 클래스 이용해서 기본 옵션 설정
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.mariadb.jdbc.Ddriver");
        config.setJdbcUrl("jdbc:mariadb://localhost:3306/webdb");
        config.setUsername("webuser");
        config.setPassword("webuser");

        // PreparedStatement 캐시 설정
        // PreparedStatement 캐싱 기능 활성화 기본 옵션
        config.addDataSourceProperty("cachePrepStmts", "true");
        // 각 Connection당 캐시할 수 있는 PreparedStatement의 최대 개수
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        // 캐시할 수 있는 SQL 문의 최대 길이(문자 수)
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        //HikariDataSource 클래스에 위의 설정 클래스 담기
        HikariDataSource ds = new HikariDataSource(config);
        // 연결 커넥션 이용해서 확인
        Connection connection = ds.getConnection();

        // 해당 connection 여부 확인
        System.out.println(connection);

        connection.close();
    }
}
