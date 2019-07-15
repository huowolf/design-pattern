package com.huowolf.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;

/**
 * @author huowolf
 * @date 2019/7/11
 * @description
 */
public class XMLUtil {

    /**
     * 该方法用于从XML文件中提取具体类类名，并返回一个对象实例
     * @return
     */
    public static Object getBean() {

        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();

            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream is = classloader.getResourceAsStream("config.xml");
            Document document = builder.parse(is);

            NodeList nodeList = document.getElementsByTagName("className");
            Node node = nodeList.item(0).getFirstChild();
            String className = node.getNodeValue();

            Class c = Class.forName(className);
            Object obj = c.newInstance();
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
