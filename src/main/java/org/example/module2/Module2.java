package org.example.module2;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Module2 {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        URLClassLoader loader = new URLClassLoader(new URL[]{new URL("file:G:\\Projects\\Java\\java_core\\out\\example.jar")});
        ForJAR forJAR = (ForJAR) Class.forName("org.example.module2.ForJAR", true, loader).newInstance();

    }
}
