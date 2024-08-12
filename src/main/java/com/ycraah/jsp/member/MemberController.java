package com.ycraah.jsp.member;

import com.ycraah.jsp.Rq;

public class MemberController {
  public void showJoin(Rq rq) {
    rq.appendBody("회원가입");
  }
}
