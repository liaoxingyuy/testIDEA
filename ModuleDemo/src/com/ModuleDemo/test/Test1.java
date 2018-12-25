package com.ModuleDemo.test;

import com.ModuleDemo.test.bean.TestBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 快捷键的使用
 *
 *  F4                  查看继承关系
 *
 *  alt+r               执行run
 *  alt+/               提示
 *  alt+E               打开最近修改的文件
 *  ctrl+f              查找
 *  Ctrl+h               全局查找
 *  Alt+上下          上下移动行
 *  Shift+上下        选择多行
 *
 *  两下Shift             查找文件
 *
 *  Shift+Enter        新增下一行
 *  Ctrl+Shift+Enter    增加上一行
 *
 *
 *  Ctrl+Delete         删除光标后面的一组
 *  ctrl+D              删除一行
 *
 *  ctrl+Alt+/          提示方法参数类型
 *
 *  Ctrl+y              反撤销
 *
 *      Alt+Enter           多功能  万能解错/生成返回值变量
 *
 *
 *  alt+left            返回上一个页面
 *  alt+right           返回下一个页面
 *
 *      Alt+Shift+R         改变选择的（所有该名称）的变量
 *
 *      Alt+Shift+S         生成构造方法/set get toString
 *
 *  alt+Shift+c         收起所有方法
 *
 *  alt+Shift+x         打开所有方法
 *
 *      Alt+Shift+Z        给选中的代码加 if  for try 等
 *
 *  Alt+Shift+F        把一个属性变为成员属性
 *
 *
 *  Ctrl+alt+h          查看方法的重写
 *
 *  alt+shift+m         把选中的代码 抽取成一个方法
 *
 *
 *
 *  Ctrl+Shift+U        查看方法的结构树
 *
 *  Ctrl+Shift+x       打开这个文件在硬盘中的位置
 *
 *  ctrl+Shift+W                关闭所有代码
 *
 *      ctrl+Shitf+q          快速搜索类中的错误
 *
 *  ctrl+Shitf+v           选择最近复制的某一个 进行粘贴
 *
 *  ctrl+Shift+H           查看选择的方法被哪些方法调用
 *
 *  ctrl+Shift+F        整理格式
 *
 *  Ctrl+Shift+Y        大小写转换
 *
 *  ctrl+shift+f         把该类添加到收藏
 *  */
public class Test1 {


    private TestBean bean;

    public static void main(String[] args) {
        System.out.println(".....");
        System.out.println("Hello Word");
        System.out.println("哈喽");

        List<String> list = new ArrayList<>();


        Date date = new Date();

        list.add("哈哈哈");

        TestBean bean = new TestBean();

        test1();

    }

    public static void test1() {
        System.out.println("is Test1");
    }


}
