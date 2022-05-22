package main.java.XML;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import org.w3c.dom.Attr;

import javax.print.Doc;
import java.io.InputStream;
import java.util.List;

/**
 * dom4J解析xml文件
 * 导包步骤
 * 下载Dom4J框架，官网下载
 * 在项目中创建一个文件夹：lib
 * 将dom4j-2.1.1.jar文件复制到lib文件夹
 * 在jar文件上右键，选择 Add as Library ->ok
 * 在类中导包使用
 * dom4j解析
 * 构造器
 * SAXReader()：创建Dom4j的解析器对象
 * read(String url)：加载XML文件称为Document对象
 * 方法：
 * getRootElement():获得根元素对象
 * 解析步骤
 * 创建Dom4J解析器对象，代表整个dom4j框架
 * 把 XML 文件加载到内存中称为一个Document文档对象
 * 注意：使用getResourceAsStream()获取文件对象(直接根据文件名在src下查询文件)，解决文件路径名改变找不到文件的问题
 * InputStream is = 类名.Class.getResourceAsStream("1.xml")
 * 获取根元素对象
 * Element root = Document.getRootElement();
 * 解析XML的元素、属性、文本
 * 方法
 * elements():得到当前元素下的所有子元素
 * elements(String name)：得到当前元素下指定名字的元素返回集合
 * element(String name)：得到当前元素下指定名字的子元素，如果有很多名字相同的返回第一个
 * getName()：得到元素名字
 * attributeValue(String name)：通过属性名直接得到属性值
 * attribute("元素名")：根据元素名得到属性值
 * elementText(子元素名)：得到指定名称的子元素的文本
 * elementTextTrim(子元素名)：得到指定名称的子元素的文本,并去空格
 * getText()：得到文本
 */
public class Dom4JDemo {
    @Test
    public void dom4Js() throws Exception {
        //创建Dom4J解析器对象
        SAXReader saxReader = new SAXReader();
        //创建XML文件对象
        //通过getResourceAsStream()获取文件对象
        InputStream is = Dom4JDemo.class.getResourceAsStream("/Contacts.xml");
        Document dm = saxReader.read(is);
//        Document dm = saxReader.read("E:\\Git\\java\\src\\logback.xml");
        //获取根元素对象
        Element rootEl = dm.getRootElement();
        System.out.println(rootEl.getName());

        // 获取根元素的所有子元素
        List<Element> element = rootEl.elements();
        for (Element element1 : element) {
            System.out.println(element1.getName());
        }
        //获取根元素下的某一个子元素，有多个相同的那第一个
        Element elementOne = rootEl.element("contact");
        System.out.println(elementOne.getName());

        //根据属性名字，获取元素属性
        Attribute attribute = elementOne.attribute("id");
        System.out.println(attribute.getName() +"=" + attribute.getValue());
        //根据属性名字直接获属性值
        String id = elementOne.attributeValue("id");
        System.out.println(id);

        //根据元素名字，获取元素内容
        String name = elementOne.elementText("name");
        //去空格
        String name1 = elementOne.elementTextTrim("name");
        System.out.println(name);
        System.out.println(name1);
    }
}
