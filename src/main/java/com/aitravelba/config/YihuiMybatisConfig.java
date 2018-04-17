package com.aitravelba.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * mybatis config
 */
//@Configuration
//@MapperScan(basePackages = {"com.aitravelba.orm.yihui" }, sqlSessionFactoryRef = "sqlSessionFactory")
public class YihuiMybatisConfig{

	@Bean(name = "dataSource")
    @Qualifier(value = "dataSource")
    @Primary
    @ConfigurationProperties(prefix = "c3p0")
    public DataSource dataSource()
    {
        return DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
    }

	@Bean
	@Autowired
	public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/*.xml"));
		return bean.getObject();
	}

	@Bean
	@Autowired
	public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory)
					throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}