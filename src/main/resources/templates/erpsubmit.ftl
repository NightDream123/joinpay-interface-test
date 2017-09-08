<!DOCTYPE html>
<html>
<head>
<#include "common/head.ftl"/>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <header class="main-header">

        <!-- Logo -->
        <a href="index.ftl" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>A</b>LT</span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>Admin</b>LTE</span>
        </a>

        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>

        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="${request.contextPath}/adminlte/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>Alexander Pierce</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                </div>
            </div>
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu" data-widget="tree">
                <li class="header">MAIN NAVIGATION</li>
                <li class="active treeview menu-open">
                    <a href="#">
                        <i class="fa fa-dashboard"></i> <span>ERP接口测试</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="erpsubmit.ftl"><i class="fa fa-circle-o"></i> 开发</a></li>
                        <li class="active"><a href="index.ftl"><i class="fa fa-circle-o"></i> 测试</a></li>
                    </ul>
                </li>
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                Dashboard
                <small>Version 2.0</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li class="active">Dashboard</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="box box-info" style="width: 60%;margin:0px auto;margin-top: 20px">
                <div class="box-header with-border">
                    <h3 class="box-title">Horizontal Form</h3>
                </div>
                <!-- /.box-header -->
                <!-- form start -->
                <form class="form-horizontal" action="${request.contextPath}/erp/test" method="post">
                    <div class="box-body">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">商户编号(必填)</label>

                            <div class="col-sm-10">
                                <input type="number" class="form-control" name="p1_MerchantNo" placeholder="请输入商编" value="888100079922082">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label">商户订单号(必填)</label>

                            <div class="col-sm-10">
                                <input type="number" class="form-control" name="p2_OrderNo" placeholder="请输入商户订单号" value="201702324142499924">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">金额(必填)</label>

                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="p3_Amount" placeholder="请输入订单金额" value="0.01">
                            </div>
                        </div>
                        <input type="hidden" class="form-control" name="p4_Cur" value="1">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">产品名称(必填)</label>

                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="p5_ProductName" placeholder="请输入产品名称">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">产品描述(非必填)</label>

                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="p6_ProductDesc" placeholder="请输入产品描述">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">页面通知地址(非必填)</label>

                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="p7_ReturnUrl" placeholder="请输入页面通知地址">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">后台通知地址(必填)</label>

                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="p8_NotifyUrl" placeholder="请输入后台通知地址">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">业务代码(必填)</label>

                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="q1_FrpCode" placeholder="例:PAY_ACTION_CARD">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">终端号(必填)</label>

                            <div class="col-sm-10">
                                <input type="number" class="form-control" name="q2_TerminalNo" placeholder="请输入终端号" value="10018693">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label">接口地址</label>

                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="url" value="http://localhost:8080/trade/erp_createPosTrade.action">
                            </div>
                        </div>
                    </div>
                    <!-- /.box-body -->
                    <div class="box-footer">
                        <button type="submit" class="btn btn-default">Cancel</button>
                        <button type="submit" class="btn btn-info pull-right">Sign in</button>
                    </div>
                    <!-- /.box-footer -->
                </form>
            </div>
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

<#include "common/foot.ftl"/>

</div>
<!-- ./wrapper -->

<!-- jQuery 3 -->
<#include "common/commonjs.ftl"/>
</body>
</html>
