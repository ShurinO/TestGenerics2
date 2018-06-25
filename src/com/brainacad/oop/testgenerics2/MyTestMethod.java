package com.brainacad.oop.testgenerics2;

public class MyTestMethod {
    public static <T extends Number> long calcNum(T[] array, T maxElem){
        long res = 0;
        for (T t : array) {
            if (t.doubleValue()>maxElem.doubleValue()){
                res++;
            }
        }
        return res;
    }

    public static <T extends Number> Number calcSum(T[] array, T maxValue){
        //так как в классе Number нет возможности проводить математические операции и возвращать числа в требуемом формате,
        // то просто проверяем к какому классу реально относится T и уже с ним работаем и его возвращаем
        switch (maxValue.getClass().getSimpleName()){
            case "Double":
                Double res = (double) 0;
                for (T t : array) {
                    if (t.doubleValue()>maxValue.doubleValue()){
                        res+=t.doubleValue();
                    }
                }
                return res;
            case "Integer":
                Integer res2 = 0;
                for (T t : array) {
                    if (t.intValue()>maxValue.intValue()){
                        res2+=t.intValue();
                    }
                }
                return res2;
            case "Short":
                Short res3 = 0;
                for (T t : array) {
                    if (t.shortValue()>maxValue.shortValue()){

                        res3 = (short)(t.shortValue()+res3);
                    }
                }
                return res3;
            case "Byte":
                Byte res4 = 0;
                for (T t : array) {
                    if (t.byteValue()>maxValue.byteValue()){

                        res4 = (byte)(t.byteValue()+res4);
                    }
                }
                return res4;
            case "Long":
                Long res5 = 0L;
                for (T t : array) {
                    if (t.longValue()>maxValue.longValue()){
                        res5+=t.longValue();
                    }
                }
                return res5;
            case "Float":
                Float res6 = 0f;
                for (T t : array) {
                    if (t.floatValue()>maxValue.floatValue()){
                        res6+=t.floatValue();
                    }
                }
                return res6;
        }
        return (double) 0;
    }
}
