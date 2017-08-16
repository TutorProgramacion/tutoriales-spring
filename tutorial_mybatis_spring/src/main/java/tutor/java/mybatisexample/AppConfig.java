package tutor.java.mybatisexample;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@MapperScan("tutor.java.mybatisexample.data")
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("sampledata.sql")
                .build();
        
//        PooledDataSource pds = new PooledDataSource();
//        pds.setDriver("org.hsqldb.jdbcDriver");
//        pds.setUrl("jdbc:hsqldb:hsql://localhost/");
//        pds.setUsername("SA");
//        pds.setPassword("");
//        
//        return pds;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }
}
