package servlet;

import main.Book;
import main.BooksDao;
import main.Loading;
import main.Operater;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "showbookservlet")
public class showbookservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        Book book=new Book();
        Operater operater=new Operater();
       // BooksDao bd=new BooksDao();
        //进行数据库的链接
        Connection con= Loading.getConnection();
        try{
            Statement st = con.createStatement();
            operater.printAllbook();
            ResultSet rs = st.executeQuery("select id,bookname,author,price from book");//存放数据库中的数据
            ResultSetMetaData rm =rs.getMetaData();//获取数据库中字段的名称、字段的值和属性
           // List<Map<String, Object>> list = new ArrayList();//存放数据库中的数据
//            System.out.println(rs);
            String bookname=request.getParameter("bookname");
            String author =request.getParameter("author");
            float price=Float.parseFloat(request.getParameter("price"));
            int id = Integer.parseInt(request.getParameter("id"));
            List booklist =new ArrayList();
            while(rs.next()){//如果对象中有数据，就会循环打印出来
                System.out.println("编号："+rs.getInt("id")+" 书名："+rs.getString("bookname")+",作者："+rs.getString("author")+",价格："+rs.getFloat("price"));
//                booklist.add(rs.getInt("id"));
//                booklist.add(rs.getString("bookname"));
//                booklist.add(rs.getString("author"));
//                booklist.add(rs.getFloat("price"));
                booklist.add(rs.getInt("id"));
                booklist.add(rs.getString("bookname"));
                booklist.add(rs.getString("author"));
                booklist.add(rs.getFloat("price"));
//                book.getBookname();
//                book.getAuthor();
//                book.getPrice();
//                book.getId();

                    }
            request.getSession().setAttribute("showbook",book);
            //将数据传进去
            request.getRequestDispatcher("/remainderbook.jsp").forward(request,response);
//            while (rs.next()) {//一个遍历数据中的数据，直到字段对应的值为null为止
//                System.out.println( "flag");
//                Map<String, Object> a = new HashMap();//使用Map的键值对，来对数据库中的字段和字段对应的值进行存储
//                for (int i = 1; i <= rm.getColumnCount(); i++) {//rm.getColumnCount()是字段的个数
//                    a.put(rm.getColumnName(i), rs.getObject(i));//rm.getColumnName(i)遍历的是字段的名称，rs.getObject(i)遍历是字段对应的值
//                    a.putAll(Map.of());
//                    a.get(book);
//                    bd.getbook(book);
//                    a.get(book.getAuthor());
//                    a.get(book.getBookname());
//                    a.get(book.getId());
//                    a.get(book.getPrice());
//                    operater.printAllbook();
//
//                }
//                list.add(a);//把Map集合的键值存放到List集合中

//            }
       //     request.setAttribute("lists", list);//把List集合中数据放到request的域中
           request.getSession().getAttribute(booklist.toString());
            request.getRequestDispatcher("/remainderbook.jsp").forward(request,response);//把上面的request域的输送到showbook.jsp中
//            response.sendRedirect(request.getContextPath()+"/showbook.jsp");
//            request.setAttribute("lists",list);
//            request.getSession().getAttribute(book.getBookname());
//            request.getRequestDispatcher("/remainderbook.jsp").forward(request,response);
            rs.close();//对用的完的资源进行关闭
            st.close();
            con.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
