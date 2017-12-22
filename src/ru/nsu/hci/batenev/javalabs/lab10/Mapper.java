package ru.nsu.hci.batenev.javalabs.lab10;

import java.lang.reflect.Field;

public class Mapper<TSource, TDestination> {
    private Class<TDestination> tDestinationClass;

    public Mapper(Class<TDestination> TDestinationClass) {
        this.tDestinationClass = TDestinationClass;
    }

    public TDestination map(TSource obj) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        TDestination result = tDestinationClass.newInstance();
        for (Field field: obj.getClass().getFields()) {
            String fieldName = field.getName();
            Object object = field.get(obj);
            Field destinationField = tDestinationClass.getField(fieldName);
            destinationField.set(result, object);
        }
        return result;
    }
}
