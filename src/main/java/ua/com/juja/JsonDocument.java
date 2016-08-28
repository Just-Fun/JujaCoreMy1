// ============================================================================
//  File          : JsonDocument
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package ua.com.juja;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class JsonDocument {
    private final String name;
    private final Map<String, String> fields = new LinkedHashMap<>();

    public JsonDocument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addField(String name, String value) {
        fields.put(name, value);
    }

    @Override
    public String toString() {
        return fields.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .collect(Collectors.joining(",\n", "{\n", "\n}"));
    }
}
