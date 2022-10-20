# LeetCode树类题目调试辅助类

LeetCode树类题目调试辅助类。提供了一个TreeNode类，包括val，left，right属性，一个根据给定val值创建树的创建方法，一个根据层次遍历数组创建树的静态方法，重写了toString方法。
在IDE中调试时，只需把这个类复制到你的答案文件同一个包下，即可直接使用TreeNode类，且在调试时可以方便地根据层次遍历数组创建树而不用逐个结点去创建。

# example



[https://jitpack.io/#masx200/leetcode-treenode-java](https://jitpack.io/#masx200/leetcode-treenode-java)

[![Release](https://jitpack.io/v/masx200/leetcode-treenode-java.svg)](https://jitpack.io/#masx200/leetcode-treenode-java)

To use it in your Maven build add:

```xml

<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

and the dependency:

```xml

<dependency>
    <groupId>com.github.masx200</groupId>
    <artifactId>leetcode-treenode-java</artifactId>
    <version>1.0.1</version>
</dependency>
```

