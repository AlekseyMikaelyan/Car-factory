package org.example.carfactory.building.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class BundleUtil {
    private static final ResourceBundle RESOURCE_CARS = ResourceBundle.getBundle("cars");

    public static Map<String, String> getBundleProperties() {
        return convertResourceBundleToMap(RESOURCE_CARS);
    }

    private static Map<String, String> convertResourceBundleToMap(ResourceBundle resource) {
        Map<String, String> map = new HashMap<String, String>();
        Enumeration<String> keys = resource.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            map.put(key, resource.getString(key));
        }
        return map;
    }
}
