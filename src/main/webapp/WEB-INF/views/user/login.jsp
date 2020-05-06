<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="../include/header.jsp" %>

	<!-- main content -->
	<section class="content">
		<div class="row">
			<!-- left column -->
			<div class="col-md-12">
				<!-- general form elements -->
				<div class="box">
					<div class="box-header with-border">
						<div class="box-title">LOGIN</div>
						<div class="box-body">
							<form action="/user/loginPost" method="post">
								<div class="form-group has-feedback">
									<input type="text" name="uid" class="form-control" placeholder="아이디를 입력하세요.">
									<span class="glyphicon glyphicon-lock form-control-feedback"></span>									
								</div>
								<div class="form-group has-feedback">
									<input type="text" name="upw" class="form-control" placeholder="비밀번호를 입력하세요.">
									<span class="glyphicon glyphicon-lock form-control-feedback"></span>									
								</div>
								<div class="row">
									<div class="col-xs-8">
										<div class="checkbox icheck">
											<label>
												<input type="checkbox" name="useCookie"> 기억하기
											</label>
										</div>
									</div>
									<div class="col-xs-4">
										<button type="submit" class="btn btn-primary btn-block btn-flat">로그인</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
<%@ include file="../include/footer.jsp" %>
