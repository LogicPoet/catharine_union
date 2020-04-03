-- ----------------------------
-- Table structure for cat_client
-- ----------------------------
DROP TABLE IF EXISTS `cat_client`;
CREATE TABLE `cat_client`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `client_id` varchar(48)  NOT NULL COMMENT '客户端id',
  `client_secret` varchar(256)  NOT NULL COMMENT '客户端密钥',
  `resource_ids` varchar(256)  DEFAULT NULL COMMENT '资源集合',
  `scope` varchar(256)  NOT NULL COMMENT '授权范围',
  `authorized_grant_types` varchar(256)  NOT NULL COMMENT '授权类型',
  `web_server_redirect_uri` varchar(256)  DEFAULT NULL COMMENT '回调地址',
  `authorities` varchar(256)  DEFAULT NULL COMMENT '权限',
  `access_token_validity` int(11) NOT NULL COMMENT '令牌过期秒数',
  `refresh_token_validity` int(11) NOT NULL COMMENT '刷新令牌过期秒数',
  `additional_information` varchar(4096)  DEFAULT NULL COMMENT '附加说明',
  `auto_approve` varchar(256)  DEFAULT NULL COMMENT '自动授权',

  `create_user` int(11) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` int(11) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `status` int(2) NOT NULL COMMENT '状态',
  `is_deleted` int(2) NOT NULL COMMENT '是否已删除',
  PRIMARY KEY (`id`) USING BTREE
) COMMENT = '客户端表';

-- ----------------------------
-- Records of cat_client
-- ----------------------------
BEGIN;
INSERT INTO `cat_client` VALUES (1, 'sword', 'sword_secret', NULL, 'all', 'refresh_token,password,authorization_code', 'http://localhost:8888', NULL, 3600, 604800, NULL, NULL, 1, '2019-03-24 10:40:55', 1, '2019-03-24 10:40:59', 1, 0), (2, 'saber', 'saber_secret', NULL, 'all', 'refresh_token,password,authorization_code', 'http://localhost:8080', NULL, 3600, 604800, NULL, NULL, 1, '2019-03-24 10:42:29', 1, '2019-03-24 10:42:32', 1, 0);
COMMIT;

-- ----------------------------
--  Table structure for `cat_staff` 工会职员表
-- ----------------------------
DROP TABLE IF EXISTS `cat_staff`;
CREATE TABLE `cat_staff` (
  `id` bigint NOT NULL COMMENT '主键',
  `account` varchar(45) DEFAULT NULL COMMENT '账号',
  `password` varchar(45) DEFAULT NULL COMMENT '密码',
  `nickname` varchar(20) DEFAULT NULL COMMENT '昵称',
  `email` varchar(45) DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(45) DEFAULT NULL COMMENT '手机',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `sex` smallint(6) DEFAULT NULL COMMENT '性别[1:男,0:女]',
  `role_id` varchar(255) DEFAULT NULL COMMENT '角色id合集,以英文逗号分隔',
  `dept_id` varchar(255) DEFAULT NULL COMMENT '部门id合集,以英文逗号分隔',

  `create_user` int(11) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` int(11) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `status` int(2) DEFAULT NULL COMMENT '状态',
  `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
  PRIMARY KEY (`id`) USING BTREE
);
-- ----------------------------
--  Table structure for `cat_menu` 菜单资源
-- ----------------------------

DROP TABLE IF EXISTS `cat_menu`;
CREATE TABLE `cat_menu` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parent_id` int(11) DEFAULT '0' COMMENT '父级菜单',
  `code` varchar(255) DEFAULT NULL COMMENT '菜单编号',
  `name` varchar(255) DEFAULT NULL COMMENT '菜单名称',
  `alias` varchar(255) DEFAULT NULL COMMENT '菜单别名',
  `path` varchar(255) DEFAULT NULL COMMENT '请求地址',
  `source` varchar(255) DEFAULT NULL COMMENT '菜单资源',
  `sort` int(2) DEFAULT NULL COMMENT '排序',
  `category` int(2) DEFAULT NULL COMMENT '菜单类型',
  `action` int(2) DEFAULT '0' COMMENT '操作按钮类型',
  `is_open` int(2) DEFAULT '1' COMMENT '是否打开新页面',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',

  `create_user` int(11) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` int(11) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `status` int(2) DEFAULT NULL COMMENT '状态',
  `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
  PRIMARY KEY (`id`) USING BTREE
);

-- ----------------------------
--  Table structure for `cat_role` 角色
-- ----------------------------
DROP TABLE IF EXISTS `cat_role`;
CREATE TABLE `cat_role` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parent_id` int(11) DEFAULT '0' COMMENT '父主键',
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `role_alias` varchar(255) DEFAULT NULL COMMENT '角色别名',

  `create_user` int(11) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` int(11) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `status` int(2) DEFAULT NULL COMMENT '状态',
  `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
  PRIMARY KEY (`id`) USING BTREE
);

-- ----------------------------
--  Table structure for `cat_role_menu` 角色菜单配置表
-- ----------------------------
DROP TABLE IF EXISTS `cat_role_menu`;
CREATE TABLE `cat_role_menu` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `menu_id` int(11) DEFAULT NULL COMMENT '菜单id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',

  `create_user` int(11) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` int(11) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `status` int(2) DEFAULT NULL COMMENT '状态',
  `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
  PRIMARY KEY (`id`) USING BTREE
);