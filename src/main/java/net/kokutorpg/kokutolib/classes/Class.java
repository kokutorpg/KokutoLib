package net.kokutorpg.kokutolib.classes;

import net.kokutorpg.kokutolib.classes.skills.ClassSkill;

//職業
public interface Class {
    Class registerClassSkill(ClassSkill s);
}
