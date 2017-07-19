<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
	<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>买卖电动车小程序管理平台</title>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link href="/html/cms/websiteui/css/default.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="/html/cms/websiteui/js/themes/default/easyui.css" />
    <script type="text/javascript" src="/html/cms/websiteui/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="/html/cms/websiteui/js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src='/html/cms/websiteui/js/XiuCai.index.js'> </script>
    <script type="text/javascript">
        $(function() {
            $('#loginOut').click(function() {
                $.messager.confirm('系统提示', '您确定要退出本次登录吗?', function(r) {
                    if (r) {
                        location.href = '/loginOut.action';
                    }
                });
            })
        });
    </script>

</head>
	<body class="easyui-layout" style="overflow-y: hidden" fit="true" scroll="no">
		<noscript>
		<div style=" position:absolute; z-index:100000; height:2046px;top:0px;left:0px; width:100%; background:white; text-align:center;">
		    <img src="/html/cms/websiteui/images/noscript.gif" alt='抱歉，请开启脚本支持！' />
		</div>
		</noscript>

		<div id="loading-mask" style="position:absolute;top:0px; left:0px; width:100%; height:100%; background:#D2E0F2; z-index:20000">
		<div id="pageloading" style="position:absolute; top:50%; left:50%; margin:-120px 0px 0px -120px; text-align:center; 
			border:2px solid #8DB2E3; width:200px; height:40px; font-size:14px;padding:10px; font-weight:bold; background:#fff; color:#15428B;"> 
		    <img src="/html/cms/websiteui/images/loading.gif" align="absmiddle" />&nbsp;正在加载中,请稍候...</div>
		</div>

		<div region="north" split="true" border="false" style="overflow: hidden; height: 55px;
			background: url(/html/cms/websiteui/images/62250.png) #7f99be repeat-x center 50%; 
			line-height: 50px; color: #fff; font-family: Verdana, 微软雅黑, 黑体">
			<span style="float: right; padding-right: 15px;" class="head">
				<s:property value="#request.dateTime" />&nbsp;&nbsp;
				星期<s:property value="#request.week" />&nbsp;&nbsp;|&nbsp;&nbsp;
				欢迎：<font color="#B3FE01">${managers_user.name}</font>&nbsp;&nbsp;|&nbsp;
				<a href="javascript:void(0);" id="loginOut">安全退出</a>
			</span>
			<span style="padding-left: 20px; font-size: 18px; font-family: 微软雅黑;"><!-- <img src="/cms/websiteui/images/favicon.ico" width="32" height="32" align="absmiddle" /> -->&nbsp;小程序管理平台</span>
		</div>
		
		<div region="west" split="true" title="导航菜单" style="width: 180px;" id="west">
			<div id="nav">
				<!-- 导航菜单 -->
			</div>
		</div>
		
		<div id="mainPanle" region="center" style="background: #eee; overflow-y:hidden">
	        <div id="tabs" class="easyui-tabs"  fit="true" border="false" >
				<div title="欢迎使用" style="padding:20px;overflow:hidden; color:red; " ></div>
			</div>
	    </div>
		
		<!-- 底部那一小行 -->
		<div region="south" split="true" style="height: 30px; background: #D2E0F2;">
			<div class="footer">买卖电动车小程序管理平台</div>
		</div>

		<div id="mm" class="easyui-menu" style="width: 150px;">
			<div id="tabupdate">刷新</div>
			<div id="close">关闭</div>
			<div id="closeall">全部关闭</div>
			<div id="closeother">除此之外全部关闭</div>
			<div class="menu-sep"></div>
			<div id="closeright">当前页右侧全部关闭</div>
			<div id="closeleft">当前页左侧全部关闭</div>
		</div>
		
	</body>
</html>