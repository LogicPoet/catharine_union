package com.catharine.ops.launch;

import com.catharine.ops.support.BladeCodeGenerator;

/**
 * @author LZ
 * @date 2020/4/2 18:06
 **/
public class CodeGenerator {

    /**
     * 代码生成的模块名
     */
    public static String CODE_NAME = "授权服务";
    /**
     * 代码所在服务名
     */
    public static String SERVICE_NAME = "catharine-auth";
    /**
     * 代码生成的包名
     */
    public static String PACKAGE_NAME = "com.catharine.auth";
    /**
     * 前端代码生成所属系统
     */
    public static String SYSTEM_NAME = "sword";
    /**
     * 代码后端生成的地址《项目名》
     */
    public static String PACKAGE_DIR = "catharine-ops-code";
    /**
     * 前端代码生成地址
     */
    public static String PACKAGE_WEB_DIR = "/Users/chill/Workspaces/product/Sword";
    /**
     * 需要去掉的表前缀
     */
    public static String[] TABLE_PREFIX = {};
    /**
     * 需要生成的表名(两者只能取其一)
     */
    public static String[] INCLUDE_TABLES = {"cat_staff","","cat_menu","cat_role","cat_role_menu"};
    /**
     * 需要排除的表名(两者只能取其一)
     */
    public static String[] EXCLUDE_TABLES = {};
    /**
     * 是否包含基础业务字段
     */
    public static Boolean HAS_SUPER_ENTITY = Boolean.FALSE;
    /**
     * 基础业务字段
     */
    public static String[] SUPER_ENTITY_COLUMNS = {"create_time", "create_user", "update_time", "update_user", "is_deleted"};
    /**
     * 逻辑删除字段
     */
    public static String LOGIC_DELETE_FIELD_NAME="is_deleted";

    /**
     * RUN THIS
     */
    public static void main(String[] args) {
        BladeCodeGenerator generator = new BladeCodeGenerator();
        generator.setCodeName(CODE_NAME);
        generator.setServiceName(SERVICE_NAME);
        generator.setSystemName(SYSTEM_NAME);
        generator.setPackageName(PACKAGE_NAME);
        //generator.setPackageWebDir(PACKAGE_WEB_DIR);
        generator.setPackageDir(PACKAGE_DIR);
        generator.setTablePrefix(TABLE_PREFIX);
        generator.setIncludeTables(INCLUDE_TABLES);
        generator.setExcludeTables(EXCLUDE_TABLES);
        generator.setHasSuperEntity(HAS_SUPER_ENTITY);
        generator.setSuperEntityColumns(SUPER_ENTITY_COLUMNS);
        generator.setLogicDeleteFieldName(LOGIC_DELETE_FIELD_NAME);
        generator.setUrl("jdbc:mysql://127.0.0.1:3306/cat_dev?useSSL=false&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&transformedBitIsBoolean=true&tinyInt1isBit=false&allowMultiQueries=true&serverTimezone=GMT%2B8");
        generator.setUsername("root");
        generator.setDriverName("com.mysql.cj.jdbc.Driver");
        generator.setPassword("root");

        generator.run();
    }

}
