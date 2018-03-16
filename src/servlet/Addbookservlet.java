package servlet;

import java.io.IOException;
import main.Book;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.BooksDao;
import main.Loading;
public class Addbookservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        Book book= new Book();
       // BooksDao bd=new BooksDao();
        java.sql.Connection con= Loading.getConnection();
        try{
            String bookname=request.getParameter("bookname");
            String author =request.getParameter("author");
            float price=Float.parseFloat(request.getParameter("price"));
            int id = Integer.parseInt(request.getParameter("id"));
            book.setBookname(bookname);
            book.setAuthor(author);
            book.setPrice(price);
            book.setId(id);
         //   bd.addbook(book);
            //将输入的图书信息保存
            request.getSession().setAttribute("adbook",book);
            //将数据传进去
            request.getRequestDispatcher("/showbook.jsp").forward(request,response);
            //跳转到下一界面
//            response.sendRedirect(request.getContextPath()+"/showbook.jsp");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
