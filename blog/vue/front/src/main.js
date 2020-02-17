// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import axios from 'axios'
import QS from 'qs'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min'
import 'font-awesome/css/font-awesome.min.css'
import { MyNav, MyFooter } from './components/index.js'

Vue.prototype.qs = QS

Vue.config.productionTip = false
Vue.prototype.$http = axios

Vue.use(ElementUI)
Vue.use(MyNav)
Vue.use(MyFooter)

axios.interceptors.response.use((config) => {
  if (config.status === 200) {
    return config.data
  }
})

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
