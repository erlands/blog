<template>
  <section>
    <my-nav :num="1"></my-nav>
    <header>
        <div id="slideIndicators" class="carousel slide" data-ride="carousel" data-interval="3000" data-pause="">
        <ol class="carousel-indicators">
            <li data-target="#slideIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#slideIndicators" data-slide-to="1"></li>
            <li data-target="#slideIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
            <!-- Slide One - Set the background image for this slide in the line below -->
            <div class="carousel-item active"
                style="background-image: url('http://r.tohsaka.top/group1/M00/00/00/rB_qBl4AOBGACXxpAAD_IetA0tc804_big.jpg')">
            <div class="carousel-caption d-none d-md-block">
                <h3 class="txt_shadow">优秀的判断力来自经验，但经验来自错误的判断</h3>
                <p class="txt_shadow">Good judgment comes from experience, but experience comes from bad judgment.</p>
            </div>
            </div>
            <!-- Slide Two - Set the background image for this slide in the line below -->
            <div class="carousel-item"
                style="background-image: url('https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1515063190806&di=71bdda130cdedcd895e5a3d476a89081&imgtype=0&src=http%3A%2F%2Fimg.pconline.com.cn%2Fimages%2Fupload%2Fupc%2Ftx%2Fitbbs%2F1309%2F16%2Fc18%2F25748320_1379313651110.jpg')">
            <div class="carousel-caption d-none d-md-block">
                <h3 class="txt_shadow">我不是一个伟大的程序员，我只是一个具有良好习惯的优秀程序员</h3>
                <p class="txt_shadow">I am not a great programmer, I am just a good programmer with good habits. </p>
            </div>
            </div>
            <!-- Slide Three - Set the background image for this slide in the line below -->
            <div class="carousel-item"
                style="background-image: url('http://r.tohsaka.top/group1/M00/00/00/rB_qBl4Ap0KAII4UABDAx1DN22c252_big.png')">
            <div class="carousel-caption d-none d-md-block">
                <h3 class="txt_shadow">你们中大多数人都熟悉程序员的美德，有三种：那就是懒惰、急躁和傲慢</h3>
                <p class="txt_shadow">Most of you are familiar with the programmer's virtues, and there are three: laziness,
                    impatience, and arrogance. </p>
            </div>
            </div>
        </div>
        </div>
    </header>
    <!-- Page Content -->
    <section class="py-5">
        <div class="container container-fluid">
            <h1>全栈之路 —— 摆码王子的个人博客</h1>
        </div>
    </section>
    </section>
</template>
