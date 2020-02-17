<template>
    <section>
      <!-- EditorMD -->
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/yremp/editormd/css/editormd.css">
      <my-nav :num="3"></my-nav>
      <div v-if="article && article !== null" class="container container-fluid cus_content">
        <!-- 博客标题 -->
        <div class="row mt-md-5"></div>
        <div class="row mt-md-5">
          <!-- 博客内容 -->
          <div class="col-md-8 offset-md-2">
          <h3 class="p-3 font-weight-bold">{{article.title}}</h3>
          <div class="row pl-3 pr-3">
            <div class="col-md-6"></div>
              <div class="col-md-6 text-md-right">
                  <p class="small text-secondary">{{article.dateTime}}</p>
              </div>
            </div>
            <div v-html="article.htmlMaterial"></div>
          </div>
        </div>
        <div class="row mb-md-5"></div>
      </div>
      <div v-if="article === null" class="container container-fluid cus_content">
          <div class="row mt-md-5"></div>
          <div class="row mt-md-5">
            <div class="col-md-8 offset-md-2">
              <h3 class="p-3 font-weight-bold">文章不存在,看看别的吧</h3>
            </div>
          </div>
      </div>
    </section>
</template>

<script>
import '../assets/css/public.css'
import { articleApi } from '../api/api.js'
export default {
    name: 'Article',
    data: function () {
        return {
            id: this.$route.params.id,
            article: null
        }
    },
    methods: {
        getArticle: function () {
            let url = articleApi + '/' + this.id
            this.$http.get(url).then((res) => {
                if (res === '') {
                    this.article = null
                } else {
                    this.article = res
                }
            })
        }
    },
    created: function () {
        this.getArticle()
    }
}
</script>
