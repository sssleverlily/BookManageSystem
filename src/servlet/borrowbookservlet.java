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
import java.sql.Connection;

@WebServlet(name = "borrowbookservlet")
public class borrowbookservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        Operater operater=new Operater();
        Book book=new Book();
        //进行数据库的链接
        Connection con= Loading.getConnection();
        try{
          //  BooksDao bd=new BooksDao();
            String bookname=request.getParameter("bookname");
            String author =request.getParameter("author");
            float price=Float.parseFloat(request.getParameter("price"));
            int id = Integer.parseInt(request.getParameter("id"));
            int year = Integer.parseInt(request.getParameter("year"));
            int month = Integer.parseInt(request.getParameter("month"));
            int day = Integer.parseInt(request.getParameter("day"));
            book.setBookname(bookname);
            book.setId(id);
            book.setDate(year,month,day);
            operater.borrowBook(year,month,day);
       //     bd.iddeletebook(id);
       //     bd.namedeletebook(bookname);
        //    bd.pricedeletebook(price);
      //      bd.authordelete(author);
            String path = request.getContextPath();
            String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
            request.getRequestDispatcher("/borrow.jsp").forward(request,response);
//            response.sendRedirect(basePath+"/Student.jsp?ok=3");
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
