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

@WebServlet(name = "changebookservlet")
public class namechangebookservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        Book book=new Book();
        //进行数据库的链接
        Connection con= Loading.getConnection();
        Operater operater=new Operater();
        try{
      //      BooksDao bd =new BooksDao();
            String bookname= request.getParameter("bookname");
            book.setBookname(bookname);
     //       bd.namedeletebook(bookname);
            operater.namedeletebook(bookname);
            String path = request.getContextPath();
            String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
            response.sendRedirect(basePath+"/Student.jsp?ok=3");
            String changebookname=request.getParameter("changebookname");
            book.setBookname(changebookname);
            //将更改过后的信息保存
            request.getSession().setAttribute("changebookname",book);
            //跳转到下一界面
            request.getRequestDispatcher("/showbook.jsp").forward(request,response);
//            response.sendRedirect(request.getContextPath()+"/showbook.jsp");
        }catch(Exception ex){
           ex.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
