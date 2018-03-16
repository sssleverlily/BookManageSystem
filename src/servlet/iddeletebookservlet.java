package servlet;

import main.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import main.BooksDao;
import main.Loading;
import main.Operater;

@WebServlet(name = "iddeletebookservlet")
public class iddeletebookservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        Book book=new Book();
        //进行数据库的链接
        Operater op =new Operater();
       java.sql.Connection con= Loading.getConnection();

        try{
//            BooksDao bd=new BooksDao(con);
            int id = Integer.parseInt(request.getParameter("id"));
            book.setId(id);
//            bd.iddeletebook(id);
            op.iddeletebook(id);
            String path = request.getContextPath();
            String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//            response.sendRedirect(basePath+"/iddeletebook.jsp?ok=3");
            //跳转到下一界面
            request.getRequestDispatcher("/showtwobook.jsp").forward(request,response);
//          response.sendRedirect(request.getContextPath()+"/showbook.jsp");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
