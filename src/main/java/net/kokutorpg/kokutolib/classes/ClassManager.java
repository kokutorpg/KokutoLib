package net.kokutorpg.kokutolib.classes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassManager {

    public static Set<Class> classes = new HashSet<>();

    public static void registerClass(Class c){
        classes.add(c);
    }
}
