package ua.com.juja.InputOutput.Lab45;

import java.io.*;

/**
 * Created by serzh on 12.02.16.
 */

public class ByteFilter {
    public static void main(String[] args) throws IOException {
//        System.out.println();
        final byte[] DATA = {
                1, 0, 0, 2, 34, 5, 6, 7, 78, 8, 9, 0, 2, 3, 5, 6, 7, 7
        };
        final int BUFF_LEN = 4;
        final byte FILTER_CRITERIA = 0;

        byte[] actualOutData = null;

        ByteArrayInputStream dataInputStream = new ByteArrayInputStream(DATA);

        ByteArrayOutputStream dataOutputStream = new ByteArrayOutputStream();
        ByteFilter.filter(dataInputStream, dataOutputStream, BUFF_LEN, FILTER_CRITERIA);
    }

    public static void filter(InputStream src, OutputStream dst, int bufferSize, byte filterCriteria) throws IOException {

        byte[] buffer = new byte[bufferSize];
        int begin = 0;
        int size = 0;
        while (src.read(buffer) != -1) {

                for (int i = 0; i < bufferSize; i++) {
                    if (buffer[i] == filterCriteria) {
                        if (size > 0 && begin < i) {
                            dst.write(buffer, begin, size);
                            begin += size;
                            size = 0;
                        }
                        begin += 1;
                    } else {
                        size += 1;

                        if (i == (bufferSize - 1)) {
                            dst.write(buffer, begin, size);
                            size = 0;
                            begin = 0;
                        }
                    }
                    if (i == bufferSize - 1) {
                        size = 0;
                        begin = 0;
                    }
            }
            buffer = new byte[bufferSize];
        }
    }
}

