/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2023-12-04 09:04:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberEnrollForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>LJSS JOIN PAGE</title>\r\n");
      out.write("     <link rel =\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.servletContext.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/memberEnrollForm.css\"/>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body{\r\n");
      out.write("            font-family: 'Montserrat', sans-serif;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        } \r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <div id=\"container\">\r\n");
      out.write("        <!-- 헤더 -->\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("            <!-- 햄버거 메뉴 -->\r\n");
      out.write("            <div class=\"cate_btn\">\r\n");
      out.write("                <input type=\"checkbox\" id=\"hamburger\"/>\r\n");
      out.write("                <label for=\"hamburger\">\r\n");
      out.write("                  <span></span>\r\n");
      out.write("                  <span></span>\r\n");
      out.write("                  <span></span>\r\n");
      out.write("                </label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"cate_box\">\r\n");
      out.write("                <p>Category</p>\r\n");
      out.write("                <ul class=\"cate_box2\">\r\n");
      out.write("                    <li><a href=\"#\">Outer</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Top</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Bottom</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Shoes</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Acc</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!-- 계정이 관리자일 경우에만 보이게 -->\r\n");
      out.write("                <ul class=\"adm_menu\">\r\n");
      out.write("                    <li><a href=\"\">회원관리</a></li>\r\n");
      out.write("                    <li><a href=\"\">상품관리</a></li>\r\n");
      out.write("                    <li><a href=\"\">결제관리</a></li>\r\n");
      out.write("                    <li><a href=\"\">이벤트관리</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- 검색창 -->\r\n");
      out.write("            <input type=\"text\" class=\"search_box\" id=\"search\">\r\n");
      out.write("            <button type=\"button\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.servletContext.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/main/search_icon.png\"/></button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- 오른쪽위 메뉴 -->\r\n");
      out.write("            <div class=\"gnb\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"\">Login</a></li>\r\n");
      out.write("                    <li><a href=\"\">Cart</a></li>\r\n");
      out.write("                    <li><a href=\"\">Notice</a></li>\r\n");
      out.write("                    <li><a href=\"\">Event</a></li>\r\n");
      out.write("                    <li><a href=\"\">Contact</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.servletContext.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-3.7.1.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.servletContext.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-ui.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function(){\r\n");
      out.write("            $('.cate_btn').click(function(){\r\n");
      out.write("                $('.cate_box').toggle('slide', {\r\n");
      out.write("                direction: 'left'\r\n");
      out.write("                }, 400);\r\n");
      out.write("            });\r\n");
      out.write("        });//end\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("        <div id = \"wrap\">\r\n");
      out.write("            <div class =\"title\" >\r\n");
      out.write("                <h3>JOIN</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form id=\"enrollForm\" action=\"insertMember\" method=\"post\">\r\n");
      out.write("            <div class=\"login_form\">\r\n");
      out.write("                <label for=\"memId\" class =\"username\">\r\n");
      out.write("                    <ul id=\"id\">ID*</ul></label>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type =\"text\" id = \"username\" name=\"memId\" placeholder=\"&nbsp;&nbsp;&nbsp;PLEASE ENTER YOUR ID\" required>\r\n");
      out.write("                    \r\n");
      out.write("                \r\n");
      out.write("                <div id=\"checkResult\" style=\"display:none; font-size:13px;\"></div>\r\n");
      out.write("                \r\n");
      out.write("                <ul id=\"notice\">(영어 소문자 및 숫자사용,4~16자)</ul>\r\n");
      out.write("                <br>\r\n");
      out.write("                <label class = \"password\" >\r\n");
      out.write("                    <ul id=\"word\">PASSWORD*</ul>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type =\"password\" id = \"password\" name=\"memPwd\" placeholder=\"&nbsp;&nbsp;&nbsp;PLEASE ENTER YOUR PASSWORD\" required>\r\n");
      out.write("                </label> \r\n");
      out.write("                <ul id=\"notice1\">(영문 대소문자/숫자/특수문자 중2가지 이상 조합,8자~16자)</ul>\r\n");
      out.write("                <br>\r\n");
      out.write("                <label class = \"confirmpassword\" >\r\n");
      out.write("                    <ul id=\"confirm\">COMFIRM PASSWORD*</ul>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type =\"text\" id = \"confirmpassword\"placeholder=\"&nbsp;&nbsp;&nbsp;PLEASE ENTER YOUR PASSWORD AGAIN\" required>\r\n");
      out.write("                </label> \r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <ul id=\"personal\">PERSONAL INFORMATION</ul>\r\n");
      out.write("                <div id=\"line\"></div>\r\n");
      out.write("                \r\n");
      out.write("               <label class = \"name\" >\r\n");
      out.write("                    <ul id=\"name\">NAME*</ul>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type =\"text\" id = \"memName\" name=\"memName\" placeholder=\"&nbsp;&nbsp;&nbsp;PLEASE ENTER YOUR NAME\" required>\r\n");
      out.write("                </label> \r\n");
      out.write("                	\r\n");
      out.write("                 <ul id=\"birth\">BIRTH*</ul>\r\n");
      out.write("                <tb>\r\n");
      out.write("                <select id=\"yearSelect\" name=\"memBirth\"></select>\r\n");
      out.write("                <input id = birth1 name=\"memBirth\" placeholder=\"&nbsp;&nbsp;BIRTH MONTH\">\r\n");
      out.write("                <input id = birth2 name=\"memBirth\"placeholder=\"&nbsp;&nbsp;BIRTH DATE\">\r\n");
      out.write("                </tb>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    \r\n");
      out.write("                    var currentYear = new Date().getFullYear();\r\n");
      out.write("                \r\n");
      out.write("                    \r\n");
      out.write("                    var selectElement = document.getElementById(\"yearSelect\");\r\n");
      out.write("                \r\n");
      out.write("                    \r\n");
      out.write("                    for (var year = 1970; year <= currentYear; year++) {\r\n");
      out.write("                        var option = document.createElement(\"option\");\r\n");
      out.write("                        option.value = year;\r\n");
      out.write("                        option.text = year;\r\n");
      out.write("                        selectElement.appendChild(option);\r\n");
      out.write("                    }\r\n");
      out.write("                </script>\r\n");
      out.write("                    <div class=\"gendersize\">\r\n");
      out.write("                    <ul class=\"gender\"> GENDER*</ul>\r\n");
      out.write("                    <input type=\"radio\" name=\"gender\" id=\"male\" value=\"M\">\r\n");
      out.write("                    <label for=\"Male\" class=\"male\">MALE</label> \r\n");
      out.write("                    <input type=\"radio\" name=\"gender\" id=\"female\" value=\"F\">\r\n");
      out.write("                    <label for=\"Female\"class=\"female\">FEMALE</label><br> \r\n");
      out.write("                    </div>\r\n");
      out.write("            \r\n");
      out.write("                <ul id=\"phone\">PHONE*</ul>\r\n");
      out.write("                <tb>\r\n");
      out.write("                    <select class = \"phone\" name=\"memPhone\">\r\n");
      out.write("                        <option value=\"010\">010</option>\r\n");
      out.write("                        <option value=\"011\">011</option>\r\n");
      out.write("                        <option value=\"016\">016</option>\r\n");
      out.write("                        <option value=\"017\">017</option>\r\n");
      out.write("                        <option value=\"018\">018</option>\r\n");
      out.write("                        <option value=\"019\">019</option>\r\n");
      out.write("\r\n");
      out.write("                     </select> \r\n");
      out.write("                     \r\n");
      out.write("                     <input id=\"phone1\" name=\"memPhone\">\r\n");
      out.write("                     <input id=\"phone2\" name=\"memPhone\">\r\n");
      out.write("                </tb>\r\n");
      out.write("                <label class = \"email\" >\r\n");
      out.write("                    <ul id=\"email\">EMAIL*</ul>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type =\"text\" id = \"emailcontext\" name=\"memEmail\" placeholder=\"&nbsp;&nbsp;&nbsp;PLEASE ENTER YOUR EMAIL\">\r\n");
      out.write("                </label> \r\n");
      out.write("                <ul id=\"address\">ADDRESS*</ADdress></ul>\r\n");
      out.write("                \r\n");
      out.write("                <input id=\"postcode\" name=\"post\" readonly>\r\n");
      out.write("                <a href=\"#none\" onclick id=\"postbn\">\r\n");
      out.write("                       <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.servletContext.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/enrollform/postpic.gif\" class=\"postbutton\"/>\r\n");
      out.write("                </a>\r\n");
      out.write("                <script src=\"https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("               \r\n");
      out.write("                <input id=\"address1\" name=\"address1\" placeholder=\" &nbsp;&nbsp;&nbsp;YOUR ADDRESS \" readonly>\r\n");
      out.write("                <input id=\"address2\" name=\"address2\" placeholder=\" &nbsp;&nbsp;&nbsp;DETAIL ADDRESS.\">\r\n");
      out.write("                <script>\r\n");
      out.write("                    const $searchZipCode = document.getElementById(\"postbn\");\r\n");
      out.write("                   \r\n");
      out.write("                    \r\n");
      out.write("                    $searchZipCode.onclick = function() {\r\n");
      out.write("                    \r\n");
      out.write("                        //다음 우편번호 검색 창을 오픈하면서 동작할 콜백 메소드를 포함한 객체를 매개변수로 전달한다.\r\n");
      out.write("                        new daum.Postcode({\r\n");
      out.write("                            oncomplete: function(data){\r\n");
      out.write("                                //팝업에서 검색결과 항목을 클릭했을 시 실행할 코드를 작성하는 부분\r\n");
      out.write("                                document.getElementById(\"postcode\").value = data.zonecode;\r\n");
      out.write("                                document.getElementById(\"address1\").value = data.address;\r\n");
      out.write("                                document.getElementById(\"address2\").focus();\r\n");
      out.write("                            }\r\n");
      out.write("                        }).open();\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                    $goMain.onclick = function() {\r\n");
      out.write("                        location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.servletContext.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("                    }\r\n");
      out.write("                </script>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <div id=\"line1\"></div>\r\n");
      out.write("                \r\n");
      out.write("                <ul class=\"agreeasignment\">AGREE ASIGNMENT</ul>\r\n");
      out.write("                <label class=\"checkbox\">\r\n");
      out.write("                    <input type=\"checkbox\" name=\"checkall\" onclick=\"checkAll(this.checked)\">&nbsp;&nbsp;&nbsp;이용약관 및 개인정보수집 및 이용에 모두 동의합니다.\r\n");
      out.write("                </label>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"line2\"></div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"asignment1\">\r\n");
      out.write("                <ul class=\"context1\">[필수]이용약관 동의 </ul>\r\n");
      out.write("                <button class=\"buttoncontext1\" id=\"button1\">이용약관</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"popup\" id=\"popup\">\r\n");
      out.write("                    <div class=\"popup-content\">\r\n");
      out.write("                      <span class=\"close\" id=\"closePopup\">&times;</span>\r\n");
      out.write("                      <ul class=\"title\">LJSS 이용약</ul>\r\n");
      out.write("                    \r\n");
      out.write("                    <p>제1조(목적)<br>이 약관은 키르시(전자상거래 사업자)가 운영하는 키르시 사이버 몰(이하 “몰”이라 한다)에서 제공하는 인터넷 관련 서비스(이하 “서비스”라 한다)를 이용함에 있어 사이버 몰과 이용자의 권리?의무 및 책임사항을 규정함을 목적으로 합니다.<br>※「PC통신, 무선 등을 이용하는 전자상거래에 대해서도 그 성질에 반하지 않는 한 이 약관을 준용합니다.」</p>\r\n");
      out.write("                    <p>제2조(정의)<br>① “몰”이란 키르시 회사가 재화 또는 용역(이하 “재화 등”이라 함)을 이용자에게 제공하기 위하여 컴퓨터 등 정보통신설비를 이용하여 재화 등을 거래할 수 있도록 설정한 가상의 영업장을 말하며, 아울러 사이버몰을 운영하는 사업자의 의미로도 사용합니다.<br>② “이용자”란 “몰”에 접속하여 이 약관에 따라 “몰”이 제공하는 서비스를 받는 회원 및 비회원을 말합니다.<br>③ ‘회원’이라 함은 “몰”에 회원등록을 한 자로서, 계속적으로 “몰”이 제공하는 서비스를 이용할 수 있는 자를 말합니다.<br>④ ‘비회원’이라 함은 회원에 가입하지 않고 “몰”이 제공하는 서비스를 이용하는 자를 말합니다.</p>\r\n");
      out.write("                    <p>제3조 (약관 등의 명시와 설명 및 개정) <br>① “몰”은 이 약관의 내용과 상호 및 대표자 성명, 영업소 소재지 주소(소비자의 불만을 처리할 수 있는 곳의 주소를 포함), 전화번호?모사전송번호?전자우편주소, 사업자등록번호, 통신판매업 신고번호, 개인정보보호책임자등을 이용자가 쉽게 알 수 있도록 키르시 사이버몰의 초기 서비스화면(전면)에 게시합니다. 다만, 약관의 내용은 이용자가 연결화면을 통하여 볼 수 있도록 할 수 있습니다.<br>② “몰은 이용자가 약관에 동의하기에 앞서 약관에 정하여져 있는 내용 중 청약철회?배송책임?환불조건 등과 같은 중요한 내용을 이용자가 이해할 수 있도록 별도의 연결화면 또는 팝업화면 등을 제공하여 이용자의 확인을 구하여야 합니다.<br>③ “몰”은 「전자상거래 등에서의 소비자보호에 관한 법률」, 「약관의 규제에 관한 법률」, 「전자문서 및 전자거래기본법」, 「전자금융거래법」, 「전자서명법」, 「정보통신망 이용촉진 및 정보보호 등에 관한 법률」, 「방문판매 등에 관한 법률」, 「소비자기본법」 등 관련 법을 위배하지 않는 범위에서 이 약관을 개정할 수 있습니다.<br>④ “몰”이 약관을 개정할 경우에는 적용일자 및 개정사유를 명시하여 현행약관과 함께 몰의 초기화면에 그 적용일자 7일 이전부터 적용일자 전일까지 공지합니다. 다만, 이용자에게 불리하게 약관내용을 변경하는 경우에는 최소한 30일 이상의 사전 유예기간을 두고 공지합니다. 이 경우 “몰“은 개정 전 내용과 개정 후 내용을 명확하게 비교하여 이용자가 알기 쉽도록 표시합니다. <br>⑤ “몰”이 약관을 개정할 경우에는 그 개정약관은 그 적용일자 이후에 체결되는 계약에만 적용되고 그 이전에 이미 체결된 계약에 대해서는 개정 전의 약관조항이 그대로 적용됩니다. 다만 이미 계약을 체결한 이용자가 개정약관 조항의 적용을 받기를 원하는 뜻을 제3항에 의한 개정약관의 공지기간 내에 “몰”에 송신하여 “몰”의 동의를 받은 경우에는 개정약관 조항이 적용됩니다.<br>⑥ 이 약관에서 정하지 아니한 사항과 이 약관의 해석에 관하여는 전자상거래 등에서의 소비자보호에 관한 법률, 약관의 규제 등에 관한 법률, 공정거래위원회가 정하는 전자상거래 등에서의 소비자 보호지침 및 관계법령 또는 상관례에 따릅니다.</p>\r\n");
      out.write("                    <p>제4조(서비스의 제공 및 변경) <br>① “몰”은 다음과 같은 업무를 수행합니다.<br>&nbsp; 1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결<br>&nbsp; 2. 구매계약이 체결된 재화 또는 용역의 배송<br>&nbsp; 3. 기타 “몰”이 정하는 업무<br>② “몰”은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된 재화 또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.<br>③ “몰”이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 재화등의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한 주소로 즉시 통지합니다.<br>④ 전항의 경우 “몰”은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, “몰”이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.</p>\r\n");
      out.write("                    <p>제5조(서비스의 중단) <br>① “몰”은 컴퓨터 등 정보통신설비의 보수점검?교체 및 고장, 통신의 두절 등의 사유가 발생한 경우에는 서비스의 제공을 일시적으로 중단할 수 있습니다.<br>② “몰”은 제1항의 사유로 서비스의 제공이 일시적으로 중단됨으로 인하여 이용자 또는 제3자가 입은 손해에 대하여 배상합니다. 단, “몰”이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.<br>③ 사업종목의 전환, 사업의 포기, 업체 간의 통합 등의 이유로 서비스를 제공할 수 없게 되는 경우에는 “몰”은 제8조에 정한 방법으로 이용자에게 통지하고 당초 “몰”에서 제시한 조건에 따라 소비자에게 보상합니다. 다만, “몰”이 보상기준 등을 고지하지 아니한 경우에는 이용자들의 마일리지 또는 적립금 등을 “몰”에서 통용되는 통화가치에 상응하는 현물 또는 현금으로 이용자에게 지급합니다.</p>\r\n");
      out.write("                    \r\n");
      out.write("                \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.servletContext.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/popup.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <label class=\"checkbox1\">\r\n");
      out.write("                    <input type=\"checkbox\" name=\"chk\">&nbsp;&nbsp;&nbsp;이용약관에 동의 합니다.\r\n");
      out.write("                </label>\r\n");
      out.write("\r\n");
      out.write("                 <!-- 팝창????????????? -->\r\n");
      out.write("                 <div class=\"assignment2\">\r\n");
      out.write("                 <ul class=\"context2\">[필수]개인정보 동의</ul>\r\n");
      out.write("                <button class=\"buttoncontext2\" id=\"button2\">개인정보약관</button>\r\n");
      out.write("                <div class=\"popup\" id=\"popup1\">\r\n");
      out.write("                    <div class=\"popup-content\">\r\n");
      out.write("                      <span class=\"close\" id=\"closePopup1\">&times;</span>\r\n");
      out.write("                      <ul class=\"title\">LJSS 개인정보 수집 동의 약관</ul>\r\n");
      out.write("                    <p>■ 수집하는 개인정보 항목<br>\r\n");
      out.write("                        회사는 회원가입, 상담, 서비스 신청 등등을 위해 아래와 같은 개인정보를 수집하고 있습니다.</p><p>\r\n");
      out.write("                        \r\n");
      out.write("                        ο 수집항목 : 이름 , 생년월일 , 성별 , 로그인ID , 비밀번호 , 비밀번호 질문과 답변 , 자택 전화번호 , 자택 주소 , 휴대전화번호 , 이메일 , 직업 , 회사명 , 부서 , 직책 , 회사전화번호 , 취미 , 결혼여부 , 기념일 , 법정대리인정보 , 서비스 이용기록 , 접속 로그 , 접속 IP 정보 , 결제기록<br>\r\n");
      out.write("                        ο 개인정보 수집방법 : 홈페이지(회원가입) , 서면양식</p><p>\r\n");
      out.write("                        \r\n");
      out.write("                        ■ 개인정보의 수집 및 이용목적</p><p>\r\n");
      out.write("                        \r\n");
      out.write("                        회사는 수집한 개인정보를 다음의 목적을 위해 활용합니다.</p><p>\r\n");
      out.write("                        \r\n");
      out.write("                        ο 서비스 제공에 관한 계약 이행 및 서비스 제공에 따른 요금정산 콘텐츠 제공 , 구매 및 요금 결제 , 물품배송 또는 청구지 등 발송<br>\r\n");
      out.write("                        ο 회원 관리<br>\r\n");
      out.write("                        회원제 서비스 이용에 따른 본인확인 , 개인 식별 , 연령확인 , 만14세 미만 아동 개인정보 수집 시 법정 대리인 동의여부 확인 , 고지사항 전달 ο 마케팅 및 광고에 활용<br>\r\n");
      out.write("                        접속 빈도 파악 또는 회원의 서비스 이용에 대한 통계</p><p>\r\n");
      out.write("                        \r\n");
      out.write("                        ■ 개인정보의 보유 및 이용기간</p><p>\r\n");
      out.write("                        \r\n");
      out.write("                        회사는 개인정보 수집 및 이용목적이 달성된 후에는 예외 없이 해당 정보를 지체 없이 파기합니다.\r\n");
      out.write("                        </p></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.servletContext.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/popup.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("               </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <label class=\"checkbox2\">\r\n");
      out.write("                    <input type=\"checkbox\" name=\"chk\">&nbsp;&nbsp;&nbsp;개인정보 수집 및 이용 동의 합니다.\r\n");
      out.write("                </label>\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.servletContext.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/checkall.js\"></script>\r\n");
      out.write("                \r\n");
      out.write("                <button type = \"submit\" id=\"enrollBtn\" class =\"login-btn\" disabled>SING UP</button>\r\n");
      out.write("                \r\n");
      out.write("                <script>\r\n");
      out.write("	// 아이디 중복체크 아직 안하는 경우 : 메세지 보여지지 않고 버튼 비활성화\r\n");
      out.write("	// 아이디 중복체크 후 사용불가능한 아이디일 경우 : 메세지로 \"중복아이디 존재 사용불가능\" 띄워주고 버튼 비활성화\r\n");
      out.write("	// 아이디 중복체크 후 사용가능한 아이디일 경우 : 메세지로 \"사용 가능한 아이디\" 띄워주고 버튼 활성화\r\n");
      out.write("  	// 중복체크 나중에 \r\n");
      out.write("\r\n");
      out.write("    	function idCheckValidate(num){ \r\n");
      out.write("    		\r\n");
      out.write("    		if(num == 0){ // 아직 중복체크를 하지 않는 경우 (아이디 적어도 5글자 이상은 되어야만 본격적으로 중복체크할 꺼임)\r\n");
      out.write("    			$(\"#checkResult\").hide();\r\n");
      out.write("    			$(\"#enrollBtn\").attr(\"disabled\", true);\r\n");
      out.write("    			\r\n");
      out.write("    		}else if(num == 1){ // 중복된 아이디가 존재할 경우 \r\n");
      out.write("    			$(\"#checkResult\").css(\"color\", \"red\").text(\"중복된 아이디가 존재합니다. 사용이 불가능합니다.\");\r\n");
      out.write("    			$(\"#checkResult\").show();\r\n");
      out.write("    			$(\"#enrollBtn\").attr(\"disabled\", true);\r\n");
      out.write("    			\r\n");
      out.write("    		}else if(num == 2){ // 중복된 아이디가 존재하지 않을 경우 ->사용 가능\r\n");
      out.write("    			$(\"#checkResult\").css(\"color\", \"green\").text(\"사용 가능한 아이디입니다. \");\r\n");
      out.write("    			$(\"#checkResult\").show();\r\n");
      out.write("    			$(\"#enrollBtn\").removeAttr(\"disabled\");\r\n");
      out.write("    			\r\n");
      out.write("    		}\r\n");
      out.write("    		\r\n");
      out.write("    	}\r\n");
      out.write("		$(function(){\r\n");
      out.write("    		\r\n");
      out.write("			let $idInput = $(\"#enrollForm input[name=memId]\"); // 아이디 입력하는 input 요소\r\n");
      out.write("    		\r\n");
      out.write("    		$idInput.keyup(function(){\r\n");
      out.write("    			\r\n");
      out.write("    			// 아이디는 최소 5글자 ~ \r\n");
      out.write("    			if($idInput.val().length >= 4){ // 5글자 이상되었을 때 본격적으로 중복체크\r\n");
      out.write("    				\r\n");
      out.write("   					$.ajax({\r\n");
      out.write("   						url:\"idCheck\",  //idCheck는 mapper에서 정확하게 고침!!\r\n");
      out.write("   						data:{memId:$idInput.val()},\r\n");
      out.write("   						type:\"post\",\r\n");
      out.write("   						success:function(result){\r\n");
      out.write("   							if(result > 0){ //   중복된 아이디 존재\r\n");
      out.write("   								idCheckValidate(1);\r\n");
      out.write("   							}else{\r\n");
      out.write("   								idCheckValidate(2);\r\n");
      out.write("   							}\r\n");
      out.write("   						},error:function(){ \r\n");
      out.write("   							console.log(\"아이디 중복체크용 ajax 통신 실패\");\r\n");
      out.write("   						}\r\n");
      out.write("   					});\r\n");
      out.write("   					\r\n");
      out.write("    			}else{\r\n");
      out.write("    				idCheckValidate(0);\r\n");
      out.write("    			}\r\n");
      out.write("    			\r\n");
      out.write("    		});\r\n");
      out.write("    	});\r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("     			\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("             </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
