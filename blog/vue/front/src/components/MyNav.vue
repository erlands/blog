<template>
    <nav class="navbar navbar-expand-xl navbar-dark bg-dark fixed-top">
    <!-- Logo 位置 -->
    <div class="container-fluid">
      <img class="mr-3" alt="Logo"
             src="@/assets/img/logo.png" style="max-width: 30px"/>
      <a class="navbar-brand" href="#">
        FS-Blog
      </a>
      <!-- 响应式导航下拉按钮 -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <!-- s 左侧导航 -->
        <ul class="nav navbar-nav">
          <li class="nav-item">
              <a class="nav-link"><!-- 占位 --></a>
          </li>
          <li v-if="num === 1" class="nav-item active">
            <router-link class="nav-link" to="/">首页</router-link>
          </li>
          <li v-if="num !== 1" class="nav-item">
            <router-link class="nav-link" to="/">首页</router-link>
          </li>

          <li v-if="num === 2" class="nav-item active">
            <router-link class="nav-link" to="/blog">博客</router-link>
          </li>
          <li v-if="num !== 2" class="nav-item">
            <router-link class="nav-link" to="/blog">博客</router-link>
          </li>
          <!--<li class="nav-item active">
              <a class="nav-link" href="/resume">关于</a>
          </li>-->
          <li class="nav-item">
              <a class="nav-link" href="#"></a>
          </li>
        </ul>
        <!-- s 右侧导航 -->
        <ul class="nav navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" href="/userregister">注册</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/userlogin">登录</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>
<script>
export default {
  name: 'my-nav',
  data: function () {
      return {}
  },
  props: {
      num: Number
  }
}
</script>
