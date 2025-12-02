package com.cheng;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static Map<Character, Integer> keyCodeMap = null;
    public static Set<Character> needShiftSet = null;

    public static void main(String[] args)
            throws AWTException, InterruptedException
    {
        keyCodeMap = new HashMap<Character, Integer>();
        needShiftSet = new HashSet<Character>();

        keyCodeMap.put('`', 192);
        keyCodeMap.put('1', 49);
        keyCodeMap.put('2', 50);
        keyCodeMap.put('3', 51);
        keyCodeMap.put('5', 53);
        keyCodeMap.put('4', 52);
        keyCodeMap.put('6', 54);
        keyCodeMap.put('7', 55);
        keyCodeMap.put('8', 56);
        keyCodeMap.put('9', 57);
        keyCodeMap.put('0', 48);
        keyCodeMap.put('-', 45);
        keyCodeMap.put('=', 61);
        keyCodeMap.put('q', 81);
        keyCodeMap.put('w', 87);
        keyCodeMap.put('e', 69);
        keyCodeMap.put('r', 82);
        keyCodeMap.put('t', 84);
        keyCodeMap.put('y', 89);
        keyCodeMap.put('u', 85);
        keyCodeMap.put('i', 73);
        keyCodeMap.put('o', 79);
        keyCodeMap.put('p', 80);
        keyCodeMap.put('[', 91);
        keyCodeMap.put(']', 93);
        keyCodeMap.put('\\', 92);
        keyCodeMap.put('a', 65);
        keyCodeMap.put('s', 83);
        keyCodeMap.put('d', 68);
        keyCodeMap.put('f', 70);
        keyCodeMap.put('g', 71);
        keyCodeMap.put('j', 74);
        keyCodeMap.put('h', 72);
        keyCodeMap.put('k', 75);
        keyCodeMap.put('l', 76);
        keyCodeMap.put(';', 59);
        keyCodeMap.put('\'', 222);
        keyCodeMap.put('z', 90);
        keyCodeMap.put('x', 88);
        keyCodeMap.put('c', 67);
        keyCodeMap.put('v', 86);
        keyCodeMap.put('b', 66);
        keyCodeMap.put('n', 78);
        keyCodeMap.put('m', 77);
        keyCodeMap.put(',', 44);
        keyCodeMap.put('.', 46);
        keyCodeMap.put('/', 47);
        keyCodeMap.put('~', 192);
        keyCodeMap.put('!', 49);
        keyCodeMap.put('@', 50);
        keyCodeMap.put('#', 51);
        keyCodeMap.put('$', 52);
        keyCodeMap.put('%', 53);
        keyCodeMap.put('^', 54);
        keyCodeMap.put('&', 55);
        keyCodeMap.put('*', 56);
        keyCodeMap.put('(', 57);
        keyCodeMap.put(')', 48);
        keyCodeMap.put('_', 45);
        keyCodeMap.put('+', 61);
        keyCodeMap.put('Q', 81);
        keyCodeMap.put('W', 87);
        keyCodeMap.put('E', 69);
        keyCodeMap.put('R', 82);
        keyCodeMap.put('T', 84);
        keyCodeMap.put('Y', 89);
        keyCodeMap.put('U', 85);
        keyCodeMap.put('I', 73);
        keyCodeMap.put('O', 79);
        keyCodeMap.put('P', 80);
        keyCodeMap.put('{', 91);
        keyCodeMap.put('}', 93);
        keyCodeMap.put('|', 92);
        keyCodeMap.put('A', 65);
        keyCodeMap.put('S', 83);
        keyCodeMap.put('D', 68);
        keyCodeMap.put('F', 70);
        keyCodeMap.put('G', 71);
        keyCodeMap.put('H', 72);
        keyCodeMap.put('J', 74);
        keyCodeMap.put('K', 75);
        keyCodeMap.put('L', 76);
        keyCodeMap.put(':', 59);
        keyCodeMap.put('"', 222);
        keyCodeMap.put('Z', 90);
        keyCodeMap.put('X', 88);
        keyCodeMap.put('C', 67);
        keyCodeMap.put('V', 86);
        keyCodeMap.put('B', 66);
        keyCodeMap.put('N', 78);
        keyCodeMap.put('M', 77);
        keyCodeMap.put('<', 44);
        keyCodeMap.put('>', 46);
        keyCodeMap.put('?', 47);
        keyCodeMap.put(' ', 32);

        needShiftSet.add('~');
        needShiftSet.add('!');
        needShiftSet.add('@');
        needShiftSet.add('#');
        needShiftSet.add('$');
        needShiftSet.add('%');
        needShiftSet.add('^');
        needShiftSet.add('&');
        needShiftSet.add('*');
        needShiftSet.add('(');
        needShiftSet.add(')');
        needShiftSet.add('_');
        needShiftSet.add('+');
        needShiftSet.add('Q');
        needShiftSet.add('W');
        needShiftSet.add('E');
        needShiftSet.add('R');
        needShiftSet.add('T');
        needShiftSet.add('Y');
        needShiftSet.add('U');
        needShiftSet.add('I');
        needShiftSet.add('O');
        needShiftSet.add('P');
        needShiftSet.add('{');
        needShiftSet.add('}');
        needShiftSet.add('|');
        needShiftSet.add('A');
        needShiftSet.add('S');
        needShiftSet.add('D');
        needShiftSet.add('F');
        needShiftSet.add('G');
        needShiftSet.add('H');
        needShiftSet.add('J');
        needShiftSet.add('K');
        needShiftSet.add('L');
        needShiftSet.add(':');
        needShiftSet.add('"');
        needShiftSet.add('Z');
        needShiftSet.add('X');
        needShiftSet.add('C');
        needShiftSet.add('V');
        needShiftSet.add('B');
        needShiftSet.add('N');
        needShiftSet.add('M');
        needShiftSet.add('<');
        needShiftSet.add('>');
        needShiftSet.add('?');

        while(true)
        {
            System.out.println("输入要粘贴的文本，之后按回车，迅速切换到要粘贴的地方，程序将在点击回车后的1.5秒开始粘贴!");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println("即将在1.5秒后开始粘贴");
            Thread.sleep(1500l);
            paste(s);
            System.out.println("粘贴完成");
        }

    }

    // 控制键盘粘贴一段文本
    static void paste(String str)
            throws AWTException, InterruptedException
    {
        Robot robot = new Robot();
        for(int i = 0; i < str.length(); i++)
        {
            //Thread.sleep(20l);
            char c = str.charAt(i);
            int keyCode = keyCodeMap.get(c); // 获取按键码

            boolean needShift = needShiftSet.contains(c); // 判断是否需要按下shift
            if (needShift) robot.keyPress(KeyEvent.VK_SHIFT);
            //Thread.sleep(10l);
            robot.keyPress(keyCode); // 按下对应按键
            //Thread.sleep(10l);
            robot.keyRelease(keyCode);
            //Thread.sleep(10l);
            if (needShift) robot.keyRelease(KeyEvent.VK_SHIFT);
        }
    }

    // 使用键盘查看按键的keycode并输出代码
    static void showKeyCode()
    {
        JFrame frame = new JFrame("按键键码查看器");
        JTextField textField = new JTextField(20);

        textField.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                int keyCode = e.getKeyCode();
                char keyChar = e.getKeyChar();

                if (keyCode == KeyEvent.VK_SHIFT) return;
                System.out.println("keyCodeMap.put('" + keyChar + "', " + keyCode + ");");
                //System.out.println("needShiftSet.add('" + keyChar + "');");
            }
        });

        frame.add(textField);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}