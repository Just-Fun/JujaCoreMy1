package ua.com.juja.sqlcmd.myOld;

import java.util.Arrays;

/**
 * Created by serzh on 1/4/16.
 */
public class DataSetMy {

    static class Data {
        private String name;
        private Object value;

        public String getName() {
            return name;
        }

        public Object getValue() {
            return value;
        }

        public Data(String name, Object value) {
            this.name = name;
            this.value = value;
        }
    }


    public Data[] data = new Data[100];
    public int index = 0;

    public void put(String name, Object value) {
        data[index++] = new Data(name, value);
    }

    public Object[] getValue() {
        Object[] result = new Object[index];
        for (int i = 0; i < index; i++) {
            result[i] = data[i].getValue();
        }
        return result;
    }

    public String[] getNames() {
        String[] result = new String[index];
        for (int i = 0; i < index; i++) {
            ;
            result[i] = data[i].getName();
        }
        return result;
    }

    @Override
    public String toString() {
        return "DataSetMy{\n" +
                "names:" + Arrays.toString(getNames()) + "\n" +
                "values:" + Arrays.toString(getValue()) + "\n" +

        "}";
    }
}