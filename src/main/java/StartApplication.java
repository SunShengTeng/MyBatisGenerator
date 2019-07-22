import org.mybatis.generator.api.ShellRunner;

/**
 * @ClassName StartApplication
 * @Description TODO
 * @Author shengtengsun
 * @Date 2019-07-22 17:55
 * @Version 1.0
 **/
public class StartApplication {
    public static void main(String[] args) {
        args = new String[] { "-configfile", "/Users/shengtengsun/JavaProjects/IdeaProjects/Studys/Generator/src/main/resources/mybatis-generator-config.xml", "-overwrite" };
        ShellRunner.main(args);

    }

}