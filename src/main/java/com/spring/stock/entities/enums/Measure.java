package com.spring.stock.entities.enums;

public enum Measure {

    QUILOGRAMA(1),
    GRAMA(2),
    MILIGRAMA(3),
    QUIILOLITRO(4),
    LITRO(5),
    MILILITRO(6);

    private int code;

    private Measure(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static Measure valueOf(int code){
        for(Measure value : Measure.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Não existe essa medida de peso!");
    }
}