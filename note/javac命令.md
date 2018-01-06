[传送门1](http://www.cnblogs.com/JeffChen/archive/2008/01/16/1041783.html)

[传送门2](http://blog.csdn.net/u013066244/article/details/52926828)

## 样例
首先进入code目录下

### 样例1
编译util目录下的所有.java源文件，编译得到的.class文件放在同一目录下
``` shell
cd net/mindview/util
javac *.java
```
### 样例2
编译util目录下的所有.java源文件，编译得到的.class文件放在同一目录下
``` shell
javac net/mindview/util/*.java
```

### 样例3
用-d参数指定编译得到的.class文件所在的位置
``` shell
# 在code目录下新建文件夹
mkdir classes
javac net/mindview/util/*.java -d classes
```

### 样例4
``` shell
# 在code目录下创建一个classes文件夹
mkdir classes
javac net/mindview/util/*.java -d classes
cd classes

# 打包net得到jar文件net.jar
jar -cvf net.jar net

# 切换到arrays目录下，运行以下程序会报错，因为找不到该文件引入的类 import net.mindview.util.*;
javac GeneratorsTest.java

# 可行的方法1
javac GeneratorsTest.java -classpath ../../classes/net.jar

# 可行的方法2
javac GeneratorsTest.java -classpath ../../classes
```

## 样例5
切换到code目录下
``` shell
# 直接执行以下命令，会先编译GeneratorsTest.java中引入的net.mindview.util下的并真正使用的文件
javac arrays/GeneratorsTest.java
```

### 样例5
将net.jar添加到CLASSPATH，然后切换到arrays目录下
``` shell
# CLASSPATH
.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;D:\projects\TIJ4\classes\net.jar
# 执行以下命令,可以通过
javac GeneratorsTest.java
```

通过对javac的学习，可以大概了解java的整个编译过程是怎样的。以及CLASSPATH的基本作用。
