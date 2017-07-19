<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>买卖电动车小程序管理平台</title>
		<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
		<link href="/html/cms/css/login.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="/js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript">
		if(window!=top){
			top.location.href=location.href;
		}
		function checkInput() {
			var name = $("#name").val();
			var password = $("#psd").val();
			if (name==""){
				alert("请输入用户名！");
				return false;
			}
			if (password==""){
				alert("请输入密码！");
				return false;
			}
			return true;
		}
		$(function(){
			$("#name").focus();
		});
    </script>
	</head>
	<body>
		<div class="index">
			<div class="content">
				<div class="title_bg"><p class="title">&nbsp;买卖电动车小程序管理平台</p></div>
				<form action="/login.action" method="post" onsubmit="return checkInput();">
					<div class="title_bg2">
						<input type="text" class="text_s1" name="name" id="name" title="登录名" />
						<input type="password" class="text_s2" name="psd" id="psd" title="登录密码" />
					</div>
					<p style="color: red;">${error}</p>
					<div class="login"><input type="submit" value="" class="btn_s" /></div>
					<div class="helpcell">技术支持：浙江慧通广告有限公司&nbsp;技术中心</div>
				</form>
			</div>
		</div>
		<img border='0' src='/html/cms/images/Background.jpg' width='100%' height='100%'
			style='position: absolute; left: 0px; top: 0px; z-index: -1' />
	</body>
</html>
