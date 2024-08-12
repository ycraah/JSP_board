package com.ycraah.jsp.Container;

import com.ycraah.jsp.article.ArticleController;
import com.ycraah.jsp.member.MemberController;

public class Container {
  public static MemberController memberController;
  public static ArticleController articleController;

  static{
    memberController = new MemberController();
    articleController = new ArticleController();
  }
}
