package stn.serialization.converter.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import stn.serialization.converter.Converter;

import java.io.IOException;

public class JacksonConverter implements Converter<byte[]> {

    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <O> byte[] serialization(O obj) {
        try {

            byte[] bytes = objectMapper.writeValueAsBytes(obj);
            return bytes;
//            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <O> O deserialization(byte[] s, Class<O> oClass) {
        try {
            return (O) objectMapper.readValue(s, oClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
