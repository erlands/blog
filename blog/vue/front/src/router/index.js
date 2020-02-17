import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/Home'
import Blog from '@/views/Blog'
import Article from '@/views/Article'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    }, {
      path: '/blog',
      name: 'Blog',
      component: Blog
    }, {
      path: '/article/:id',
      name: 'article',
      component: Article
    }
  ]
})
