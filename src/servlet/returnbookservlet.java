package servlet;

import main.Book;
import main.Loading;
import main.Operater;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "returnbookservlet")
public class returnbookservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        Book book=new Book();
        //进行数据库的链接
        Connection con= Loading.getConnection();
        Operater operater=new Operater();
        try{
            String bookname=request.getParameter("bookname");
            String author =request.getParameter("author");
            int id = Integer.parseInt(request.getParameter("id"));
            float price=Float.parseFloat(request.getParameter("price"));
            book.setBookname(bookname);
            book.setAuthor(author);
            book.setPrice(price);
            book.setId(id);
            operater.addBook(bookname,author,price,id);
            request.getSession().setAttribute("returnbook",book);
            request.getRequestDispatcher("/return.jsp").forward(request,response);
            response.sendRedirect(request.getContextPath()+"/showbook.jsp");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
