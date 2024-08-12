package com.ycraah.jsp.article;

import com.ycraah.jsp.Rq;

public class ArticleController {
  public void showList(Rq rq) {
    rq.appendBody("게시물 리스트");
  }
}
