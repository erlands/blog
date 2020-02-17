import myNav from './MyNav.vue'
import myFooter from './myFooter.vue'

export const MyNav = {
    install: function (Vue) {
        Vue.component('MyNav', myNav)
    }
}

export const MyFooter = {
    install: function (Vue) {
        Vue.component('MyFooter', myFooter)
    }
}
