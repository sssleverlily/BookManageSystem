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

@WebServlet(name = "namedeleteservlet")
public class namedeleteservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        Book book=new Book();
        Operater op =new Operater();
        Connection con= Loading.getConnection();

        try{
//            BooksDao bd=new BooksDao(con);
            String bookname= request.getParameter("bookname");
            book.setBookname(bookname);
//            bd.namedeletebook(bookname);
            op.namedeletebook(bookname);
            String path = request.getContextPath();
            String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//            response.sendRedirect(basePath+"/namedeletebook.jsp?ok=3");
            //跳转到下一界面
            request.getRequestDispatcher("/showtwobook.jsp").forward(request,response);
//            response.sendRedirect(request.getContextPath()+"/showbook.jsp");
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
