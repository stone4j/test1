package com.cskaoyan.mytest;

import com.cskaoyan.bean.User;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class FmTest {
    @Test
    public void mytest() throws IOException, TemplateException {
        Configuration configuration = new Configuration();
        configuration.setDefaultEncoding("utf-8");
        configuration.setDirectoryForTemplateLoading(new File("src/main/resources"));

        Template template = configuration.getTemplate("hello.ftl");

        HashMap<String, Object> datamap = new HashMap<>();
        datamap.put("content","freee marker");

        List<String> hobbys = new ArrayList<>();
        hobbys.add("sing");
        hobbys.add("jump");
        hobbys.add("rap");
        hobbys.add("basketball");
        datamap.put("hobbys",hobbys);

        User user1 = new User("songge1","zhenshuai1",25);
        User user2 = new User("songge2","zhenshuai2",26);
        User user3 = new User("songge3","zhenshuai3",27);
        User user4 = new User("songge4","zhenshuai4",28);
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        datamap.put("users",users);

        datamap.put("username","wo");

        Date date = new Date();
        datamap.put("current",date);

        FileWriter fileWriter = new FileWriter(new File("src/main/resources/hello.html"));

        template.process(datamap,fileWriter);
        fileWriter.close();
    }
}
