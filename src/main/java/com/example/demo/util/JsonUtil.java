package com.example.demo.util;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;

import lombok.extern.slf4j.Slf4j;

/**
 * @author songdexu
 * @date 2019/5/30
 */
@Slf4j
public class JsonUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String objectToJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error("序列号异常", e);
        }
        return null;
    }

    public static <T> T jsonToObject(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (IOException e) {
            log.error("反序列号异常", e);
        }
        return null;
    }

    public static <T> List<T> jsonToList(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, new TypeReference<List<T>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String json = "[{\"id\":1},{\"id\":2}]";
        List<Map> list = jsonToList(json, Map.class);
        list.stream().forEach(map -> {
            System.out.println(map);
        });
    }
}
