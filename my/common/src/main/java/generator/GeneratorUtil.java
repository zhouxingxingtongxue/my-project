package generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/14.
 */
public class GeneratorUtil {

    public static void main(String[] args) throws Exception {
        try {
            GeneratorUtil myGenerator = new GeneratorUtil();
            myGenerator.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void generator() throws Exception{

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定逆向工程配置文件
        File configFile = new File(GeneratorUtil.class.getResource("/").getPath() + "mybatis-generator.xml");

        //System.out.println(GeneratorUtil.class.getResource("/"));
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);

    }

}
