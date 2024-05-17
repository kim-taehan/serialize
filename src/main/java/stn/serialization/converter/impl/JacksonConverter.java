package stn.serialization.converter.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import stn.serialization.converter.Converter;

public class JacksonConverter implements Converter<String> {

    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <O> String serialization(O obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <O> O deserialization(String s, Class<O> oClass) {
        try {
            return (O) objectMapper.readValue(s, oClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
