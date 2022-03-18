import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Day43_JavaSingleton_Pattern {
    private volatile static Day43_JavaSingleton_Pattern instance;
    public static String str;
    private Day43_JavaSingleton_Pattern() {}

    static Day43_JavaSingleton_Pattern getSingleInstance() {
        if (instance == null) {
            synchronized (Day43_JavaSingleton_Pattern.class) {
                if (instance == null) {
                    instance = new Day43_JavaSingleton_Pattern();
                }
            }
        }
        return instance;
    }
}
