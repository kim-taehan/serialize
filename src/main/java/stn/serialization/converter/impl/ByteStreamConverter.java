package stn.serialization.converter.impl;

import stn.serialization.converter.Converter;

import java.io.*;
import java.util.Base64;

public class ByteStreamConverter implements Converter<byte[]> {
    @Override
    public <O> byte[] serialization(O obj) {
        try(ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try(ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(obj);
                //직렬화(byte array)
                return baos.toByteArray();
                //byte array를 base64로 변환
//                return Base64.getEncoder().encodeToString(serializedUser);
            }
        } catch (IOException e) {
            throw new RuntimeException("");
        }
    }

    @Override
    public <O> O deserialization(byte[] s, Class<O> oClass) {
        try(ByteArrayInputStream bais = new ByteArrayInputStream(s)) {
            try(ObjectInputStream ois = new ObjectInputStream(bais)) {
                //역직렬화(byte array -> object)
                return (O) ois.readObject();
            }
        } catch (Exception e) {
            throw new RuntimeException("");
        }
    }


//    @Override
//    public <O> Byte[] serialization(O obj) {

//    }
//
//    @Override
//    public <O> O deserialization(Byte[] serializedUser, Class<O> oClass) {

//    }
}
