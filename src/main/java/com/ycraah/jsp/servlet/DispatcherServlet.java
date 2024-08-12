package com.ycraah.jsp.servlet;

import com.ycraah.jsp.Container.Container;
import com.ycraah.jsp.Rq;
import com.ycraah.jsp.article.ArticleController;
import com.ycraah.jsp.member.MemberController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

//usr로 오는 모든 요청을 받음
@WebServlet("/usr/*")
public class DispatcherServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Rq rq = new Rq(req, resp); //생성자에 의해 req, resp 저장 및 UTF-8 설정

    MemberController memberController = Container.memberController;
    ArticleController articleController = Container.articleController;

    //  getRequestURI는 http://localhost:8080/usr/article/list에서
    //  usr/article/list만 가져온다.

    String url = req.getRequestURI();
    System.out.println(url);

    switch(url){ //컨트롤러로 전달
      case "/usr/article/list" -> articleController.showList(rq);
      case "/usr/member/join" -> memberController.showJoin(rq);
    }
  }
}
