package ua.com.juja.sqlcmd;

/**
 * Created by serzh on 1/4/16.
 */
public class DataSet {

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
}
