<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>APP开发者平台</title>
    <%@include file="/common/head.jsp" %>
</head>

<body class="login">
<div>
    <a class="hiddenanchor" id="signup"></a>
    <a class="hiddenanchor" id="signin"></a>

    <div class="login_wrapper">
        <div class="animate form login_form">
            <section class="login_content">
                <form action="${prc}/dev/doLogin" method="post">
                    <h1>APP开发者平台</h1>
                    <div>
                        <input type="text" class="form-control" name="devCode" placeholder="请输入用户名" required=""/>
                    </div>
                    <div>
                        <input type="password" class="form-control" name="devPassword" placeholder="请输入密码" required=""/>
                    </div>
                    <span style="color: red;font-size: 18px">${error}</span>
                    <br/>
                    <br/>
                    <div>
                        <button type="submit" class="btn btn-success">登 录</button>
                        <button type="reset" class="btn btn-default">重　填</button>
                    </div>

                    <div class="clearfix"></div>

                    <div class="separator">
                        <div>
                            <p>©2016 All Rights Reserved. </p>
                        </div>
                    </div>
                </form>
            </section>
        </div>
    </div>
</div>
</body>
</html>