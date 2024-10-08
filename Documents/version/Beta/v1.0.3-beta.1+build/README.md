# v1.0.3-beta.1+build

---------------------

## ⭐ 新增新能

- 新增 [ChanceMaker](plat/tools/src/main/java/com/redgogh/tools/generators/ChanceMaker.java) 幸运值工具类。
- 新增 [RandomGenerator](plat/tools/src/main/java/com/redgogh/tools/generators/RandomGenerator.java) 随机数生成器。
- 新增 [TimeUnitOperator](plat/tools/src/main/java/com/redgogh/tools/time/TimeUnitOperator.java) 部分类型支持时间单位转换。
- 新增 [UnsupportedOperationException](plat/tools/src/main/java/com/redgogh/tools/exception/UnsupportedOperationException.java) 异常类型。
- 新增 [MultipartBody](plat/tools/src/main/java/com/redgogh/tools/http/MultipartBody.java) 构造器，在构造时最大支持 3 个键值对。
- 新增 [StringUtils](plat/tools/src/main/kotlin/com/redgogh/tools/string.kt) 中 `strxip` 函数，用于除去字符串内的所有占位符。
- 新增 [LoggerFactory](plat/tools/src/main/java/com/redgogh/tools/logging/LoggerFactory.java) 中获取本地标准日志输出调试对象。
- 新增 [FileByteWriter](plat/tools/src/main/java/com/redgogh/tools/io/FileByteWriter.java) `call` 方法，用于自动关闭流。
- 新增 [File](plat/tools/src/main/java/com/redgogh/tools/io/File.java) `readBytes` 函数，用于直接获取文件所有字节数据。
- 新增 [Lists](plat/tools/src/main/java/com/redgogh/tools/collection/Lists.java) 包装同步集合接口。
- 新增 `spring-boot` 项目配置模板。
- `tools` 模块发布到 Maven Central 中央仓库。

## 👻 优化功能

- 简化 Cryptographic 拼写，改名为：[Crypto](plat/tools/src/main/java/com/redgogh/tools/security/Crypto.java)
- 更新 SpringBoot Mybatis 主键雪花算法生成配置。

## 🐞 BUG 修复
- 修复 [QueryBuilder](plat/tools/src/main/java/com/redgogh/tools/http/QueryBuilder.java) 空构造器数组越界异常。
- 修复 [StringUtils](plat/tools/src/main/kotlin/com/redgogh/tools/string.kt) 中 `strieq` 方法比较没忽略大小写问题。
- 修复 [UField](plat/tools/src/main/java/com/redgogh/tools/refection/UField.java) 针对 JDK1.9 以上的模块化权限控制问题。 