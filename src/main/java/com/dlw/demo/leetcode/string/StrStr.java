package com.dlw.demo.leetcode.string;

/**
 * @Description  28. 实现 strStr()
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * @Author diaoliwei
 * @Date 2020/5/26 13:11
 */
public class StrStr {

    public static int strStr(String haystack, String needle) {
        if (needle == null || "".equals(needle)) {
            return 0;
        }
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        int r = strStr("hello", "ll");
        System.out.println(r);
    }


}
