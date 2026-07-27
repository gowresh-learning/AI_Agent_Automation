package com.gowresh.aiagent.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gowresh.aiagent.exceptions.FrameworkException;

import java.io.File;

public class JsonReader {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T read(String fileName, Class<T> clazz) {
        try {
            String path = "src/main/resources/testdata/" + fileName;

            return mapper.readValue(
                    new File(path),
                    clazz
            );

        } catch (Exception e) {
            throw new FrameworkException(
                    "Unable to read JSON file: " + fileName,
                    e
            );
        }
    }
}
