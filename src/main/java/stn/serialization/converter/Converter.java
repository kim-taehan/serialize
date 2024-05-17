package stn.serialization.converter;

public interface Converter<I> {

    <O> I serialization(O obj);

    <O> O deserialization(I s, Class<O> oClass);
}
