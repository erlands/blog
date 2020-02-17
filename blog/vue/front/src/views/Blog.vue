<template>
    <section>
      <my-nav :num="2"></my-nav>
      <!-- EditorMD -->
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/yremp/editormd/css/editormd.css">
      <header class="masthead text-white text-center"
              style="background-image: url('http://blackrockdigital.github.io/startbootstrap-clean-blog/img/home-bg.jpg')">
        <div class="overlay"></div>
        <div class="container">
          <div class="row">
            <div class="col mx-auto text-left pl-5">
              <h1>FS-Blog</h1>
              <h3>记录技术成长点滴</h3>
            </div>
          </div>
        </div>
      </header>
      <div class="container container-fluid mt-5 mb-5">
        <div class="row">
          <!-- 左侧 -->
          <div class="col-md-8">
            <ul class="list-unstyled">
              <div class="card mt-3">
                <section v-if="list !== null && list.length > 0">
                  <div v-for="(item,i) in list" :key="i" class="card-body">
                    <a @click="article(item.id)" href="javascript:void(0)" class="text-dark"><h4
                            class="card-title font-weight-bold">{{item.title}}</h4>
                    </a>
                    <p class="card-text">{{item.description}}</p>
                    <p class="text-right text-secondary">{{item.dateTime}}</p>
                  </div>
                </section>
                <div v-if="list === null || list.length === 0" class="card border-danger mt-3 mb-3">
                  <div class="card-body text-danger">
                    <h2 class="card-title"><i class="fa fa-warning fa-1x"></i> 抱歉，没有找到相关内容</h2>
                    <p class="card-text">试试其他关键字？</p>
                  </div>
                </div>
            </div>
            </ul>
          </div>
          <!-- 右侧 -->
          <div class="col-md-4 mt-3">
            <div class="card mb-3">
              <div class="card-header">
                搜索文章
              </div>
              <div class="card-body">
                <div class="input-group">
                  <input v-model="params.name" type="text" class="form-control" placeholder="输入你想查找的题目..."
                                   aria-label="输入你想查找的题目...">
                  <span class="input-group-btn">
                    <el-button @click="search">搜索</el-button>
                  </span>
                </div>
              </div>
            </div>
            <div v-if="tags !== null && tags.length > 0" class="card mb-3">
              <div class="card-header">
                热门标签
              </div>
              <div class="card-body">
                <!-- tag -->
                <button v-for="(tag, i) in tags"
                  :key="i" type="button"
                  class="btn btn-outline-primary mb-3"
                  @click="selectTag(tag.tagId)">
                  {{tag.tagName}} <span class="badge badge-primary">{{tag.articleCount}}</span>
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
</template>

<script>
import '../assets/css/public.css'
import { postListApi, tagListApi } from '../api/api.js'
export default {
    name: 'blog',
    data: function () {
      return {
        list: [],
        tags: [],
        params: {}
      }
    },
    methods: {
      getList: function () {
        let url = postListApi
        let props = Object.keys(this.params)
        if (props && props.length > 0) {
          url = url + '?'
          props.forEach((v, i) => {
            let value = this.params[v]
            if (value !== null) {
              url = url + v + '=' + value + '&'
            }
          })
          let i = url.lastIndexOf('&')
          if (i !== -1 && i === (url.length - 1)) {
            url = url.substring(0, url.length - 1)
          }
        }
        this.$http.get(url).then((res) => {
          this.list = res
        })
      },
      getTags: function () {
        let url = tagListApi
        this.$http.get(url).then((res) => {
          this.tags = res
        })
      },
      selectTag: function (id) {
        this.params.name = null
        this.params.tagId = id
        this.getList()
      },
      search: function () {
        this.params.tagId = null
        this.getList()
      },
      article: function (id) {
        this.$router.push('/article/' + id)
      }
    },
    created: function () {
      this.getList()
      this.getTags()
    }
}
</script>
