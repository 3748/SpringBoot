package com.gp6.springboot30.config;

import com.gp6.springboot30.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Redis配置
 *
 * @author gp6
 * @date 2018-12-28
 */
@Configuration
@PropertySource("classpath:/application.yml")
public class RedisConfig {


    @Value("${spring.redis.host}")
    private String redisHost;

    @Value("${spring.redis.port}")
    private Integer redisPort;

    @Value("${spring.redis.timeout}")
    private Integer redisTimeout;

    @Value("${spring.redis.jedis.pool.max-active}")
    private Integer jedisPoolMaxActive;

    @Value("${spring.redis.jedis.pool.max-wait}")
    private Integer jedisPoolMaxWait;

    @Value("${spring.redis.jedis.pool.min-idle}")
    private Integer jedisPoolMinIdle;

    @Value("${spring.redis.jedis.pool.max-idle}")
    private Integer jedisPoolMaxIdle;

    /**
     * Jedis连接池配置
     *
     * @return JedisPoolConfig
     */
    @Bean
    public JedisPoolConfig jedisPoolConfig() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        // 最大空闲数
        jedisPoolConfig.setMaxIdle(jedisPoolMaxIdle);
        // 连接池的最大数据库连接数
        jedisPoolConfig.setMaxTotal(jedisPoolMaxActive);
        // 最大建立连接等待时间
        jedisPoolConfig.setMaxWaitMillis(jedisPoolMaxWait);
        return jedisPoolConfig;
    }

    /**
     * jedis连接工厂
     *
     * @param jedisPoolConfig Jedis连接池配置
     * @return RedisConnectionFactory
     */
    @Bean
    public RedisConnectionFactory redisConnectionFactory(JedisPoolConfig jedisPoolConfig) {
        // 单台redis
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
        // IP地址
        redisStandaloneConfiguration.setHostName(redisHost);
        // 端口号
        redisStandaloneConfiguration.setPort(redisPort);
        // 默认使用的数据库
        redisStandaloneConfiguration.setDatabase(0);
        // 密码
        // redisStandaloneConfiguration.setPassword(password);

        JedisClientConfiguration.JedisPoolingClientConfigurationBuilder jpcb = (JedisClientConfiguration.JedisPoolingClientConfigurationBuilder) JedisClientConfiguration.builder();

        jpcb.poolConfig(jedisPoolConfig);
        JedisClientConfiguration jedisClientConfiguration = jpcb.build();
        return new JedisConnectionFactory(redisStandaloneConfiguration, jedisClientConfiguration);
    }

    /**
     * @param redisConnectionFactory redis连接工厂
     * @return RedisTemplate
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        initRedisTemplate(redisTemplate, redisConnectionFactory);
        return redisTemplate;
    }

    /**
     * 设置数据存入 redis 的序列化方式,并开启事务
     *
     * @param redisTemplate 模板
     * @param factory       redis连接工厂
     */
    private void initRedisTemplate(RedisTemplate<String, Object> redisTemplate, RedisConnectionFactory factory) {
        // 开启事务
        redisTemplate.setEnableTransactionSupport(true);
        redisTemplate.setConnectionFactory(factory);
    }

    /**
     * @param redisTemplate 模板
     * @return RedisUtil
     */
    @Bean(name = "redisUtil")
    public RedisUtil redisUtil(RedisTemplate<String, Object> redisTemplate) {
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.setRedisTemplate(redisTemplate);
        return redisUtil;
    }
}
