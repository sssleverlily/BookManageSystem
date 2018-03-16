package main;

import java.util.Scanner;

public class Main {
    public Main()
    {

        Scanner scan = new Scanner(System.in);
        printMenu();

        while(true)
        {
            //读取用户输入
            int choice = scan.nextInt();

            if(choice == 9)
            {
                System.out.println("成功退出系统，欢迎您再次光临~");
                break;
            }
            switch(choice)
            {
                case 1: addBook(); break;
                case 2: deleteBook(); break;
                case 3: changeBook(); break;
                case 4: findBook(); break;
                case 5: clearBook(); break;
                case 6: borrowBook();break;
                case 7: returnBook();break;
                case 8: showBook();break;
                default: System.out.println("输入无效，请重新输入~"); printMenu(); continue;
            }
        }

    }

    void printMenu()
    {
        //打印菜单
        System.out.println("欢迎来到机智曾曾借书系统...");
        System.out.println("增加图书...1");
        System.out.println("删除图书...2");
        System.out.println("修改图书...3");
        System.out.println("查询图书...4");
        System.out.println("清空图书...5");
        System.out.println("借出图书...6");
        System.out.println("归还图书...7");
        System.out.println("展示剩余图书...8");
        System.out.println("退出系统...9");
    }

    void clearBook()
    {
        Operater operater = new Operater();
        boolean isSuccess = operater.clearBook();
        if(isSuccess)
        {
            System.out.println("清空成功！");
        }
        else
        {
            System.out.println("清空失败！");
        }
    }

    void addBook()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入图书名：");
        String bookname = scan.next();
        System.out.println("请输入作者：");
        String author = scan.next();
        System.out.println("请输入单价：");
        float price = scan.nextFloat();
        System.out.println("请输入图书id:");
        int id=scan.nextInt();
        Operater operater = new Operater();
        boolean isSuccess = operater.addBook(bookname, author, price,id);
        if(isSuccess)
        {
            System.out.println("增加成功！");
        }
        else
        {
            System.out.println("增加失败！");
        }
        operater.printAllbook();
    }

    void deleteBook()
    {
        Scanner scan = new Scanner(System.in);
        String name = "";
        while(true)
        {
            System.out.println("请输入按哪种方法删除图书：1、编号/2、书名/3、返回主菜单");
            int choose = scan.nextInt();
            int id = -1;
            if(choose == 1)
            {
                System.out.println("请输入要删除的书的编号：");
                id = scan.nextInt();
                Operater operater = new Operater();
                //System.out.println(id);
                if(id > -1)
                {
                    boolean isSuccess = operater.deleteBook(id,name);
                    if(isSuccess)
                        System.out.println("删除成功！");
                    else
                        System.out.println("删除失败！");
                    operater.printAllbook();
                }
                else
                {
                    System.out.println("输入错误！");
                }
            }
            else if(choose == 2)
            {
                System.out.println("请输入您要删除的书名：");
                name = scan.next();
                Operater operator = new Operater();
                if(name != "")
                {
                    boolean isSuccess = operator.deleteBook(id,name);
                    if(isSuccess)
                        System.out.println("删除成功！");
                    else
                        System.out.println("删除失败！");
                    operator.printAllbook();
                }
                else
                {
                    System.out.println("未查找到您想要的书名");
                }
            }
            else if(choose == 3)
            {
                printMenu();
                break;
            }
            else
            {
                System.out.println("输入非法！");
            }
        }
    }

    void changeBook()
    {
        Scanner scan = new Scanner(System.in);
        String name = "";
        while(true)
        {
            System.out.println("请输入按哪种方法修改图书：1、编号/2、书名/3、返回主菜单");
            int choose = scan.nextInt();
            int id = -1;
            if(choose == 1)
            {
                System.out.println("请输入要修改的书的编号：");
                id = scan.nextInt();
                Operater operater = new Operater();
                if(id > -1)
                {
                    System.out.println("请输入你要修改为什么书名：");
                    String str = scan.next();
                    boolean isSuccess = operater.changeBook(id,str,name);
                    if(isSuccess)
                        System.out.println("修改成功！");
                    else
                        System.out.println("修改失败！");

                    operater.printAllbook();
                }
                else
                {
                    System.out.println("输入错误！");
                }
            }
            else if(choose == 2)
            {
                System.out.println("请输入您要修改的书名：");
                name = scan.next();
                Operater operater = new Operater();
                if(name != "")
                {
                    System.out.println("请输入你修改后的书名：");
                    String str = scan.next();
                    boolean isSuccess = operater.changeBook(id,str,name);
                    if(isSuccess)
                        System.out.println("修改成功！");
                    else
                        System.out.println("修改失败！");
                    operater.printAllbook();
                }
            }
            else if(choose == 3)
            {
                printMenu();
                break;
            }
            else
            {
                System.out.println("输入非法！");
            }
        }
    }

    void findBook()
    {
        Scanner scan = new Scanner(System.in);
        Operater operater = new Operater();
        String name = "";
        int id = -1;
        while(true)
        {
            System.out.println("请选择：1、按书名查找/2、返回主菜单");
            int choose = scan.nextInt();
//            if(choose == 1)
//            {
//                System.out.println("请输入要查找的书的编号：");
//                id = scan.nextInt();
//                if(id > -1)
//                {
//                    operater.findBook(id,name);
//                }
//                else
//                {
//                    System.out.println("输入错误！");
//                }
//            }
             if(choose == 1)
            {
             System.out.println("请输入您要查找的书名：");
                name = scan.next();
                if(name != "")
                {
                    operater.findBook(id,name);
                }
            }
            else if(choose == 2)
            {
                printMenu();
                break;
            }
            else
            {
                System.out.println("输入非法！");
            }
        }
    }
    void borrowBook() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入借书年份：");
        int year = scan.nextInt();
        System.out.println("请输入借书月份：");
        int month = scan.nextInt();
        System.out.println("请输入借书日期：");
        int day = scan.nextInt();
        Operater operater = new Operater();
        boolean isSuccess = operater.borrowBook(year, month, day);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("请输入借书id：");
        int id = scan1.nextInt();
        System.out.println("请输入借书名称：");
        String bookname = scan1.next();
        if(isSuccess)
        {
            operater.deleteBook(id, bookname);
            System.out.println("借书成功！");
        }
        else
        {
            System.out.println("借书失败！");
        }
    }

    void returnBook() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入还书名称：");
        String bookname = scan.next();
        System.out.println("请输入还书id：");
        int id = scan.nextInt();
        Operater operater = new Operater();
        boolean isSuccess = operater.returnBook(bookname,id);
        System.out.println("请输入作者：");
        String author = scan.next();
        System.out.println("请输入单价：");
        float price = scan.nextFloat();
        if(isSuccess)
        {

            operater.addBook(bookname, author, price,id);
            System.out.println("还书成功！");
        }
        else
        {
            System.out.println("还书失败！");
        }
    }

    void showBook() {
        Operater operater = new Operater();
        operater.printAllbook();
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Main();
    }
}
