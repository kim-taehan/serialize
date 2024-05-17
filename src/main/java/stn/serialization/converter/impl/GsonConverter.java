package stn.serialization.converter.impl;

import com.google.gson.Gson;
import stn.serialization.converter.Converter;

public class GsonConverter implements Converter<String> {
    private final Gson gson = new Gson();

    @Override
    public <O> String serialization(O obj) {
        return gson.toJson(obj);
    }

    @Override
    public <O> O deserialization(String s, Class<O> oClass) {
        return gson.fromJson(s, oClass);
    }
}
