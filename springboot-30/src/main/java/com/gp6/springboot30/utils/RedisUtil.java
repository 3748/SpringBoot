package com.gp6.springboot30.utils;

import com.gp6.springboot30.enums.RedisKeyEnum;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Redis工具类
 *
 * @author gp6
 * @date 2018-12-28
 */
public class RedisUtil {
    private RedisTemplate<String, Object> redisTemplate;

    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 执行set操作
     *
     * @param redisKeyEnum Redis中的key枚举
     * @param value        Redis中的key
     * @return boolean
     */
    public boolean set(RedisKeyEnum redisKeyEnum, String value) {
        try {
            redisTemplate.opsForValue().set(redisKeyEnum.getKey(), value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 执行set操作并且设置生存时间，单位为：秒
     *
     * @param redisKeyEnum Redis中的key枚举
     * @param value        Redis中的value
     * @param seconds      有效时间
     * @return boolean
     */
    public boolean set(RedisKeyEnum redisKeyEnum, String value, Integer seconds) {
        try {
            if (seconds > 0) {
                redisTemplate.opsForValue().set(redisKeyEnum.getKey(), value, seconds, TimeUnit.SECONDS);
            } else {
                set(redisKeyEnum, value);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 执行get操作
     *
     * @param redisKeyEnum Redis中的key枚举
     * @return String
     */
    public String get(RedisKeyEnum redisKeyEnum) {
        return Objects.requireNonNull(redisTemplate.opsForValue().get(redisKeyEnum.getKey())).toString();
    }

    /**
     * 执行删除操作
     *
     * @param redisKeyEnum Redis中的key枚举
     * @return boolean
     */
    public boolean delete(RedisKeyEnum redisKeyEnum) {
        return redisTemplate.delete(redisKeyEnum.getKey());
    }

    /**
     * 设置生存时间，单位为：秒
     *
     * @param redisKeyEnum Redis中的key枚举
     * @param seconds 生存时间
     * @return boolean
     */
    public boolean expire(RedisKeyEnum redisKeyEnum, Integer seconds) {
        try {
            if (seconds > 0) {
                redisTemplate.expire(redisKeyEnum.getKey(), seconds, TimeUnit.SECONDS);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

