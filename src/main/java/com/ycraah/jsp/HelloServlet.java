package com.ycraah.jsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("utf-8"); //받는 데이터를 UTF-8로 인식
    resp.setCharacterEncoding("utf-8"); //완성된 HTML의 인코딩을 UTF-8로 지정
    resp.setContentType("text/html; charset=utf-8"); //브라우저에 전달할 데이터의 형식 지정
    resp.getWriter().append("안녕");
  }
}
